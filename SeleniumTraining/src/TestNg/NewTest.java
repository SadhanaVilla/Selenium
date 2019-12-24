package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;

	@Test
	public void f() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Sadhana");
		driver.findElement(By.name("pass")).sendKeys("******");
		driver.findElement(By.id("loginbutton")).click();
	}

	@AfterMethod
	public void afterMethod() {
	}
     @Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/users/Sadhana/Documents/WorkHard/drivers/chromedriver");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "/users/Sadhana/Documents/WorkHard/drivers/geckodriver");
			driver = new FirefoxDriver();
		}

		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
