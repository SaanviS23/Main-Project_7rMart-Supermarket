package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage


{
  @FindBy(xpath="//input[@name=\"username\"]")WebElement userName;
  @FindBy(xpath="//input[@name=\"password\"]")WebElement password;
  @FindBy(xpath="//button[@class=\"btn btn-dark btn-block\"]") WebElement signIn;
  @FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
  @FindBy(xpath="//div[@class=\"alert alert-danger alert-dismissible\"]") WebElement alert;
  
  public WebDriver driver;
  public LoginPage(WebDriver driver)
  
  {
	  this.driver= driver;
	  PageFactory.initElements(driver, this);
	  
  }
  
  public LoginPage enterUserName(String userNameValue)
  {
	  userName.sendKeys(userNameValue);
	  return this;
	  
  }
  
  public LoginPage enterPassword(String passwordValue)
  
  {
	  
	  password.sendKeys(passwordValue);
	  return this;
  }
  
  public HomePage clickOnSignIn()
  
  {
	  signIn.click();
	  return new HomePage(driver);
  }
	
  
  public boolean isHomePageDisplayed()
  
  {
	  return dashboard.isDisplayed();
  }
	
  public boolean isAlertDisplayed()
  
  {
	  return alert.isDisplayed();
	  
	  
  }
  
  
}
