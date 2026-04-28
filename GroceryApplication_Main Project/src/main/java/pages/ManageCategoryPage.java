package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategoryPage 
{

	
	@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/Category/add\"]")WebElement addnew;
	@FindBy(xpath="//input[@placeholder=\"Enter the Category\"]")WebElement entercategory;
	@FindBy(xpath="//li[@id=\"134-selectable\"]")WebElement moveItem;
	@FindBy(xpath="//input[@id=\"main_img\"]")WebElement choosefile;
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement submit;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]") WebElement alert;
	
	
	
public WebDriver driver;
public ManageCategoryPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public ManageCategoryPage clickOnaddNewbutton()

{
	addnew.click();
	return this;
}

public ManageCategoryPage enterTheCategory(String categoryvalue)

{
	entercategory.sendKeys(categoryvalue);
	return this;
	
}


public ManageCategoryPage selectTheGroups()

{
	moveItem.click();
	return this;

}


public ManageCategoryPage chooseFile()

{
	String filepath=Constant.IMAGE;
	choosefile.sendKeys(filepath);
	return this;
}

public ManageCategoryPage submit()

{
	submit.click();
	return this;
}

public boolean isSuccessAlertDisplayed()

{
	return alert.isDisplayed();
	}

	
}
