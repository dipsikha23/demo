package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class drivers {
	public static WebDriver getDriver(String browserName)
	{
		if(browserName.equals("ie"))
		{
			String iePath="C:\\Users\\training_b6b.01.07\\Desktop\\Selenium\\jars\\IEDriverServer.exe";
		    System.setProperty("webdriver.ie.driver",ieDriverPath);
		    return new InternetExplorerDriver();
		}
		else if(browserName.equals("chrome"))
		{
			String chromePath="C:\\Users\\training_b6b.01.07\\Desktop\\Selenium\\jars\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",ChromeDriver);
			return new ChromeDriver();
		}
		
	}

}
