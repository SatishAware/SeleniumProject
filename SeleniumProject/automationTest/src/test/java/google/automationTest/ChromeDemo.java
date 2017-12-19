package google.automationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeDemo {

	
@Test
public void test()
{

  System.setProperty("webdriver.chrome.driver","F:\\Selenium\\drivers\\chromedriver.exe");


  WebDriver driver = new ChromeDriver();

  driver.get("http://www.facebook.com");

  System.out.println("Application title is ============="+driver.getTitle());

  driver.quit();
}
}