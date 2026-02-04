package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.BaseTest;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseTest
{
	@Test
    public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException
    {
    	String username=ExcelUtility.getStringData(0, 0,"LoginSheet");
    	String password =ExcelUtility.getStringData(0, 1,"LoginSheet");
    	
    	LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username);
        loginpage.enterPasswordOnPasswordField(password);
        loginpage.clickOnSigninButton();
    	
    	
    }
	

@Test

     public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException
     {
        String username=ExcelUtility.getStringData(1, 0,"LoginSheet" );
 		String password=ExcelUtility.getStringData(1, 1,"LoginSheet");
 		
 		LoginPage loginPage = new LoginPage(driver);
 		loginPage.enterUsernameOnUsernameField(username);
 		loginPage.enterPasswordOnPasswordField(password);
 		loginPage.clickOnSigninButton();
    	 
	
     }

@Test
     public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException
     {
    	String username=ExcelUtility.getStringData(2, 0,"LoginSheet" );
  		String password=ExcelUtility.getStringData(2, 1,"LoginSheet");
  		
  		LoginPage loginPage = new LoginPage(driver);
  		loginPage.enterUsernameOnUsernameField(username);
  		loginPage.enterPasswordOnPasswordField(password);
  		loginPage.clickOnSigninButton();
    	 
     }


@Test
    public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException 
   {
	    String username=ExcelUtility.getStringData(3, 0,"LoginSheet" );
		String password=ExcelUtility.getStringData(3, 1,"LoginSheet");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSigninButton();
	   
   }

}
