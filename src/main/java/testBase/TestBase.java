package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HomePageObject;
import reusebleComponents.PropertiesOperation;

public class TestBase extends ObjectRepo  {

	public static WebDriver driver;


	public static void initialization() throws Exception
	{
		String browser=PropertiesOperation.getpropertyValueBYKey("browser");
		String url=PropertiesOperation.getpropertyValueBYKey("url");
		if(browser.equalsIgnoreCase(("chrome")))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ff"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@BeforeMethod
	public static void setup() throws Exception
	{
		initialization();
		homepage=new HomePageObject();
	}
	
	@AfterMethod
	public void endWith()
	{
		driver.close();
	}

	
}
