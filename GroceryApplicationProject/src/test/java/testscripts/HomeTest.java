package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest  extends BaseTest
{
	
	@Test(description="Verify user is able to successfully logout")
public void verifyUserIsAbleToSuccessfullyLogout() throws IOException
{
	
	String username=ExcelUtility.getStringData(0, 0,"LoginSheet");
	String password =ExcelUtility.getStringData(0, 1,"LoginSheet");
	
	LoginPage loginpage= new LoginPage(driver);
    loginpage.enterUsernameOnUsernameField(username);
    loginpage.enterPasswordOnPasswordField(password);
    loginpage.clickOnSigninButton();
    
    HomePage homepage = new HomePage(driver);
    homepage.clickOnAdminLogoutIcon();
    homepage.clickOnLogoutButton();
    
}
	
	
	
}
