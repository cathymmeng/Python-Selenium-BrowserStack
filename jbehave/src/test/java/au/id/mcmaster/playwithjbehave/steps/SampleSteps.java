package au.id.mcmaster.playwithjbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleSteps {
	private static final Logger log = LoggerFactory.getLogger(SampleSteps.class);
	
	@Given("step represents a precondition to an event")
	public void step01() {
		log.info("Step01");
	}
	@When("step represents the occurrence of the event")
	public void when01() {
		log.info("When01");
	}
	@Then("step represents the outcome of the event")
	public void then01() {
		log.info("Then01");
	}
	@Given("a precondition")
	public void given02() {
		log.info("Step02");	
	}
	@When("a negative event occurs")
	public void when02() {
		log.info("When02");
	}
	@Then("a the outcome should be captured")
	public void then02() {
		log.info("Then02");
	}
}
