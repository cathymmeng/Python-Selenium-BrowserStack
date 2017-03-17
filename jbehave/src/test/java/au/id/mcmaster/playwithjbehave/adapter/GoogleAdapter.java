package au.id.mcmaster.playwithjbehave.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleAdapter {
	private static final SeleniumAdapter seleniumAdapter = new SeleniumAdapter();
	
	private WebDriver driver;
	
	public GoogleAdapter()
	{
		chooseBrowser("chrome");
	}
	
	public void chooseBrowser(String browser) {
		this.driver = seleniumAdapter.createWebDriver(browser);
	}
	
	public void loadURL(String url) {
		Wait<WebDriver> wait = new WebDriverWait(driver, 30);
		driver.get("http://www.google.com/");
		wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                System.out.println("Searching ...");
                return true;
            }
        });
	}
	
	public void setSearchField(String searchString) {
		System.out.println("Setting Search Field to: " + searchString);
		WebElement webElement = driver.findElement(By.id("lst-ib"));
		System.out.println(webElement);
		webElement.sendKeys(searchString);
	}
	
	public void pressSearchButton()
	{
        driver.findElement(By.name("btnG")).click();
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                System.out.println("Searching ...");
                return webDriver.findElement(By.id("resultStats")) != null;
            }
        });
	}
	
	public String getSearchResult() {
		List<WebElement> webElements = driver.findElements(By.xpath("//h3[@class='r']/a"));
		return webElements.stream()
			.map(we -> we.getText())
			.collect(Collectors.joining("\n"));
    }
	
	public void close() {
		driver.close();
		driver.quit();
	}
}
