package homeWork;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TFpage {
	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver_108.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//span[text()='Bank & Cash']")).click();
		driver.findElement(By.xpath("//a[text()='New Account']")).click();
		driver.findElement(By.xpath("//input[@name='account']")).sendKeys("Selenium125");
		driver.findElement(By.xpath("//input[@name='description']")).sendKeys("New Account50");
		driver.findElement(By.xpath("//input[@name='balance']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@name='account_number']")).sendKeys("9385038290");
		driver.findElement(By.xpath("//input[@name='contact_person']")).sendKeys("AP");
		driver.findElement(By.xpath("//input[@name='contact_phone']")).sendKeys("2319876543");
		driver.findElement(By.xpath("//button[text()=' Submit']")).click();
		
		
		
		
	}
}
