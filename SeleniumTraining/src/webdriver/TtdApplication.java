package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TtdApplication {

	public static void main(String [] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/users/Sadhana/Documents/WorkHard/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		Thread.sleep(6000);
		// driver.findElement(By.id("individual")).click();
		
		
		driver.findElement(By.name("fName")).sendKeys("Sadhana");
		//driver.findElement(By.xpath("/html/body/div[11]/div[4]/div/div[1]/form/div[1]/div[2]/div[1]")).sendKeys("sadhana");
	//	driver.findElement(By.xpath("//*[@id='indiMobile']")).sendKeys("43535635");

		
		
	}
	
	
}
