package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationcore.BaseTest;
import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseTest {
	@Test(priority = 1, description = "Validating user login with valid credentials", groups = "smoke")
	public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginSheet");
		String password = ExcelUtility.getStringData(0, 1, "LoginSheet");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSigninButton();

		boolean dashboardDisplay = loginpage.dashboardDisplay();
		Assert.assertTrue(dashboardDisplay, Constant.VALID_CREDENTIAL_ERROR_MESSAGE);

	}

	@Test(priority = 2, description = "Validating user is  unable login with Invalid password")

	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginSheet");
		String password = ExcelUtility.getStringData(1, 1, "LoginSheet");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSigninButton();

		String expected = "7rmart supermarket";
		String actual = loginPage.getTextFromTitle();
		Assert.assertEquals(actual, expected, Constant.INVALID_PASSWORD_LOGIN_ERROR_MESSAGE);

	}

	@Test(priority = 3, description = "Validating user unable to Login with Invalid username")
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginSheet");
		String password = ExcelUtility.getStringData(2, 1, "LoginSheet");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSigninButton();

		String expected = "Sign in to start your session";
		String actual = loginPage.getTextFromPage();
		Assert.assertEquals(actual, expected, Constant.INVALID_USERNAME_LOGIN_ERROR_MESSAGE);

	}

	@Test(priority = 4, description = "Validating  user is unable to login inavlid credentials", groups = "smoke", dataProvider = "loginProvider")
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword(String username, String password)
			throws IOException {
		// String username = ExcelUtility.getStringData(3, 0, "LoginSheet");
		// String password = ExcelUtility.getStringData(3, 1, "LoginSheet");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSigninButton();

		boolean alertMessageDisplay = loginPage.alertMessageDisplay();
		Assert.assertTrue(alertMessageDisplay, Constant.INVALID_CREDENTIAL_LOGIN_ERROR_MESSAGE);

	}

	@DataProvider(name = "loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException {

		return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin123", "123" },
				// new Object[] {ExcelUtility.getStringData(3,
				// 0,"Login"),ExcelUtility.getStringData(3,1 ,"Login")}

		};
	}
}
