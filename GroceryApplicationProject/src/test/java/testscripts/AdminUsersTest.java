package testscripts;

import java.io.IOException;
import java.lang.invoke.ConstantBootstraps;

import org.testng.Assert;
import org.testng.annotations.Test;
import automationcore.BaseTest;
import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends BaseTest {
	HomePage home;
	AdminUsersPage adminuserspage;

	@Test(priority = 1, description = "Verify that the admin user is able to add a new username")
	public void verifyUserIsAbleToAddNewUsernamePasswordAndSelectType() throws IOException

	{

		String username = ExcelUtility.getStringData(0, 0, "LoginSheet");
		String password = ExcelUtility.getStringData(0, 1, "LoginSheet");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		home = loginpage.clickOnSigninButton();
		adminuserspage = home.clickOnAdminUsersMoreInfo();
		adminuserspage.creatingNewAdminUser();
		FakerUtility faker = new FakerUtility();
		String newUsername = faker.createRandomUsernmae();
		String newPassword = faker.createRandomPassword();
		adminuserspage.enterUsernameOnAdminUsernameField(newUsername).enterPasswordOnAdminPasswordField(newPassword)
				.selectUsertypeOnUsertypeDropdown().clickOnSaveButton();
		boolean isUserCreatedSuccessfully = adminuserspage.isUserCreatedSuccessfully();
		Assert.assertTrue(isUserCreatedSuccessfully, Constant.USER_CREATION_FAILED_MESSAGE);

	}

	@Test(priority = 2, description = "Verify that the admin user is able to search usernames using search filters")

	public void verifyUserIsAbleToSearchUsernames() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginSheet");
		String password = ExcelUtility.getStringData(0, 1, "LoginSheet");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		home = loginpage.clickOnSigninButton();
		adminuserspage = home.clickOnAdminUsersMoreInfo();
		adminuserspage.searchingNewlyAddUsernameAndUserType().enterSearchUsernameOnUsernameField()
				.selectUsertypeOnSearchUsertypeDropdown().clickOnSearchButton();
		boolean isSearchResultDisplayed = adminuserspage.isSearchResultDisplayed();
		Assert.assertTrue(isSearchResultDisplayed, Constant.SEARCH_FAILED_MESSAGE);

	}

	@Test(priority = 3, description = "Verify that the admin user is able to refresh or reset the username search results")

	public void verifyUserIsAbleToRefreshUsernames() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginSheet");
		String password = ExcelUtility.getStringData(0, 1, "LoginSheet");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		home = loginpage.clickOnSigninButton();
		adminuserspage = home.clickOnAdminUsersMoreInfo();
		adminuserspage.resettingTheUsernmaes();
		boolean isResetResultSuccessfull = adminuserspage.isResetResultSuccessfull();
		Assert.assertTrue(isResetResultSuccessfull, Constant.RESET_FAILED_MESSAGE);
	}
}
