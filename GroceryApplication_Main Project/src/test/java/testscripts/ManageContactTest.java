package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends BaseTest 

{
	HomePage homepage;
	@Test (priority=1 ,retryAnalyzer=retry.Retry.class,description="This test is to verify whether user is able to update contact details under ManageContact")
public void updateExistingContactUsdetails() throws IOException

{
	String usernameValue = ExcelUtility.getStringData(1, 0, "loginpage");
	String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");	
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
	homepage=loginpage.clickOnSignIn();


	ManageContactPage managecontact=new ManageContactPage(driver);
			
			managecontact=homepage.clickOnMoreinfoofContactus();
			managecontact.clickonactionlink().editEmailfieldValueandenterNew().clickonUpdatebutton();
			
			boolean savemessage=managecontact.isAlertDisplayed();
			Assert.assertTrue(savemessage,Constant.CONTACTUPDATEMESSAGE);
}
}
