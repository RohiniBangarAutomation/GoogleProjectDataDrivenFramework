package DD_Tests;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;


public class logtest {

	public static void main(String[] args) {
		Logger log=Logger.getLogger("logtest");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 8");
		// ChromeDriver webdriver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		log.info("browser opened");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		log.info("url navigated");

	}

}
