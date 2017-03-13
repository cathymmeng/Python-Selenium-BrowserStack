package au.id.mcmaster.playwithjbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoogleSteps {
	private static final Logger log = LoggerFactory.getLogger(GoogleSteps.class);
	
	@Given("that Selenium is installed")
	public void checkThatSeleniumIsInstalled() {
		log.info("Checking Selenium is installed");
	}
	@When("loading the $url url")
	public void LoadingURL(String url) {
		log.info("loading url: " + url);
	}
	@Then("status should be $status")
	public void checkStatus(String status) {
		log.info("Status: " + status);
	}
	
	@Then("I am able to enter search string into a field")
	@Pending
	public void thenIAmAbleToEnterSearchStringIntoAField() {
	  // PENDING
	}
}
