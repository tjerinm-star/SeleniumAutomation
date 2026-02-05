package pages;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage 
{
	public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")WebElement add_new_news;
 @FindBy(xpath="//a[@href='javascript:void(0)']")WebElement search_newly_added_news;
 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement reset_news;
 @FindBy(id="news")WebElement news_textbox;
 @FindBy(name="create")WebElement save_button;
 @FindBy(name="un")WebElement search_manage_box;
 @FindBy(name="Search")WebElement search_button;
    public void creatingNewNews()
    {
    	add_new_news.click();
    	news_textbox.sendKeys("Rainy Day");
    	save_button.click();
    	
    }
	
	public void searchingTheNewlyAddedNews()
	{
		search_newly_added_news.click();
		search_manage_box.sendKeys("Rainy Day");
		search_button.click();
	}
	
	public void resettingTheNews()
	{
		reset_news.click(); 
		driver.navigate().refresh();
	}
	
}
