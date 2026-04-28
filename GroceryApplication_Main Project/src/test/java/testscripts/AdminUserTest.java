package testscripts;

import java.io.IOException;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
//import utilities.PageUtility;


public class AdminUserTest extends BaseTest

{
	HomePage homepage;
 @Test(priority=1 ,retryAnalyzer=retry.Retry.class, description="This test case is to verify whether user is able to add and update admin details under Manage Admin")
public void addNewAdminUser() throws IOException

{

	String usernameValue = ExcelUtility.getStringData(1, 0, "loginpage");
	String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
	homepage=loginpage.clickOnSignIn();
	
	
	AdminUserPage adminuserpage=new AdminUserPage(driver);
	adminuserpage=homepage.clickOnMoreInfoinAdminUser();
	adminuserpage.clickOnaddNewButton().enterUserNameandPassword();
	
	String dropdownValue = ExcelUtility.getStringData(1, 0, "admindropdown");
	adminuserpage.selectUserFromDropdown(dropdownValue);
	
	adminuserpage.clickOnSave();
	boolean success=adminuserpage.issuccessfulAlertDisplayed();
	Assert.assertTrue(success);
	
}
}
