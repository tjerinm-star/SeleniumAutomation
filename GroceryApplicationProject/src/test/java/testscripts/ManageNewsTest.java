package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends BaseTest
{
	
	@Test(description="Verify that user can add new news after successful login")
	public void verifyUserIsAbleToAddNewNews() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0,"LoginSheet");
		String password =ExcelUtility.getStringData(0, 1,"LoginSheet");
		
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username);
	    loginpage.enterPasswordOnPasswordField(password);
	    loginpage.clickOnSigninButton();
	    
	    HomePage homepage = new HomePage(driver);
	    homepage.clickOnManageNewsMoreInfo();
	    
	    ManageNewsPage managenews = new ManageNewsPage(driver);
	    managenews.creatingNewNews();
	    managenews.enterTheNewNewsField();
	    managenews.clickOnNewsSaveButton();
	  
	        
	}
	@Test(description="Verify that user can search newly added news")
	
	public void verifyUserIsAbleToSearchNews() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0,"LoginSheet");
		String password =ExcelUtility.getStringData(0, 1,"LoginSheet");
		
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username);
	    loginpage.enterPasswordOnPasswordField(password);
	    loginpage.clickOnSigninButton();
	    
	    HomePage homepage = new HomePage(driver);
	    homepage.clickOnManageNewsMoreInfo();
	    
	    ManageNewsPage managenews = new ManageNewsPage(driver);
	    managenews.searchingTheNewlyAddedNews();
	    managenews.enterSearchingNewsTitleField();
	    managenews.clickOnSearchButton();
	}
	
	@Test(description="Verify that user can refresh or reset the news list")
	public void verifyUserIsAbleToRefreshNews() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0,"LoginSheet");
		String password =ExcelUtility.getStringData(0, 1,"LoginSheet");
		
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username);
	    loginpage.enterPasswordOnPasswordField(password);
	    loginpage.clickOnSigninButton();
	    
	    HomePage homepage = new HomePage(driver);
	    homepage.clickOnManageNewsMoreInfo();
	    
	    ManageNewsPage managenews = new ManageNewsPage(driver);
	    managenews.resettingTheNews();
	}

}
