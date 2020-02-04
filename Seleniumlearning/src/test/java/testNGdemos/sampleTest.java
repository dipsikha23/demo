package testNGdemos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sampleTest {
  @Test(dataProvider = "dp")
  public void DataInfo(Integer age,String name) 
  {
	  System.out.println("age is"+""+age);
	  System.out.println("name is"+""+name);
  }
  
  @DataProvider
  public Object[][] dp()
  {
	  return (Object[][]) new Object[] {
			  new Object[] { 25,"RAM"},
			  new Object[] { 30,"RAJ"},
			  new Object[] { 31,"BMC"},
	  };
  }
}

