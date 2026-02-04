package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest  extends BaseTestNG
{
	
	@Test
	
public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException

{
	/*WebElement username=driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
	
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	
	WebElement loginButton=driver.findElement(By.id("login-button"));
	loginButton.click();*/
		String username=ExcelUtility.getStringData(0, 0,"LoginPage");
		String password=ExcelUtility.getStringData(0, 1,"LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
		
		
		
	
}
	
	@Test
	
	public void verifyUseLoginWithValidUsernameAndInvalidPassword() throws IOException
	{
		/*WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("hello");
		
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();*/
		
		String username=ExcelUtility.getStringData(1, 0,"LoginPage");
		String password=ExcelUtility.getStringData(1, 1,"LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
	}
	@Test
	
	
	
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException
	{
		/*WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("user123");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();*/
		
		String username=ExcelUtility.getStringData(2, 0,"LoginPage");
		String password=ExcelUtility.getStringData(2, 1,"LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
		
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException
	{
		/*WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard123");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("hello");
		
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();*/
		
		String username=ExcelUtility.getStringData(3, 0,"LoginPage");
		String password=ExcelUtility.getStringData(3, 1,"LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
	}
	
	
	
	
	
}
