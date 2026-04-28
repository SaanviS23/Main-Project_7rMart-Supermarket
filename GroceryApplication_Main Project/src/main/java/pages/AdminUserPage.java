package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import utilities.FakerUtility;
import utilities.PageUtility;

public class AdminUserPage 

{

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")WebElement newbutton;
@FindBy(xpath="//input[@id=\"username\"]")WebElement usernamefield;
@FindBy(xpath="//input[@id=\"password\"]")WebElement passwordfield;
@FindBy(xpath="//select[@id=\"user_type\"]")WebElement usertype;
@FindBy(xpath="//button[@name=\"Create\"]")WebElement save;
@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;

public WebDriver driver;
public AdminUserPage(WebDriver driver)

{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public AdminUserPage clickOnaddNewButton()

{
	newbutton.click();
	return this;
}


public AdminUserPage enterUserNameandPassword()

{
	FakerUtility fakerutility=new FakerUtility();
	String username=fakerutility.generateUsername();
	String password=fakerutility.generatePassword();
	usernamefield.sendKeys(username);
	passwordfield.sendKeys(password);
	return this;
	
}

public AdminUserPage selectUserFromDropdown(String dropdownValue)

{
	PageUtility pageutility = new PageUtility();
	pageutility.selectBybyValueMethod(usertype, dropdownValue);
	return this;
}




	public AdminUserPage clickOnSave()
	
	{
		save.click();
		return this;
		
	}
	
	public boolean issuccessfulAlertDisplayed()
	
	{
		
		return alert.isDisplayed();
		
	}
}
