package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
    }   
	 
	
	@FindBy(id="user-name")WebElement usernameButton;
	@FindBy(id="password")WebElement passwordButton;
	@FindBy(id="login-button")WebElement loginButton;
	
	public void enterUsernameOnUserNameField(String username)
	{
		usernameButton.sendKeys(username);
	}
	public void enterPasswordOnPasswordField(String password)
	{
		passwordButton.sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	

}
