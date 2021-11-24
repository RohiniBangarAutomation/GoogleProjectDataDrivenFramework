package DD_Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import DD_Core.GoogleTestCore;

//10.  To verify the total no. of emails received by the user

public class Ass10MailCount extends GoogleTestCore {

	@Test
	public void mailCount() throws InterruptedException, IOException {

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReport/learn_automation.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("mailCount");
		logger.log(Status.INFO, "Total mail count");
		logger.log(Status.FAIL, "Total mail count incorrect");
		logger.fail("Total mail count incorrect", MediaEntityBuilder
				.createScreenCaptureFromPath("/Users/Rohini/Documents/ExtentScreenshot.png").build());

		extent.flush();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(object.getProperty("gmailSignIn"))).click();
		driver.findElement(By.xpath(object.getProperty("gmailID"))).sendKeys("bangarrohini96");
		driver.findElement(By.xpath(object.getProperty("gmailNext"))).click();
		driver.findElement(By.xpath(object.getProperty("gmailPassword"))).sendKeys("Mithun@2");
		Thread.sleep(2000);
		driver.findElement(By.xpath(object.getProperty("gmailClickNext"))).click();
		driver.findElement(By.xpath(object.getProperty("gotogmail"))).click();
		String count = driver.findElement(By.xpath(object.getProperty("totalmail"))).getText();
		System.out.println("Total email:" + count);
		try {
			for (int i = 0; i < 2; i++) {
				Thread.sleep(2000);
				driver.findElement(By.xpath(object.getProperty("nextmailClick"))).click();
				Thread.sleep(2000);
			}
			System.out.println("Navigating through emails done");
			Thread.sleep(3000);
			// driver.navigate().back();
		} catch (Exception e) {
			System.out.println("cannot Navigating through emails");
		}
	}

}
