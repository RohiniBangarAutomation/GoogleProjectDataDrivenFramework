package DD_Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import DD_Core.GoogleTestCore;

//3.  To verify that all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail,
//Drive, Calender, Google+, Translate, Photos) are launched properly 

public class VerifyAppsLaunchAss3 extends GoogleTestCore {
	@Test
	public void verifyAccountApp() throws InterruptedException {
		// driver.get("https://www.google.com/");

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		System.out.println("Google Apps are displayed");
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("MyAcc"))).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Google Account";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Account Apps title Verified");
	}

	@Test
	public void verifyGoogleSearch() throws InterruptedException {
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Search"))).click();
		try {
			driver.findElement(By.xpath(object.getProperty("SignIn"))).isDisplayed();
			System.out.println("Sign in button is located");
		} catch (Exception e) {
			System.out.println("Sign in button is not located");
		}
		try {
			driver.findElement(By.xpath(object.getProperty("SearchBox")));
			System.out.println("Search box on Google home page is located");
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Search box on Google home page is not located");
		}
		try {
			driver.findElement(By.xpath(object.getProperty("SearchButton")));
			System.out.println("Google Search button is located");
			driver.findElement(By.xpath(object.getProperty("LuckyButton")));
			System.out.println("I am feeling lucky button is located");
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Google Search andI am feeling lucky button is not located ");
		}
	}

	@Test
	public void verifyGoogleMaps() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("Maps"))).click();
		System.out.println(driver.getTitle());
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Google Maps";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Google Maps title Verified");
		driver.findElement(By.xpath(object.getProperty("ZoomIn"))).click();
		driver.findElement(By.xpath(object.getProperty("ZoomOut"))).click();
		driver.findElement(By.xpath(object.getProperty("Explore"))).click();
		Thread.sleep(2000);
		System.out.println("Google maps bottom options verified");

	}

	@Test
	public void verifyYouTubeApp() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath(object.getProperty("YouTube"))).click();
		System.out.println(driver.getTitle());
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "YouTube";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("YouTube app title Verified");
		driver.findElement(By.xpath(object.getProperty("YTSignIn"))).click();

		driver.findElement(By.xpath(object.getProperty("YTSearchBox")));
		System.out.println("search box and sign in button on youtube home page are verified");

	}

}
