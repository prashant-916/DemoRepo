package insuranceCalculatorTest;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.HomePageObject;
import testBase.TestBase;

public class EndToEndTest_MoterCycle extends TestBase{
	@Test
	public void vehicalDatatTest()
	{
		System.out.println("driver= "+driver);
		String title=homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Tricentis Vehicle Insurance");
	}
	
	@Test(priority=1)
	public void vehicalDatatTest2()
	{
		System.out.println("driver= "+driver);
		//boolean image=driver.findElement(By.id("tricentis_logo")).isDisplayed();
		boolean image=homepage.validateHomePageLogo();
		Assert.assertTrue(image);
	}
	
	@Test(priority=2)
	public void validateMotorCycleLinkTest() throws Exception
	{
		System.out.println("driver= "+driver);
		homepage.validateMotorCycleLink();
		Thread.sleep(3000);
	}
}
