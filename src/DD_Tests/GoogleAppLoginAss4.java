package DD_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import DD_Core.GoogleTestCore;

//4.  To verify that the user is able to Sign-in into all the Google apps (My Account, 
//Search, Maps, YouTube, Play, News, Gmail, Drive, Calender, Google+, Translate, Photos)

public class GoogleAppLoginAss4 extends GoogleTestCore {
	@Test
	public void googleAppLogin() throws InterruptedException {
		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("MyAcc"))).click();
		
		driver.findElement(By.xpath(object.getProperty("MyAccount"))).click();
		driver.findElement(By.xpath(object.getProperty("email-id"))).sendKeys(object.getProperty("email"));

		driver.findElement(By.xpath(object.getProperty("Next"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Password"))).sendKeys(object.getProperty("passwd"));
		driver.findElement(By.xpath(object.getProperty("ClickNext"))).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
