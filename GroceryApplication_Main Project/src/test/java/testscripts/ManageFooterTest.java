package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;

public class ManageFooterTest extends BaseTest 


{
	HomePage homepage;
@Test (priority=1 ,retryAnalyzer=retry.Retry.class,description="This test is to verify whether user is able to update footer details under Manage Footer")
	
	public void updateFooterTextDetails() throws IOException
	
	{
	String usernameValue = ExcelUtility.getStringData(1, 0, "loginpage");
	String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
	homepage=loginpage.clickOnSignIn();
	
	ManageFooterPage managefooter=new ManageFooterPage(driver);
	managefooter=homepage.clickonmoreinfolinkonManageFooter();
	managefooter.clickonactionlink().editAndUpdateAddress().editAndUpdateEmail().clickOnSubmit();
	boolean savemessage=managefooter.isAlertDisplayed();
	Assert.assertTrue(savemessage);
	
	}


	
}
