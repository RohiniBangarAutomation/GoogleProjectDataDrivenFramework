package DD_Core;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import DD_Utility.Xls_Reader;

public class GoogleTestCore {

	/*
	 * init methods will be responsible for Initilizing the Selenium server, Load
	 * properties, logs and other files
	 * 
	 */

	// 1st step
	public static WebDriver driver;

	// 2nd step
	public static Properties config = new Properties();

	// 3rd step
	public static Properties object = new Properties();

	// 4th step
	public static Xls_Reader excel = null;

	// 5th step
	//public static Logger app_logs = Logger.getLogger("devpinoyLogger");

	// Selenium server

	@BeforeSuite
	public void init() throws Exception {

		// 1st step

		System.setProperty("webdriver.chrome.driver", "/Users/Rohini/Documents/chromedriver");
		// ChromeDriver webdriver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		// 2nd step - Load config.properties
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/DD_PropertiesTestdata/config.properties");
		config.load(fis);
		//app_logs.fine("Loading config properties file");
		// 3rd step - Load Object.properties
		fis = new FileInputStream(System.getProperty("user.dir") + "/src/DD_PropertiesTestdata/object.properties");
		object.load(fis);

		// 4th Step - load excel file
		Xls_Reader reader = new Xls_Reader(
				System.getProperty("user.dir") + "/src/DD_PropertiesTestdata/Googlesearch.xlsx");
	}

	@AfterSuite
	// use this method after finishing the test execution
	public void stopServer() {
		driver.quit();
	}
}
