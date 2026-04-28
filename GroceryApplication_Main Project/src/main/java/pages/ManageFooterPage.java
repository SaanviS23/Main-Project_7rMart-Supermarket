package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FakerUtility;

public class ManageFooterPage 
{

	
	@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1\"]") WebElement action;
	@FindBy(xpath="//textarea[@id=\"content\"]") WebElement address;
	@FindBy(xpath="//input[@id=\"email\"]")WebElement email;
	@FindBy(xpath="//input[@id=\"phone\"]")WebElement phonenumber;
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement submit;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;
	
	WebDriver driver;
	
	public ManageFooterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public ManageFooterPage clickonactionlink()
	{
		action.click();
		return this;
	}
	
	public ManageFooterPage editAndUpdateAddress()
	{

		
		address.clear();
		FakerUtility faker=new FakerUtility();
		String addressvalue=faker.generateAddress();
		address.sendKeys(addressvalue);
		return this;
		
	}	
	
	
	public ManageFooterPage editAndUpdateEmail()
	
	{
		email.clear();
		FakerUtility faker=new FakerUtility();
		String emailvalue=faker.generateEmail();
		email.sendKeys(emailvalue);
		return this;
		
	}
	
	 public ManageFooterPage editAndUpdatePhone()
	{
		
		 phonenumber.clear();
		FakerUtility faker=new FakerUtility();
		String phone=faker.generatePhoneNumber();
		phonenumber.sendKeys(phone);
		return this;
	}
	
	
	public ManageFooterPage clickOnSubmit()
	{
		submit.click();
		return this;
		
	}
	
	public boolean isAlertDisplayed()
	
	{
		
		return alert.isDisplayed();
	}

}
