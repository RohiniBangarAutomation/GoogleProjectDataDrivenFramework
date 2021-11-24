package DD_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import DD_Core.GoogleTestCore;
//1.  To verify that the Google web page is launched successfully
//Input - www.google.co.in
//Verification- Objects marked in RED as below
public class GoogleLaunchAss1 extends GoogleTestCore {
	
	@Test
	public void GoogleLaunch() {
	//driver.get("https://www.google.com/");
	try {
	driver.findElement(By.xpath(object.getProperty("SignIn")));
	System.out.println("Sign in button is located");
	}catch(Exception e)
	{
		System.out.println("Sign in button is not located");
	}
	try {
	driver.findElement(By.xpath(object.getProperty("SearchBox")));
	System.out.println("Search box on Google home page is located");
	Thread.sleep(2000);
	}catch(Exception e)
	{
		System.out.println("Search box on Google home page is not located");
	}
	try {
	driver.findElement(By.xpath(object.getProperty("SearchButton")));
	System.out.println("Google Search button is located");
	driver.findElement(By.xpath(object.getProperty("LuckyButton")));
	System.out.println("I am feeling lucky button is located");
	Thread.sleep(3000);
	}catch(Exception e)
	{
		System.out.println("Google Search andI am feeling lucky button is not located ");
	}
	
	}

}
