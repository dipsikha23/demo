package testNGdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class yahoo {
  @Test
  public void f() {
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("inside before yahoo suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("inside after yahoo suite");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before yahoo test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after yahoo test");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before yahoo class");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after yahoo class");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before each yahoo test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after each yahoo test");
  }
}
