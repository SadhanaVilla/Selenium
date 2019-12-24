package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRechargeIt {

	public static void main(String [] args) {
		
	System.setProperty("webdriver.chrome.driver", "/users/Sadhana/Documents/WorkHard/drivers/chromedriver");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://justrechargeit.com/SignIn.aspx");
	
	driver.findElement(By.id("txtUserName")).sendKeys("Sadhana");
	driver.findElement(By.id("txtPasswd")).sendKeys("*****");
	driver.findElement(By.name("imgbtnSignin")).click();	
		
	}
	
	
}
