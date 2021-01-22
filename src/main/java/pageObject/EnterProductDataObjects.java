package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class EnterProductDataObjects  extends TestBase {
	@FindBy(id="startdate")WebElement date_Startdate;
	@FindBy(id="insurancesum")WebElement dd_Insurancesum;
	@FindBy(id="damageinsurance")WebElement dd_Damageinsurance;
	@FindBy(xpath="//input[@name='Optional Products[]']")WebElement chk_OptionalProduct;
	@FindBy(id="preventerinsurancedata")WebElement btn_Preventerinsurancedata;
	@FindBy(id="nextselectpriceoption")WebElement btn_Nextselectpriceoption;
	
	public EnterProductDataObjects() {
		PageFactory.initElements(driver, this);
	}
}
