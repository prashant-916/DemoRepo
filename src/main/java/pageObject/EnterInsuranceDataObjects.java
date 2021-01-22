package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class EnterInsuranceDataObjects  extends TestBase {
	
	@FindBy(id="firstname") WebElement txt_firstname;
	@FindBy(id="lastname") WebElement txt_Lastname;
	@FindBy(id="birthdate") WebElement date_Birthdate;
	@FindBy(xpath="//input[@name='Gender']") WebElement rdo_Gender ;
	@FindBy(id="streetaddress") WebElement txt_Streetaddress;
	@FindBy(id="country") WebElement dd_Country;
	@FindBy(id="zipcode") WebElement txt_Zipcode;
	@FindBy(id="city") WebElement txt_City;
	@FindBy(xpath="//input[@name='Hobbies']") WebElement chk_Hobbies;
	@FindBy(id="website") WebElement txt_Website;
	@FindBy(xpath="//button[@class='ideal-file-upload']") WebElement file_Picture;
	@FindBy(id="preventervehicledata") WebElement btn_Preventervehicledata;
	@FindBy(id="nextenterproductdata") WebElement btn_Nextenterproductdata ;
	
	
	public EnterInsuranceDataObjects() {
		PageFactory.initElements(driver, this);
	}

}
