package au.id.mcmaster.playwithjbehave.adapter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAdapter {
	{
		// This needs to be externalized
		System.setProperty("webdriver.chrome.driver","../behave/drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver","../behave/drivers/geckodriver");		
	}
	
	public WebDriver createWebDriver(String browser) {
		if ("chrome".equals(browser)) {
			return new ChromeDriver();
		}
		else if ("firefox".equals(browser)) {
			return new FirefoxDriver();
		}
		else
		{
			throw new RuntimeException("Browser not supported: " + browser);
		}
	}
	
	public boolean isSeleniumAvailable() {
		try {
			Class.forName("org.openqa.selenium.firefox.FirefoxDriver");
		} catch (ClassNotFoundException e) {
			return false;
		}
		return true;
	}
}
