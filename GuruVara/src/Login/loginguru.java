package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginguru {
	
	public static void logtest(WebDriver driver) throws InterruptedException {
		driver.findElement(By.name("uid")).sendKeys("mngr120004");
		driver.findElement(By.name("password")).sendKeys("avEgUry");
		Thread.sleep(5000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		 
	}
	

}
