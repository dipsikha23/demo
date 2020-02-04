package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
	
	public static void main(String[] args) {
		
		String chromePath="C:\\Users\\training_b6b.01.07\\Desktop\\Selenium\\jars\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.demoaut.com");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("firstName")).sendKeys("hello");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
		
		
		
		
	}

}
