package au.id.mcmaster.playwithjbehave.steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.id.mcmaster.playwithjbehave.adapter.GoogleAdapter;

public class GoogleSteps {
	private static final Logger log = LoggerFactory.getLogger(GoogleSteps.class);

	private GoogleAdapter googleAdapter = new GoogleAdapter();
	
	@Given("that Selenium is installed")
	public void checkThatSeleniumIsInstalled() {
		log.info("Checking Selenium is installed");
	}
	
	@When("loading the $url url")
	@Alias("the $url url is loaded")
	public void LoadingURL(String url) {
		log.info("loading url: " + url);
		googleAdapter.loadURL(url);
	}
	
	@Then("status should be $status")
	public void checkStatus(String status) {
		log.info("Required Status: " + status);
	}
	
	@Then("I am able to enter search string into a field")
	public void thenIAmAbleToEnterSearchStringIntoAField() 
			throws InterruptedException {
		googleAdapter.setSearchField("Selenium Documentation");
		googleAdapter.pressSearchButton();
		String searchResults = googleAdapter.getSearchResult();
		System.out.println("***** Google Results:\n" + searchResults);
		googleAdapter.close();
	}
}
