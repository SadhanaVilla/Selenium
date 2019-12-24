package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_facebook {
	
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "/users/Sadhana/Documents/WorkHard/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Sadhana");
		driver.findElement(By.name("pass")).sendKeys("******");
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
