package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObject  extends TestBase {
	
	
	@FindBy(id="nav_automobile")
	WebElement link_Automobile;
	
	@FindBy(id="nav_truck")
	WebElement link_Truck;
	
	@FindBy(id="nav_motorcycle")
	WebElement link_Motorcycle;
	
	@FindBy(id="nav_camper")
	WebElement link_Camper;
	
	@FindBy(xpath="//img[@id='tricentis_logo']")
	WebElement img_tricentis_logo;
	
	@FindBy(id="search_form")
	WebElement txtSearchForm;
	
	
	public  HomePageObject() {
		
		System.out.println("home page initialization= "+driver);
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle()
	{
		System.out.println("driver= "+driver);
		return driver.getTitle();
	}
	public boolean validateHomePageLogo()
	{
		System.out.println("driver= "+driver);
		return link_Motorcycle.isDisplayed();
	}
	public void validateMotorCycleLink()
	{
		System.out.println("driver= "+driver);
		txtSearchForm.sendKeys("prashant");
		
	}

}
