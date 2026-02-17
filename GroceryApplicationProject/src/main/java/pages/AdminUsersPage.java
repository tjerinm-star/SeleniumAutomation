package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsersPage {

	public WebDriver driver;
	WaitUtility wait = new WaitUtility();
	PageUtility page = new PageUtility();

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='javascript:void(0)']")
	WebElement add_new_user;
	@FindBy(id = "username")
	WebElement add_new_username;
	@FindBy(id = "password")
	WebElement add_new_password;
	@FindBy(id = "user_type")
	WebElement select_usertype;
	@FindBy(name = "Create")
	WebElement click_save_button;
	@FindBy(xpath = "//a[contains(text(),'Search')]")
	WebElement search_admin_users;
	@FindBy(id = "un")
	WebElement search_username_feild;
	@FindBy(id = "ut")
	WebElement search_usertype;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement click_search_button;
	@FindBy(xpath = "//a[text()=' Reset']")
	WebElement click_reset_button;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	WebElement alertMessage;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]")
	WebElement userSearchResult;

	public AdminUsersPage creatingNewAdminUser() {
		add_new_user.click();
		return this;
	}

	public AdminUsersPage enterUsernameOnAdminUsernameField(String newUsername) {
		add_new_username.sendKeys(newUsername);
		return this;

	}

	public AdminUsersPage enterPasswordOnAdminPasswordField(String newPassword) {
		add_new_password.sendKeys(newPassword);
		return this;
	}

	public AdminUsersPage selectUsertypeOnUsertypeDropdown() {
		page.selectDropDownWithIndex(select_usertype, 1);
		return this;
		// Select select = new Select(select_usertype);
		// select.selectByValue("admin");
	}

	public void clickOnSaveButton() {
		wait.waitUntilElementToBeClickable(driver, click_save_button);
		click_save_button.click();
	}

	public AdminUsersPage searchingNewlyAddUsernameAndUserType() {
		search_admin_users.click();
		return this;

	}

	public AdminUsersPage enterSearchUsernameOnUsernameField() {
		search_username_feild.sendKeys("secret1");
		return this;
	}

	public AdminUsersPage selectUsertypeOnSearchUsertypeDropdown() {
		page.selectDropDownWithIndex(search_usertype, 1);
		return this;

		// Select select = new Select(search_usertype);
		// select.selectByValue("admin");
	}

	public AdminUsersPage clickOnSearchButton() {
		click_search_button.click();
		return this;
	}

	public AdminUsersPage resettingTheUsernmaes() {
		click_reset_button.click();
		return this;
	}

	public boolean isUserCreatedSuccessfully() {
		return alertMessage.isEnabled();
	}

	public boolean isSearchResultDisplayed() {
		return userSearchResult.isDisplayed();
	}

	public boolean isResetResultSuccessfull() {
		return click_reset_button.isDisplayed();
	}

}
