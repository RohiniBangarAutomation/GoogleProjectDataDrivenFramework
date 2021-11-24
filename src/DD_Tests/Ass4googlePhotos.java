package DD_Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import DD_Core.GoogleTestCore;

public class Ass4googlePhotos extends GoogleTestCore {
	@Test
	public void googlePhotoslogin() throws InterruptedException {
		driver.findElement(By.xpath(object.getProperty("GoogleApps"))).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		// driver.findElement(By.xpath(object.getProperty("Photos"))).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath(object.getProperty("Photos"))).click();

		driver.findElement(By.xpath(object.getProperty("gotoPhotos"))).click();
		driver.findElement(By.xpath(object.getProperty("photosEmailId"))).sendKeys("bangarrohini96");
		driver.findElement(By.xpath(object.getProperty("photosNext"))).click();
		driver.findElement(By.xpath(object.getProperty("photosPassword"))).sendKeys("Mithun@2");
		Thread.sleep(2000);
		driver.findElement(By.xpath(object.getProperty("passwordNext"))).click();
		// driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/span/div/button/span")).click();
		driver.findElement(By.xpath(object.getProperty("AccButton"))).click();
		// driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		Thread.sleep(3000);

		// driver.findElement(By.xpath("/html/body/div[1]/div/c-wiz/c-wiz/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/a")).click();
		String expected = driver.findElement(By.xpath("//div[@class='gb_bb']/div[text()='Rohini Bangar']")).getText();
		// System.out.println(expected);
		String actual = "Rohini Bangar";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);
		String expected1 = driver.findElement(By.xpath("//div[@class='gb_bb']/div[text()='bangarrohini96@gmail.com']"))
				.getText();
		String actual1 = "bangarrohini96@gmail.com";
		Assert.assertEquals(actual1, expected1);
		System.out.println("Name and Email Id displayed on web page");

	}
}
