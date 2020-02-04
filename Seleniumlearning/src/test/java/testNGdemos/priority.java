package testNGdemos;

import org.testng.annotations.Test;

public class priority {
  @Test(priority = 1)
  public void testGoogle() 
  {
	  System.out.println("in test Google");
  }
  @Test(priority = 2)
  public void testTwitter()
  {
	  System.out.println("in test twitter");
  }
  @Test(priority = 3)
  public void testFacebook()
  {
	  System.out.println("in test facebook");
  }
}
