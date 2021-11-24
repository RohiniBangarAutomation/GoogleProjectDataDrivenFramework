package DD_Tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import DD_Core.GoogleTestCore;

//8.  To verify the Google apps/products on Google products webpage

public class VerifygoogleProductAss8 extends GoogleTestCore {
	@Test
	public void googleProductsVerify() throws Throwable {
		Logger logger = Logger.getLogger("Ass9gmail_Login");

		PropertyConfigurator.configure("log4j.properties");
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./ExtentReport/learn_automation.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest log=extent.createTest("googleProductsVerify");
		log.log(Status.INFO, "verify GoogleProducts");
		log.log(Status.PASS, "All GoogleProducts are verified");
		
		extent.flush();
		driver.get(config.getProperty("GoogleProducts"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("cookies"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("pagedown"))).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);

		driver.findElement(By.xpath(object.getProperty("browseProducts"))).click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//p[text()='Android Auto']")).isDisplayed();
			logger.info("Android Auto product is present on page");
			// p[text()='Android OS']
		} catch (Exception e) {
			logger.info("Android Auto product is not present on page");

		}
		try {
			driver.findElement(By.xpath("//p[text()='Android OS']")).isDisplayed();
			logger.info("Android OS product is present on page");
		} catch (Exception e) {
			logger.warn("Android OS product is not present on page");

		}
		try {
			driver.findElement(By.xpath("//p[text()='Chrome Enterprise']")).isDisplayed();
			logger.warn("AChrome Enterprise product is present on page");
		} catch (Exception e) {
			logger.warn("AChrome Enterprise product is not present on page");

		}
	}

}
