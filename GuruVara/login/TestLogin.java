package packvara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		String url="http://demo.guru99.com/v4/";
		driver.get(url);
		driver.findElement(By.name("uid")).sendKeys("mngr120004");
		driver.findElement(By.name("password")).sendKeys("avEgUry");
		Thread.sleep(5000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("New Customer")).click();
		
		
		
		
		
	}

}
