package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseTest;
import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends BaseTest {

	@Test(priority = 1, description = "Verify that user can add new news after successful login")
	public void verifyUserIsAbleToAddNewNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginSheet");
		String password = ExcelUtility.getStringData(0, 1, "LoginSheet");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSigninButton();

		HomePage homepage = new HomePage(driver);
		homepage.clickOnManageNewsMoreInfo();

		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.creatingNewNews();
		managenews.enterTheNewNewsField();
		managenews.clickOnNewsSaveButton();

		boolean isnewNewsCreatedSuccessfully = managenews.isNewNewsCreatedSuccessfully();
		Assert.assertTrue(isnewNewsCreatedSuccessfully, Constant.NEWS_CREATION_FAILED_MESSAGE);

	}

	@Test(priority = 2, description = "Verify that user can search newly added news")

	public void verifyUserIsAbleToSearchNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginSheet");
		String password = ExcelUtility.getStringData(0, 1, "LoginSheet");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSigninButton();

		HomePage homepage = new HomePage(driver);
		homepage.clickOnManageNewsMoreInfo();

		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.searchingTheNewlyAddedNews();
		managenews.enterSearchingNewsTitleField();
		managenews.clickOnSearchButton();

		boolean getSearchResultsNewNews = managenews.getSearchResultsNewNews();
		Assert.assertTrue(getSearchResultsNewNews, Constant.NEWS_SEARCH_FAILED_MESSAGE);

	}

	@Test(priority = 3, description = "Verify that user can refresh or reset the news list")
	public void verifyUserIsAbleToRefreshNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginSheet");
		String password = ExcelUtility.getStringData(0, 1, "LoginSheet");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSigninButton();

		HomePage homepage = new HomePage(driver);
		homepage.clickOnManageNewsMoreInfo();

		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.resettingTheNews();

		boolean ResetNewNews = managenews.ResetNewNews();
		Assert.assertTrue(ResetNewNews, Constant.NEWS_RESET_FAILED_MESSAGE);

	}

}
