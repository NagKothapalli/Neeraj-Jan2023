package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation
{
	//org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 110
	//Current browser version is 90.0.4430.212
	
	@Test
	public void launchApplication()
	{
		System.out.println("Launch Application");
		//open an empty browser  then call your app URL in that browser
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//it will open an empty chrome browser
		driver.get("https://gmail.com");
	}

}
