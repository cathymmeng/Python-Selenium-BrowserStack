package au.id.mcmaster.playwithjbehave.stories;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.reporters.StoryReporterBuilder.Format;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;

import au.id.mcmaster.playwithjbehave.steps.SimpleSteps;

public class SampleStory extends JUnitStory {
	
	  @Override 
	  public Configuration configuration() {
		  MostUsefulConfiguration configuration = new MostUsefulConfiguration();
		configuration.useStoryReporterBuilder(new StoryReporterBuilder()
                .withCodeLocation(CodeLocations.codeLocationFromClass(SampleStory.class))
                .withDefaultFormats()
                .withFormats(Format.XML,Format.HTML)
                .withCrossReference(new CrossReference()));
	    return configuration;
	  }
	  @Override 
	  public InjectableStepsFactory stepsFactory() {
	    return new InstanceStepsFactory(configuration(),
	                                    new SimpleSteps());
	  }
	  
	  @Test
	  public void test() {
		  System.out.println("************ Testing ***********");
	  }
	}