package testNGdemos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample {
  @Test(enabled=false,priority=1)
  public void validate_Sign_on()
  {
	  System.out.println("Validating Sign_on");
  }
  @Test(priority=10)
  public void validate_Register()
  {
	  System.out.println("Validating Register");
  }
  @Test(priority=2)
  public void validate_support()
  {
	  System.out.println("Validating support");
  }
  @Test
  public void validate_contact()
  {
	  System.out.println("Validating contact");
  }
  @BeforeClass
  public void open_browser()
  {
	  System.out.println("*** Opening Browser***");
  }
  @AfterClass
  public void close_browser()
  {
	  System.out.println("*** closing Browser***");
  }
  @BeforeMethod
  public void Home_page()
  {
	  System.out.println("### Opening Home page###");
  }
  @AfterMethod
  public void Sign_out()
  {
	  System.out.println("### Signing out###");
  }
}
