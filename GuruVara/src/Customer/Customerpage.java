package Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customerpage {
	
	public static void Custpage(WebDriver driver) {
		
		driver.findElement(By.partialLinkText("New Customer")).click();

		
	}

	
	
}
