package quickstart.pages;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import functionLibrary.ReportLog;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This is Base class which initiates every required component of the automation Framework globally.
 * Which in turn is inherited by the Test classes. 
 * 
 * @author	https://automationScript.com
 * @version	0.1
 *
 */

public class BasePage {
	public static  WebDriver driver;

	public  static ExtentReports extent;
	public  static ExtentSparkReporter spark;
	public  static  ExtentTest test;
	public  static String ScreenshotPath; 
	
	

	@BeforeSuite
	public void SetupDriver() {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);	
		ScreenshotPath= "target/Spark/";
	
	}

	@BeforeMethod
	public void startTest(Method m) {
		
		test= extent.createTest(m.getName());
		test.log(Status.INFO, "Start of Test");
					
		driver.get("https://google.com");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void endTest() {
		test.log(Status.INFO, "End of Test");

	}

	@AfterSuite
	public void DestroyDriver() {
		driver.close();
		driver.quit();
		
		test.log(Status.INFO, "End of Test Suite");
		extent.flush();
	}
	
	
}
