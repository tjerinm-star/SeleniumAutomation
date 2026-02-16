package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseTest;
import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends BaseTest {

	@Test(description = "Verify user is able to successfully logout", retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserIsAbleToSuccessfullyLogout() throws IOException {

		String username = ExcelUtility.getStringData(0, 0, "LoginSheet");
		String password = ExcelUtility.getStringData(0, 1, "LoginSheet");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSigninButton();

		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminLogoutIcon();
		homepage.clickOnLogoutButton();

		String expected = "Sign in to start your session";
		String actual = loginpage.getTextFromPage();
		Assert.assertEquals(actual, expected, Constant.LOGOUT_FAILED_MESSAGE);

	}

}
