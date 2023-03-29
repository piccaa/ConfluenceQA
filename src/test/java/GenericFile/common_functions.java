package GenericFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class common_functions extends selenium_utility {
	public static WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite (groups = {"Common"})
	public void login() throws Throwable {

		try {
			if (Resources_Utility.config("browser").equals("chrome")) {
				 ChromeOptions option = new ChromeOptions();
		            option.addArguments("--remote-allow-origins=*");
		        //    option.addArguments("headless");
				WebDriverManager.chromedriver().setup();
				 driver= new ChromeDriver(option);
				driver.get("https://confluenceqa.mindler.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}	
			else if (Resources_Utility.config("browser").equals("firefox")) {
				
				  WebDriverManager.firefoxdriver().setup(); 
				   driver= new FirefoxDriver();
				  driver.get("https://confluenceqa.mindler.com/");
				  driver.manage().window().maximize();
				 

				

			} else if (Resources_Utility.config("browser").equals("ie")) {
			//	WebDriverManager.edgedriver().setup();
			//	WebDriver driver= new E
			//	driver.get("https://immrse.mindler.com/");
			//	driver.manage().window().maximize();


			}} catch (Exception e) {
			e.printStackTrace();
		}
		
	}}
