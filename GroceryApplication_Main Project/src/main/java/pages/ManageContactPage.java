package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FakerUtility;

public class ManageContactPage 

{


@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1\"]")WebElement actionlink;
@FindBy(xpath="//input[@id=\"email\"]")	WebElement email;
@FindBy(xpath="//button[@type=\"submit\"]")WebElement update;
@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;
	
public WebDriver driver;
public ManageContactPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public ManageContactPage clickonactionlink()

{
	actionlink.click();
	return this;
}

public ManageContactPage editEmailfieldValueandenterNew()

{
	email.clear();
	FakerUtility faker=new FakerUtility();
	String emailvalue=faker.generateEmail();
	email.sendKeys(emailvalue);
	return this;
	
}

public ManageContactPage clickonUpdatebutton()

{
	update.click();
	return this;
}


public boolean isAlertDisplayed()

{
	return alert.isDisplayed();
}
}
