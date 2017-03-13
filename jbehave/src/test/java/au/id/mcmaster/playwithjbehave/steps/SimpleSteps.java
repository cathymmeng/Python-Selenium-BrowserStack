package au.id.mcmaster.playwithjbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import junit.framework.Assert;

public class SimpleSteps {
	@Given("step represents a precondition to an event")
	public void step01() {
		System.out.println("Step01");
	}
	@When("step represents the occurrence of the event")
	public void when01() {
		System.out.println("When01");
	}
	@Then("step represents the outcome of the event")
	public void then01() {
		System.out.println("Then01");
	}
	@Given("a precondition")
	public void given02() {
		System.out.println("Step02");	
	}
	@When("a negative event occurs")
	public void when02() {
		System.out.println("When02");
	}
	@Then("a the outcome should be captured")
	public void then02() {
		System.out.println("Then02");
	}
}
