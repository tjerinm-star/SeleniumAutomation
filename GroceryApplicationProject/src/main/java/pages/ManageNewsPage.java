package pages;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")
	WebElement add_new_news;
	@FindBy(id = "news")
	WebElement news_field;
	@FindBy(name = "create")
	WebElement news_save_button;
	@FindBy(xpath = "//a[@href='javascript:void(0)']")
	WebElement search_newly_added_news;
	@FindBy(name = "un")
	WebElement search_manage_field;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	WebElement reset_news;
	@FindBy(name = "Search")
	WebElement news_search_button;
	@FindBy(xpath = "// h5[text()=' Alert!']")
	WebElement alertTextMessage;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]")
	WebElement serchResultNewNews;

	public ManageNewsPage creatingNewNews() {
		add_new_news.click();
		return this;
	}

	public ManageNewsPage enterTheNewNewsField(String newNews) {
		news_field.sendKeys(newNews);
		return this;
	}

	public ManageNewsPage clickOnNewsSaveButton() {
		news_save_button.click();
		return this;
	}

	public ManageNewsPage searchingTheNewlyAddedNews() {
		search_newly_added_news.click();
		return this;
	}

	public ManageNewsPage enterSearchingNewsTitleField(String searchNews) {
		search_manage_field.sendKeys(searchNews);
		return this;

	}

	public ManageNewsPage clickOnSearchButton() {
		news_search_button.click();
		return this;
	}

	public ManageNewsPage resettingTheNews() {
		reset_news.click();
		return this;

	}

	public boolean isNewNewsCreatedSuccessfully() {
		return alertTextMessage.isDisplayed();
	}

	public boolean getSearchResultsNewNews() {
		return serchResultNewNews.isEnabled();

	}

	public boolean ResetNewNews() {
		return reset_news.isEnabled();
	}

}
