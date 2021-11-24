package DD_Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import DD_Core.GoogleTestCore;

//11.  To verify the total no. of emails marked with STAR
public class StarEmailCountAss11 extends GoogleTestCore{
	@Test
	public void starEmail() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(object.getProperty("gmailSignIn"))).click();
		driver.findElement(By.xpath(object.getProperty("gmailID"))).sendKeys("bangarrohini96");
		driver.findElement(By.xpath(object.getProperty("gmailNext"))).click();
		driver.findElement(By.xpath(object.getProperty("gmailPassword"))).sendKeys("Mithun@2");
		Thread.sleep(2000);
		driver.findElement(By.xpath(object.getProperty("gmailClickNext"))).click();
		driver.findElement(By.xpath(object.getProperty("gotogmail"))).click();
		driver.findElement(By.xpath(object.getProperty("StarmailClick"))).click();
		System.out.println("Cliked on Starred mails");
		String starmail=driver.findElement(By.xpath(object.getProperty("starmailCount"))).getText();
	System.out.println("Total starred mails are:"+starmail);
	
	}

}
