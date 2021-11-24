package DD_Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DD_Core.GoogleTestCore;

//5.  To verify that clicking on the language links (Hindi, Marathi etc) launches Google in respective language

public class LangClicks5n6 extends GoogleTestCore {
	@Test
	public void googleLangsClicking() throws InterruptedException {

		String lang = driver.findElement(By.xpath("/html")).getAttribute("lang");
		System.out.println(lang);
		String substring = lang.substring(0, 2);
		System.out.println("Google home page Inital language--" + substring);

		// sign in button verification
		String href = driver.findElement(By.xpath(object.getProperty("SignIn")))
				.getAttribute("href");

		if (href.contains("hl=" + substring) == true) {

			System.out.println("Sign in button is in " + substring + " Language");

		} else {
			if (!(href.contains("hl="))) {
				System.out.println("language of Sign in button is not found");
			} else {

				int index = href.indexOf("hl=", 0);
				System.out.println(index);
				String signInLang = href.substring(index + 3, index + 5);

				System.out.println("language of Sign in button is: " + signInLang + " different than original language"
						+ substring);
			}
		}
		// check if language disapears
		List<WebElement> googleLangs = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

		System.out.println(googleLangs.size());
		String url = "";
		int flag = 1;
		for (int i = 0; i < googleLangs.size(); i++) {
			url = googleLangs.get(i).getAttribute("href");
			System.out.println(url);
			if (!(url.contains("hl=" + substring))) {
				flag = 1;
			} else {
				flag = 0;
				break;
			}

		}
		if (flag == 1) {
			System.out.println(substring + " language is missing from home page");
		} else {
			System.out.println(substring + " language is visible in home page-false output");
		}
		// List<WebElement> langs =
		// driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

		WebElement div = driver.findElement(By.xpath("//div[@id='SIvCob']"));
		List<WebElement> langs = div.findElements(By.tagName("a"));
		System.out.println(langs.size());
		// List<WebElement> langs = div.findElements(By.tagName("a"));

		//for (int i = 0; i < langs.size(); i++) {
			//driver.navigate().refresh();
			//if (langs.get(i).getAttribute("href").contains("hl=")) {

				// driver.findElement(By.tagName("a")).getAttribute("href").contains("hl=");
				langs.get(0).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/a[2]")).click();
				Thread.sleep(2000);
				try {
				driver.findElement(By.xpath(object.getProperty("banglaLang"))).isDisplayed();
				System.out.println("sign in button is in language bangla");
				}catch(Exception e)
				{
					System.out.println("sign in button is in other language than bangla");
				}
				driver.close();
				
	}

	// 6. To open and close the browser
	
	@Test
	public void openANDclosebrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Rohini/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		// }
	}

}
