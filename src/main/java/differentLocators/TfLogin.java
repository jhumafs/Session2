package differentLocators;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TfLogin {
	WebDriver driver;
	@Test
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver_108.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

}
