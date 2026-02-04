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
	
	
	@FindBy(name="username")WebElement usernameButton;
	@FindBy(name="password")WebElement passwordButton;
	@FindBy(xpath="//button[@type='submit']")WebElement signinButton;
	
	
	public void enterUsernameOnUsernameField(String username) 
	{
		usernameButton.sendKeys(username);
		
	}
	public void enterPasswordOnPasswordField(String password)
	{
		passwordButton.sendKeys(password);
	}
	public void clickOnSigninButton()
	{
		signinButton.click();
	}
	

}
