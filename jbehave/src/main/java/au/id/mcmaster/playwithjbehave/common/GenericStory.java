package au.id.mcmaster.playwithjbehave.common;

import static java.util.Arrays.asList;

import org.jbehave.core.ConfigurableEmbedder;
import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryPathResolver;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;


public class GenericStory extends ConfigurableEmbedder {
	
	@Override
	public Configuration configuration() {
		MostUsefulConfiguration configuration = new MostUsefulConfiguration();
		configuration.useStoryPathResolver(new StoryPathResolver() {
			@Override
			public String resolve(Class<? extends Embeddable> embeddableClass) {
				Story story = embeddableClass.getAnnotation(Story.class);
				String storyFileName = "stories/" + story.name() + ".story";
				return storyFileName;
			}
		});
		configuration.useStoryReporterBuilder(
				new StoryReporterBuilder().withCodeLocation(CodeLocations.codeLocationFromClass(this.getClass()))
						.withFormats(Format.XML, Format.HTML, Format.STATS).withCrossReference(new CrossReference()));
		return configuration;
	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		Class<?>[] stepClasses = this.getClass().getAnnotation(Story.class).steps();
		Object[] stepsInstances = new Object[stepClasses.length];
		try {
			for (int i=0; i<stepClasses.length; i++) {
				stepsInstances[i] = stepClasses[i].newInstance();
			}
			return new InstanceStepsFactory(configuration(), stepsInstances);
		} catch (InstantiationException|IllegalAccessException e) {
			throw new RuntimeException("Could not create all of the required steps.", e);
		}
	}

	@Test
	public void run() throws Throwable {
		Embedder embedder = configuredEmbedder();
		StoryPathResolver pathResolver = embedder.configuration().storyPathResolver();
		String storyPath = pathResolver.resolve(this.getClass());
		try {
			embedder.runStoriesAsPaths(asList(storyPath));
		} finally {
			embedder.generateCrossReference();
		}
	}
}
