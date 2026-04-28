package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends BaseTest

{
	HomePage homepage;
	@Test(priority=1 ,description="This test is to verify whether user is able to update category details under Manage Category page")
public void addnewCategoryunderCategory() throws IOException

{
	String usernameValue = ExcelUtility.getStringData(1, 0, "loginpage");
	String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");
	String categoryvalue = ExcelUtility.getStringData(5, 0, "categoryvalue");	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
	homepage=loginpage.clickOnSignIn();

	
	ManageCategoryPage managecategory=new ManageCategoryPage(driver);
			
	managecategory=homepage.clickonMoreInfoLinkonCategory();
	managecategory.clickOnaddNewbutton().enterTheCategory(categoryvalue).selectTheGroups().chooseFile().submit();	
	
	boolean savemessage=managecategory.isSuccessAlertDisplayed();
	Assert.assertTrue(savemessage,Constant.CATEGORYUPDATEMESSAGE);
	
}	
	
	
}
