package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")
	WebElement admin_logout_icon;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")
	WebElement logout_button;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	WebElement more_info_manage_news;
	@FindBy(xpath = "//a[contains(text(),'More info')]")
	WebElement more_info_admin_users;
	@FindBy(xpath = "//a[text()='Home']")
	WebElement homeText;

	public HomePage clickOnAdminLogoutIcon() {
		admin_logout_icon.click();
		return this;
	}

	public LoginPage clickOnLogoutButton() {
		logout_button.click();
		return new LoginPage(driver);
	}

	public ManageNewsPage clickOnManageNewsMoreInfo() {
		more_info_manage_news.click();
		return new ManageNewsPage(driver);
	}

	public AdminUsersPage clickOnAdminUsersMoreInfo() {
		more_info_admin_users.click();
		return new AdminUsersPage(driver);
	}

	public boolean getHomeTextDisplay() {
		return homeText.isDisplayed();
	}

	public boolean isManageNewsMoreInfoDisplayed() {
		return more_info_manage_news.isDisplayed();
	}

}
