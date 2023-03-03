package seleniumPractice;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	//org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 110
	//Current browser version is 90.0.4430.212
	
	//junit.framework.ComparisonFailure: expected:<[A]mail> but was:<[G]mail>
	
	//WebDriver : get(), getTitle , getCurrentUrl , getWindowHandle , findElement ,
	WebDriver driver;
	String expectedTitle = "Gmail";
	public GmailAutomation() //default constructor
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//it will open an empty chrome browser  //1234
	}
	//Execution Flow : Class Variables -> Constructor -> Before -> Test	
	@Before
	public void launchApplication()
	{
		System.out.println("Launch Application");
		//open an empty browser  then call your app URL in that browser		
		driver.get("https://gmail.com"); //1234
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
		
	}
	
	//DOM : Data Object Model - It will contain all the properties of webelements in side the web page
   //Execution Flow : Class Variables -> Constructor -> Before -> Test
	@Test
	public void loginToApplication()
	{	
		//driver.findElement(By.name("identifier")).click(); //1234
		//driver.findElement(By.name("identifier")).sendKeys("abcdfsdffg");
		//driver.findElement(By.name("identifier")).clear();
		//driver.findElement(By.name("identifier")).sendKeys("9959775757");
		WebElement email = driver.findElement(By.name("identifier"));
		email.click();
		email.sendKeys("dfdsfsds");
		email.clear();
		email.sendKeys("9959775757");
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		WebElement element = elements.get(1);
		element.click();
	}
	@Test
	public void createAccount()
	{
		//List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		//WebElement element = elements.get(2);
		//element.click();
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
