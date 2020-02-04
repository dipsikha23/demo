package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie {
	
	public static void main(String[] args) {
		
		String iePath="C:\\Users\\training_b6b.01.07\\Desktop\\Selenium\\jars\\IEDriverServer.exe";
		
		System.setProperty("webdriver.ie.driver",iePath);
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement uname=driver.findElement(By.name("Username"));
		uname.sendKeys("mercury");
		uname.clear();
		
		WebElement Pwd=driver.findElement(By.name("password"));
		Pwd.sendKeys("mercury");
		
		
		WebElement signIn=driver.findElement(By.name("login"));
		signIn.click();
		
		WebElement home =driver.findElement(By.linkText("Home"));
		String text =home.getText();
		System.out.println(text);
		home.click();
		
	}

}
