package testNGdemos;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test

public class softassert {
  
  public void softasserEx() {
	  
	  SoftAssert sa= new SoftAssert();
	  
	  System.out.println("*** test case two started***");
	  sa.assertEquals("hello","Hello");
	  
	  System.out.println("hard assert success....");
	  
	  sa.assertTrue("hello".equals("hello"), "second soft assert failed");
	  sa.assertTrue("Welcome".equals("welcome"),"third soft assert failed");
	  
	  System.out.println("*** test case two executed successfully***");
	  
	  sa.assertAll();
  }
}
