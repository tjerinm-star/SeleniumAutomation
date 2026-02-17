package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement usernameButton;
	@FindBy(name = "password")
	WebElement passwordButton;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signinButton;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboardTile;
	@FindBy(xpath = "//b[text()='7rmart supermarket']")
	WebElement pageTitle;
	@FindBy(xpath = "//p[text()='Sign in to start your session']")
	WebElement pageText;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	WebElement alertMessage;

	public LoginPage enterUsernameOnUsernameField(String username) {
		usernameButton.sendKeys(username);
		return this;

	}

	public LoginPage enterPasswordOnPasswordField(String password) {
		passwordButton.sendKeys(password);
		return this;
	}

	public HomePage clickOnSigninButton() {
		signinButton.click();
		return new HomePage(driver);
	}

	public boolean dashboardDisplay() {
		return dashboardTile.isDisplayed();

	}

	public String getTextFromTitle() {
		return pageTitle.getText();
	}

	public String getTextFromPage() {
		return pageText.getText();
	}

	public boolean getHeadingFromLoginPage() {
		return pageTitle.isEnabled();
	}

	public boolean alertMessageDisplay() {
		return alertMessage.isDisplayed();
	}

}
