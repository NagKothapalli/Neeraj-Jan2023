package seleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
		//actions.pause(Duration.ofSeconds(30)).build().perform(); //fixed wait
		
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		//Actions actions = new Actions(driver); //1234
		//actions.pause(Duration.ofSeconds(1)).build().perform();
		//actions.sendKeys(Keys.ENTER).build().perform();
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@title='Search']")).click();
		driver.switchTo().alert().accept();
		//actions.pause(Duration.ofSeconds(4)).build().perform();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//open calendar , select date
		//actions.pause(Duration.ofSeconds(4)).build().perform();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		//actions.pause(Duration.ofSeconds(4)).build().perform();
		driver.findElement(By.xpath("//a[text()='20']")).click();
		//actions.pause(Duration.ofSeconds(4)).build().perform();
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
	String timeTableXpath = "//a[@title='TimeTable / Track']";
	String homeXpath = "//a[@title='Home']";
	String allServicesXpath = "//a[text()='All services Time Table & Tracking']";
	
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
	@Test
	public void keyboardAndMouseOperations()
	{
		WebElement fromCity = driver.findElement(By.xpath("//input[@name='source']"));
		//actions.moveToElement(fromCity).build().perform(); // mouse over
		//actions.click(fromCity).build().perform(); // click
		//actions.sendKeys(fromCity, "HYDERABAD").build().perform(); //sendkeys
		//actions.doubleClick(fromCity).build().perform(); //double click
		//actions.contextClick(fromCity).build().perform(); //right click
		actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).doubleClick().contextClick().build().perform();
	}
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	@Test
	public void handleMultipleWindows()
	{
		clickElement(timeTableXpath);
		clickElement(allServicesXpath);
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> allwindows = new ArrayList<String>(windows); 
		for(int i=0;i<allwindows.size();i++)
		{
			System.out.println(allwindows.get(i));
		}
		driver.switchTo().window(allwindows.get(1));
		actions.pause(Duration.ofSeconds(2)).build().perform();
		System.out.println("Second title :" + driver.getTitle());
		//driver.close();//it will close the active window
		//driver.quit(); // it will kill the entire chromedriver process , close all windows
		driver.switchTo().window(allwindows.get(0));
		actions.pause(Duration.ofSeconds(2)).build().perform();
		System.out.println("First title :" + driver.getTitle());
		clickElement(homeXpath);	
		driver.quit(); 
	}
	
	//--------------generic / utility functions-------------------
	public void clickElement(String myxpath)
	{
		//actions.pause(Duration.ofSeconds(4)).build().perform();//fixed wait
		//Explicit - we can wait for specific object/webelement dynamically
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(myxpath))));
		actions.moveToElement(element).click().build().perform();
		//driver.findElement(By.xpath(myxpath)).click();
	}
	
	public void enterText(String myxpath,String text)
	{
		//actions.pause(Duration.ofSeconds(4)).build().perform(); //fixed wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(myxpath))));
		//driver.findElement(By.xpath(myxpath)).sendKeys(text);
		actions.moveToElement(element).sendKeys(text).build().perform();
	}
	
	public void clickEnter()
	{
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
