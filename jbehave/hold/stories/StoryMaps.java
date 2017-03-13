package au.id.mcmaster.playwithjbehave.stories;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStoryMaps;
import org.jbehave.core.reporters.StoryReporterBuilder;
import static java.util.Arrays.asList;

public class StoryMaps extends JUnitStoryMaps {
    
    public StoryMaps() {
        configuredEmbedder().useMetaFilters(metaFilters());
    }
 
    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
            .useStoryReporterBuilder(new StoryReporterBuilder()
                .withCodeLocation(CodeLocations.codeLocationFromClass(this.getClass())));
    }
 
    @Override
    protected List<String> metaFilters() {
        return asList("+author *", "theme *","-skip");
    }
 
    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(this.getClass()), "**/*.story", "");
                 
    }
         
}