package NGpack;

import org.testng.annotations.Test;

import Customer.Customerpage;
import Login.loginguru;

public class NewTest {
  @Test(priority=0)
  public void Testcase01() {
	  
	  loginguru.logtest(driver);
  }
  
  @Test(priority=1)
  public void Testcase02() {
	  
	  Customerpage.Custpage(driver);
	  
	 
	
  }
}
