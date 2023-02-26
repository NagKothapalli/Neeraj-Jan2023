package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	//org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 110
	//Current browser version is 90.0.4430.212
	
	//junit.framework.ComparisonFailure: expected:<[A]mail> but was:<[G]mail>
	
	//WebDriver : get(), getTitle , getCurrentUrl , getWindowHandle , findElement ,
	String expectedTitle = "Gmail";
	@Test
	public void launchApplication()
	{
		System.out.println("Launch Application");
		//open an empty browser  then call your app URL in that browser
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//it will open an empty chrome browser
		driver.get("https://gmail.com");
		String actualtitle = driver.getTitle();
		System.out.println("title of the app :" + actualtitle);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL :" + url);
		String sessionID = driver.getWindowHandle();
		System.out.println("My Session ID :" + sessionID);
		//syso Ctrl+Space
		//Validation | Assertion
		if(expectedTitle.equals(actualtitle))
		{
			System.out.println("Title Validation is Successfull");
		}
		else
		{
			System.out.println("Title Validation is Failed");
		}

		Assert.assertEquals(expectedTitle, actualtitle);
		driver.findElement(By.name("identifier")).click();
		driver.findElement(By.name("identifier")).sendKeys("abcdfsdffg");
		driver.findElement(By.name("identifier")).clear();
		driver.findElement(By.name("identifier")).sendKeys("nag022");
	}
	
	//DOM : Data Object Model - It will contain all the properties of webelements in side the web page

}
