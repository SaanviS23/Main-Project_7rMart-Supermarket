package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage 

{

	
	@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/news/add\"]")WebElement newButton;
	@FindBy(xpath="//textarea[@placeholder=\"Enter the news\"]") WebElement addNewNews;
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement save;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]") WebElement alert;
	
	
	
	public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver) 

	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	public ManageNewsPage clickOnaddNewButton()
	
	{
		newButton.click();
		return this;
		
	}
	
	public ManageNewsPage addNewDiscount(String addnews)
	
	{
		addNewNews.sendKeys(addnews);
		return this;
		
	}
	
	public ManageNewsPage clickonSave()
	
	{
		
		save.click();
		return this;
	}
	
	public boolean isAlertisDisplayed()
	{
		
		return alert.isDisplayed();
		
	}
	
	
	
}
