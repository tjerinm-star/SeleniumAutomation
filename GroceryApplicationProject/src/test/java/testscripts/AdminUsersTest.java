package testscripts;

import java.io.IOException;
import org.testng.annotations.Test;
import automationcore.BaseTest;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends BaseTest
{

	@Test(description="Verify that the admin user is able to add a new username")
	public void verifyUserIsAbleToAddNewUsernamePasswordAndSelectType() throws IOException
	
	{
		
		String username=ExcelUtility.getStringData(0, 0,"LoginSheet");
		String password =ExcelUtility.getStringData(0, 1,"LoginSheet");
		
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username);
	    loginpage.enterPasswordOnPasswordField(password);
	    loginpage.clickOnSigninButton();
	    
	    HomePage homepage = new HomePage(driver);
	    homepage.clickOnAdminUsersMoreInfo();
	    
	    AdminUsersPage adminuserspage=new AdminUsersPage(driver);
	    adminuserspage.creatingNewAdminUser();
	    FakerUtility faker = new FakerUtility();
	    String newUsername =faker.createRandomUsernmae();
	    String newPassword= faker.createRandomPassword();
	    		
	    adminuserspage.enterUsernmaeOnUsernameFiel(newUsername);
	    adminuserspage.enterPasswordOnPasswordField(newPassword);
	    adminuserspage.selectUsertypeOnUsertypeDropdown();
	    adminuserspage.clickOnSaveButton();
	    
	 }
	
	@Test(description="Verify that the admin user is able to search usernames using search filters")
	
	public void verifyUserIsAbleToSearchUsernames() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0,"LoginSheet");
		String password =ExcelUtility.getStringData(0, 1,"LoginSheet");
		
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username);
	    loginpage.enterPasswordOnPasswordField(password);
	    loginpage.clickOnSigninButton();
	    
	    HomePage homepage = new HomePage(driver);
	    homepage.clickOnAdminUsersMoreInfo();
	    
	    AdminUsersPage adminuserspage=new AdminUsersPage(driver);
	    adminuserspage.searchingNewlyAddUsernameAndUserType();
	    adminuserspage.enterSearchUsernameOnUsernameField();
	    adminuserspage.selectUsertypeOnSearchUsertypeDropdown();
	    adminuserspage.clickOnSearchButton();
		
	}
	
	@Test(description="Verify that the admin user is able to refresh or reset the username search results")
	
	public void  verifyUserIsAbleToRefreshUsernames() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0,"LoginSheet");
		String password =ExcelUtility.getStringData(0, 1,"LoginSheet");
		
		LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameOnUsernameField(username);
	    loginpage.enterPasswordOnPasswordField(password);
	    loginpage.clickOnSigninButton();
	    
	    HomePage homepage = new HomePage(driver);
	    homepage.clickOnAdminUsersMoreInfo();
	    
	    AdminUsersPage adminuserspage=new AdminUsersPage(driver);
	    adminuserspage.resettingTheUsernmaes();
	}
}
