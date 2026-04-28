package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends BaseTest

{ HomePage homepage;
	@Test ( description="This test case is to verify whether user is able to logout successfully")
	public void verifytheUserIsAbleToLoginUsingValidCredentials() throws IOException {
		String usernameValue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();

		HomePage logoutpage = new HomePage(driver);
		logoutpage.ClickonAdmin();
		logoutpage.ClickonLogOut();

		boolean signinpage = logoutpage.isSiginPageDisplayed();
		Assert.assertTrue(signinpage);
	}
}
