package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class EnterVehicalDataObjects extends TestBase {
	
	@FindBy(id="make")WebElement dd_Make;
	@FindBy(id="model")WebElement dd_Model;
	@FindBy(id="cylindercapacity")WebElement txt_Cylindercapacity;
	@FindBy(id="engineperformance")WebElement txt_Engineperformance;
	@FindBy(id="dateofmanufacture")WebElement date_Dateofmanufacture;
	@FindBy(id="numberofseatsmotorcycle")WebElement dd_Numberofseatsmotorcycle;
	@FindBy(id="listprice")WebElement txt_Listprice;
	@FindBy(id="annualmileage")WebElement txt_Annualmileage;
	@FindBy(id="nextenterinsurantdata")WebElement btn_Nextenterinsurantdata;

	public EnterVehicalDataObjects() {
		PageFactory.initElements(driver, this);
	}
}
