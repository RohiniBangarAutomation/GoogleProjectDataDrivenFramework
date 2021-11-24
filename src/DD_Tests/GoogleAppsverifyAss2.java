package DD_Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import DD_Core.GoogleTestCore;

//2.  To verify all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail, Drive, 
//Google+, Translate, Photos) in the dialog box

public class GoogleAppsverifyAss2 extends GoogleTestCore {
	@Test
	public void googleAppsVerify() throws InterruptedException {
		// driver.get("https://www.google.com/");
		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		System.out.println("Google Apps are displayed");

		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("MyAcc"))).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();

		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Search"))).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Maps"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("YouTube"))).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Play"))).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("News"))).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Gmail"))).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Meet"))).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Chat"))).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Contacts"))).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Drive"))).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Calender"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("All google apps are verified successfully");

	}

}
