package au.id.mcmaster.playwithjbehave;

import au.id.mcmaster.playwithjbehave.common.GenericStory;
import au.id.mcmaster.playwithjbehave.common.Story;
import au.id.mcmaster.playwithjbehave.steps.SampleSteps;
import au.id.mcmaster.playwithjbehave.steps.GoogleSteps;

public class StorySuite {
	@Story(name = "sample", steps = { SampleSteps.class })
	public static class SampleStory extends GenericStory {}

	@Story(name = "research_on_internet", steps = { GoogleSteps.class })
	public static class SecondStory extends GenericStory {}
}