package testNGdemos;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import selenium.drivers;

public class excel {
 
	public static void main(String[] args)
	{
		String chromePath="C:\\Users\\training_b6b.01.07\\Desktop\\Selenium\\jars\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver = new ChromeDriver();
		File src=new File("C:\\Users\\training_b6b.01.07\\Desktop\\Book1.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet
		
		
		drivers.findElement(By.linkText("Home")).click();
		
	}
