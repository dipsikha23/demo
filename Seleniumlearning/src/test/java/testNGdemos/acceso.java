package testNGdemos;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class acceso {
	public String baseurl="http://newtours.demoaut.com/";
	String chromePath="C:\\Users\\training_b6b.01.07\\Desktop\\Selenium\\jars\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver",chromePath);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Actions actions= new Actions(driver);
	
	actions.moveToElement(driver.findElemets(By.xpath("//a[@href='/electronics']"))).perform();
	actions.moveToElement(driver.findElemets(By.xpath("//a[@href='/camera-photo']"))).click().build().perform();
}
}

	
