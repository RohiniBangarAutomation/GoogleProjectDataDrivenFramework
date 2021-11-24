package DD_Tests;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

import DD_Core.GoogleTestCore;

//9.  To verify that user is able to login to Gmail
//Input -  URL "mail.google.com" while launching the browser.  Thereafter, Username & password in subsequent pages
//Verification- Objects marked in RED as below

public class Ass9gmail_Login extends GoogleTestCore {
	

	
	@Test
	public void login() throws InterruptedException {
		
		Logger logger=Logger.getLogger("Ass9gmail_Login");
		PropertyConfigurator.configure("log4j.properties");

		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(object.getProperty("gmailSignIn"))).click();
		logger.info("Sign In button clicked");
		driver.findElement(By.xpath(object.getProperty("gmailID"))).sendKeys("bangarrohini96");
		logger.info("Email Id entered");
		driver.findElement(By.xpath(object.getProperty("gmailNext"))).click();
		driver.findElement(By.xpath(object.getProperty("gmailPassword"))).sendKeys("Mithun@2");
		Thread.sleep(2000);
		driver.findElement(By.xpath(object.getProperty("gmailClickNext"))).click();
		driver.findElement(By.xpath(object.getProperty("gotogmail"))).click();
		logger.info("go to gmail");
		try {
			boolean b = driver.findElement(By.xpath(object.getProperty("leftBlock"))).isDisplayed();
			logger.info("Left Side Gmail bloack displayed:" + b);
		} catch (Exception e) {
			logger.info("Left Side Gmail bloack displayed:false");
		}
		// String title = "";
		boolean accName = driver.findElement(By.xpath(object.getProperty("accName"))).isDisplayed();
		logger.info("Account Name displayed:" + accName);
		// Assert.assertEquals(accName, title);
	}

}
