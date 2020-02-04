package testNGdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class shift {
	
	@Test
	public void testdemoshop() throws InterruptedException{
		
	String chromePath="C:\\Users\\training_b6b.01.07\\Desktop\\Selenium\\jars\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver",chromePath);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	WebElement search = driver.findElement(By.cssSelector("input[value='Search store']"));
	Actions actions = new Actions(driver);
	actions.keyDown(search,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(2000);
	
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	Assert.assertTrue(driver.getTitle().contains("Build your own computer"));
	}
}	
			
	
