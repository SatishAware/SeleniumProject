package google.automationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GeckoDriverDemo {
	@Test
	public void testFirefox()
	{

	    System.setProperty("webdriver.gecko.driver","F:\\Selenium\\drivers\\geckodriver.exe");

	  WebDriver driver = new FirefoxDriver();

	  driver.get("http://www.facebook.com");

	  System.out.println("Application title is ============="+driver.getTitle());

	 
	  driver.quit();
	}


}
