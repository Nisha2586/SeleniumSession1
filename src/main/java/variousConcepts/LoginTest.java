package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\NISHA\\eclipse-workspace\\selenium_Maven\\crm\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://techfios.com/billing/?ng=dashboard/");
//		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//		driver.findElement(By.id("password")).sendKeys("abc123");
//		driver.findElement(By.name("login")).click();
//		driver.close();//closes current browser
//		driver.quit();//closes all the tab and instance we are creating.
		
		launchBrowser();
		testCase();
		tearDown();

	}
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		
	}
public static void testCase() {
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();
	
}
public static void tearDown() {
	driver.close();//closes current browser
	driver.quit();//closes all the tab and instance we are creating.
	
}
}

