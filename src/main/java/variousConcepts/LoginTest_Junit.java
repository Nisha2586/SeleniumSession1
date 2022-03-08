package variousConcepts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is Before class.This will happen only once before all the methods in every class.");
		System.out.println("Since it is class level ,it should be static");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("This is After class.This will happen only once after all the methods in every class.");
		System.out.println("Since it is class level ,it should be static");
	}
    @Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=dashboard/");

	}

	@Test
	public void testCase() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.className("btn btn-success block full-width")).click();
		//driver.findElement(By.linkText("4069974005")).click();//orders//list all orders//first order.
		//driver.findElement(By.partialLinkText("406997")).click();
	}
	@Test
	public void negtestCase() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123asds");
		driver.findElement(By.name("login1")).click();//ctrl+f will help for the word search

	}
	@After
	public void tearDown() {
		driver.close();// closes current browser
		driver.quit();// closes all the tab and instance we are creating.

	}

}
