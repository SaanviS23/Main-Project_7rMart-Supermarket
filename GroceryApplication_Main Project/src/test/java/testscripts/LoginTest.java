package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseTest

{ HomePage homepage;
	
	@Test(priority = 1, description="This test case is to verify whether user is able to login using valid username and password")
	public void verifytheUserIsAbleToLoginUsingValidCredentials() throws IOException

	{

		String usernameValue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		boolean homepage = loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepage, Constant.VALIDMESSAGE);
	}

	@Test(priority = 2, description="This test case is to verify whether user is able to login using valid username and invalid password")
	public void verifytheUserIsAbleToLoginUsingValidUserNameandInvalidPassword() throws IOException

	{

		String usernameValue = ExcelUtility.getStringData(2, 0, "loginpage");
		String passwordValue = ExcelUtility.getStringData(2, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		boolean alertmessage = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertmessage, Constant.INVALIDMESSAGE);
	}

	@Test(priority = 3,description="This test case is to verify whether user is able to login using invalid username and valid password")
	public void verifytheUserIsAbleToLoginUsinginValidUserNameandValidPassword() throws IOException

	{

		String usernameValue = ExcelUtility.getStringData(3, 0, "loginpage");
		String passwordValue = ExcelUtility.getStringData(3, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver); // constructor - LoginPage(), Test is passing through one class to
														// another class hence driver should be pass through
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		boolean alertmessage = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertmessage,Constant.INVALIDMESSAGE);

	}

	@Test(priority = 4,  description="This test case is to verify whether user is able to login using invalid username and password")
	public void verifytheUserIsAbleToLoginUsinginValidUserNameandinValidPassword() throws IOException

	{

		String usernameValue = ExcelUtility.getStringData(4, 0, "loginpage");
		String passwordValue = ExcelUtility.getStringData(4, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver); // constructor - LoginPage(), Test is passing through one class to
														// another class hence driver should be pass through
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		boolean alertmessage = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertmessage,Constant.INVALIDMESSAGE);

	}

}
