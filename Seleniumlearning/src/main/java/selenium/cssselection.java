package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class cssselection {
	
	public static void main(String[] args) {
		
		String iePath="C:\\Users\\training_b6b.01.07\\Desktop\\Selenium\\jars\\IEDriverServer.exe";
		
		System.setProperty("webdriver.ie.driver", iePath);
		
		WebDriver driver= new InternetExplorerDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name=\"login\"]")).click();
		driver.findElement(By.cssSelector("a[href='mercurywelcome.php']")).click();
	}

}
