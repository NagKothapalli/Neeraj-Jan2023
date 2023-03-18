package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
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

public class ApsrtcAutomation //extends WebDriverUtilities
{
	WebDriver driver;
	Actions actions;
	String expectedTitle = "Gmail";
	WebDriverUtilities dUtils;
	public ApsrtcAutomation() //default constructor
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//it will open an empty chrome browser  //1234
		actions = new Actions(driver); //1234
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dUtils = new WebDriverUtilities(driver);
	}
	//Execution Flow : Class Variables -> Constructor -> Before -> Test	
	@Before
	public void launchApplication() throws IOException
	{
		System.out.println("Launch Application");
		//open an empty browser  then call your app URL in that browser		
		//driver.get("https://www.apsrtconline.in/");//Hardcode value //1234
		driver.get(ReadPropertiesData.readData("URL"));
	}
	@Test
	public void readInputDate() throws IOException
	{
		FileInputStream myfile = new FileInputStream("TestData/DevData.properties");//news papaer
		Properties prop = new Properties(); // news reader
		prop.load(myfile);
		String a = prop.getProperty("URL");
		System.out.println(a);
		System.out.println(prop.getProperty("FromCity"));
		System.out.println(prop.getProperty("ToCity"));
		System.out.println(prop.getProperty("JDate"));
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
		dUtils.enterText("//input[@name='source']","HYDERABAD");
		dUtils.clickEnter();
		dUtils.enterText("//input[@name='destination']","GUNTUR");
		dUtils.clickEnter();
		dUtils.clickElement("//input[@name='txtJourneyDate']");
		dUtils.clickElement("//a[text()='20']");
		dUtils.clickElement("//input[@title='Search']");
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
	public void bookBusTicket3() throws IOException
	{
		//ReadPropertiesData.readData("URL");
		System.out.println(ReadPropertiesData.readData("FromCity"));
		dUtils.enterText(sourceXpath,ReadPropertiesData.readData("FromCity"));
		dUtils.clickEnter();
		dUtils.enterText(destinationXpath,ReadPropertiesData.readData("ToCity"));
		dUtils.clickEnter();
		dUtils.clickElement(openCalendarXpath);
		//String d = readDate("JDate");
					//		"//a[text()='20']"
		//String jDateXpath = "//a[text()='"+d+"']"; 
		String jDateXpath = "//a[text()='"+ReadPropertiesData.readData("JDate")+"']";
		dUtils.clickElement(jDateXpath);
		dUtils.clickElement(searchBtnXpath);
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
		dUtils.clickElement(timeTableXpath);
		dUtils.clickElement(allServicesXpath);
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
		dUtils.clickElement(homeXpath);	
		driver.quit(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
