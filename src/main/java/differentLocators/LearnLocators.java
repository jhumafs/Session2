package differentLocators;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver_108.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	@Test
	public void locatorLearning() {
			driver.findElement(By.id("firstname")).sendKeys("Java");
			driver.findElement(By.name("lastname")).sendKeys("Selenium");
			driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
			driver.navigate().back();
			driver.findElement(By.partialLinkText("TF-API ")).click();
			driver.navigate().back();
			driver.findElement(By.cssSelector("input#sex-1")).click();
			driver.findElement(By.cssSelector("input[id='exp-6']")).click();
			driver.findElement(By.xpath("//input[@id='profession-1']")).click();
			driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\pntma\\Pictures\\Screenshots\\Screenshot (8).png");
			driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/form/div[13]/input")).sendKeys("pasword");
	}
	
	

}
