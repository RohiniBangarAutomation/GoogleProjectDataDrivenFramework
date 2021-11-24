package DD_Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import DD_Core.GoogleTestCore;
import DD_Utility.Xls_Reader;

//7.  To validate that the Google performs the search operation properly

public class GoogleSearchAss7 extends GoogleTestCore {
	@Test
	public void googleSearch() throws Throwable {
		Xls_Reader reader = new Xls_Reader(
				"/Users/Rohini/Documents/AutomationClass/GoogleDataDrivenFramework/src/DD_PropertiesTestdata/GoogleSearch.xlsx");
		driver.get(config.getProperty("testsite"));
		for (int j = 2; j <= reader.getRowCount("GoogleSearch"); j++) {
			String search = reader.getCellData("GoogleSearch", "SearchKeyword", j);
			System.out.println(search);
			Thread.sleep(2000);
			driver.findElement(By.xpath(object.getProperty("googleSearch"))).sendKeys(search);
			Thread.sleep(2000);
			driver.findElement(By.xpath(object.getProperty("googleSearch"))).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.tagName("h3"));
			// System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				// String ActualTitle = list.get(i).getText();
				// System.out.println(ActualTitle + " Links verified");

				if (list.get(i).getText().contains(search)) {
					String ActualTitle = list.get(i).getText();
					if (ActualTitle.contains(search))
						System.out.println(search + " Links verified");
				}
			}
//
//					list.get(i).click();
//					System.out.println("title:" + driver.getTitle());
//				}

//			System.out.println(driver.getTitle());
//			String ActualTitle = driver.getTitle();
//			String ExpectedTitle = "Google Account";
//			Assert.assertEquals(ExpectedTitle, ActualTitle);
//			System.out.println("Account Apps title Verified");

			driver.close();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");

		}

	}

}
