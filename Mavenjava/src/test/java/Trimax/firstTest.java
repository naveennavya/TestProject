package Trimax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firstTest {
	@Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Naveen\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.quit();
		
	}

}
