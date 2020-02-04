package testNGdemos;

import java.net.Inet4Address;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreport {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	
	WebDriver driver;
	
	@BeforeTest
  
  public void startReport() throws Exception{
		System.out.println(System.getProperty("user.dir"));
		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+ "/extent-reports/" + new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format(new Date()+".html"));
		
		extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name","GFt nextgen testing stream");
		extent.setSystemInfo("environment","Automation testing-selenium");
		extent.setSystemInfo("User name","BMC");
		
		htmlReporter.config().setDocumentTitle("Reports-Extents-GFT");
		htmlReporter.config().setReportName("Execution report-Mercury tours");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		Inet4Address inet=(Inet4Address) Inet4Address.getLocalHost();
		extent.setSystemInfo("system host address", ":" +inet.getHostAddress());
		extent.setSystemInfo("system host address", ":" +inet.getHostName());
		System.out.println("Host address is"+inet.getHostAddress());
		System.out.println("Host name is"+inet.getHostName());
}
	@Test
	public void passTest()
	{
		logger = extent.createTest("Passtest");
		Assert.assertTrue(true);
		logger.log(Status.PASS, MarkupHelper.createLabel("Test case passed is passtest", ExtentColor.GREEN));
	}
	@Test
	public void failTest()
	{
		logger = extent.createTest("failtest");
		Assert.assertTrue(false);
	}
	
	@Test
	public void skipTest()
	{
		logger= extent.createTest("skiptest");
		throw new SkipException("Skipping- this is not ready for testing");
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"-Test case failed", ExtentColor.RED));
			logger.log(Status.FAIL,MarkupHelper.createLabel(result.getThrowable()+"-Test case failed", ExtentColor.RED));
		}else if(result.getStatus()==ITestResult.SKIP) {
			logger.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+"-Test case skipped",ExtentColor.ORANGE));
		}
	}
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
}
