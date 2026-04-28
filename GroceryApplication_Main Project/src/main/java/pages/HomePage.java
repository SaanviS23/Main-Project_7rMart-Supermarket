package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage

{
	 @FindBy(xpath="//a[@data-toggle=\"dropdown\"]")WebElement admin;
	 @FindBy (xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/logout\"]") WebElement logout;
	 @FindBy(xpath="//input[@name=\"username\"]")WebElement userName;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminusermoreinfo;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']") WebElement moreinfoCategoryPage;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer' ]") WebElement moreInfoContactPage;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']") WebElement moreinfoManageFooter;
	 @FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-news\"]")WebElement moreInfoManageNews;
	
public WebDriver driver;

public HomePage(WebDriver driver) 

{
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public AdminUserPage clickOnMoreInfoinAdminUser()

{
	adminusermoreinfo.click();
	return new AdminUserPage(driver);
}

public ManageCategoryPage clickonMoreInfoLinkonCategory()
{
	moreinfoCategoryPage.click();
	return new ManageCategoryPage(driver);
}


public ManageContactPage clickOnMoreinfoofContactus()
{
	moreInfoContactPage.click();
	return new ManageContactPage(driver);
}

public ManageFooterPage clickonmoreinfolinkonManageFooter()
{
	
	moreinfoManageFooter.click();
	return new ManageFooterPage(driver);
}


public ManageNewsPage clickOnmoreInfolinkOnManageNews()
{

	moreInfoManageNews.click();
	return new ManageNewsPage(driver);
	
}
public void ClickonAdmin()
{
	admin.click();
}

public void ClickonLogOut()

{
	logout.click();
}

public boolean isSiginPageDisplayed()

{
	  return userName.isDisplayed();
}

}