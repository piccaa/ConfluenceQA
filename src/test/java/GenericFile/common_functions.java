package GenericFile;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import io.github.bonigarcia.wdm.WebDriverManager;

public class common_functions extends selenium_utility {
	public static WebDriver driver = null;
	
	
	@SuppressWarnings("deprecation")
	@BeforeClass (groups = {"Common"})
	
		
		
		@Parameters({"browser","url"})
	public	void Setup(String br,String appurl) throws InterruptedException
		{
			if(br.equals("chrome"))
			{
				ChromeOptions options = new ChromeOptions();

				options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
			else if(br.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(appurl);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
	
	
	void testLogout() throws Throwable
	{
		driver.findElement(By.linkText("log_out")).click();
		sleep(3000);
		boolean status = driver.findElement(By.linkText("/signup")).isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	
	@AfterClass (groups = {"Common"})
	void teardown()
	{
		driver.quit();
	}	
	
	
}
