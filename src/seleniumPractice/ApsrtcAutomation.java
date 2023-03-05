package seleniumPractice;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation
{
	WebDriver driver;
	Actions actions;
	String expectedTitle = "Gmail";
	public ApsrtcAutomation() //default constructor
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//it will open an empty chrome browser  //1234
		actions = new Actions(driver); //1234
	}
	//Execution Flow : Class Variables -> Constructor -> Before -> Test	
	@Before
	public void launchApplication()
	{
		System.out.println("Launch Application");
		//open an empty browser  then call your app URL in that browser		
		driver.get("https://www.apsrtconline.in/"); //1234
	}
	@Test
	public void bookBusTicket()
	{
		System.out.println("Book Bus Ticket");
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		//Actions actions = new Actions(driver); //1234
		//actions.pause(Duration.ofSeconds(1)).build().perform();
		//actions.sendKeys(Keys.ENTER).build().perform();
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@title='Search']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//open calendar , select date
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='20']")).click();
		driver.findElement(By.xpath("//input[@title='Search']")).click();
	}
	@Test
	public void bookBusTicket2()
	{
		enterText("//input[@name='source']","HYDERABAD");
		clickEnter();
		enterText("//input[@name='destination']","GUNTUR");
		clickEnter();
		clickElement("//input[@name='txtJourneyDate']");
		clickElement("//a[text()='20']");
		clickElement("//input[@title='Search']");
	}
	//page object model
	String sourceXpath = "//input[@name='source']";
	String destinationXpath = "//input[@name='destination']";
	String openCalendarXpath = "//input[@name='txtJourneyDate']";
	String jDateXpath = "//a[text()='20']";
	String searchBtnXpath = "//input[@title='Search']";
	
	@Test
	public void bookBusTicket3()
	{
		enterText(sourceXpath,"HYDERABAD");
		clickEnter();
		enterText(destinationXpath,"GUNTUR");
		clickEnter();
		clickElement(openCalendarXpath);
		clickElement(jDateXpath);
		clickElement(searchBtnXpath);
	}
	
	//--------------generic / utility functions-------------------
	public void clickElement(String myxpath)
	{
		driver.findElement(By.xpath(myxpath)).click();
	}
	
	public void enterText(String myxpath,String text)
	{
		driver.findElement(By.xpath(myxpath)).sendKeys(text);
	}
	
	public void clickEnter()
	{
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
