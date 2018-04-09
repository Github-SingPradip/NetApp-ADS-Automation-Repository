package NGpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import Customer.Customerpage;
import Login.loginguru;

public class NewTest {
	
		
		//WebDriver driver;

	
	WebDriver driver;
	
		String url="http://demo.guru99.com/v4/";
	
	
  @Test(priority=0)
  public void Testcase01() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //System.out.println(""+url);
	  driver.get(url);
	  
	  loginguru.logtest(driver);

  }
  
  @Test(priority=1)
  public void Testcase02() {
	  
	  Customerpage.Custpage(driver);
	  
	 
	
  }
}
