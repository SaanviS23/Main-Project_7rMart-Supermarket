package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;


public class ManageNewsTest extends BaseTest

{
	HomePage homepage;
	@Test(priority = 1,description="This test is to verify whether user is able to add new news under ManageNews")
	public void addnewNewsUnderManageNews() throws IOException {
		String usernameValue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");
		String addnews=ExcelUtility.getStringData(1, 0, "addnews");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();

		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews=homepage.clickOnmoreInfolinkOnManageNews();
		managenews.clickOnaddNewButton().addNewDiscount(addnews).clickonSave();
		boolean savemessage=managenews.isAlertisDisplayed();
		Assert.assertTrue(savemessage);
		
		

	}

}
