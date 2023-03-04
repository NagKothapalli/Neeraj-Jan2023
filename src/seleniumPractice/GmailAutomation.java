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
	
	//WebDriver : get(), getTitle , getCurrentUrl , getWindowHandle , findElement ,findElements
	//By : id , name , className , linkText , partialLinkText , tagName , xpath
	//xpath : XML path
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
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		for(int i=0;i<elements.size();i++)
		{
			String txt = elements.get(i).getText(); // lastname
			System.out.println("Text on the element :" + txt);
			if(txt.equals("Create account")) {
				elements.get(i).click();
				break;
			}
		}
		//WebElement element = elements.get(2);
		//element.click();
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
	}
	//XPATH : 
	  //Type1 : Absolute / Fixed / Static / Full 
	  //Type2 : Relative xpath  - is just like SQL select
	
	//tagName[@attribute='value']
	
	//tagName[text()='value']
	
	//tagName[@attribute='value'  and  text()='txt']
	
	//tagName[@attribute1='value' and @attribute2='value']
	
	@Test
	public void forgotEmail()
	{
		//driver.findElement(By.tagName("button")).click();
		//driver.findElements(By.tagName("button")).get(0).click();
		//getText , getAttribute
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("button"));
		 * for(int i=0;i<elements.size();i++) { String txt = elements.get(i).getText();
		 * // lastname if(txt.equals("Forgot email?")) { elements.get(i).click(); break;
		 * } }
		 */
	//	/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button
	  // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
	   //driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
		driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
	   //select element from elementstab where tagname=button and jsname=Cuz2Ue
	   //select empName from EmployeesTable where EmpID=1234 and Dept=RD
	}
	
	@Test
	public void learnMore()
	{
		//driver.findElement(By.linkText("Learn more")).click();
		driver.findElement(By.partialLinkText("Learn")).click();
		
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("a")); for(int
		 * i=0;i<elements.size();i++) { String txt = elements.get(i).getText(); //
		 * lastname System.out.println("Text on the element :" + txt);
		 * if(txt.equals("Learn more")) { elements.get(i).click(); break; } }
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
}
