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
 @FindBy(id="news")WebElement news_field;
 @FindBy(name="create")WebElement news_save_button;
 @FindBy(xpath="//a[@href='javascript:void(0)']")WebElement search_newly_added_news;
 @FindBy(name="un")WebElement search_manage_field;
 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement reset_news;
 @FindBy(name="Search")WebElement news_search_button;
   
 
    public void creatingNewNews()
    {
    	add_new_news.click();
    }
    	
    public void enterTheNewNewsField()
    {
    	news_field.sendKeys("Rainy Day");
    }
    public void clickOnNewsSaveButton()
    {
    	news_save_button.click();
    }
    
	public void searchingTheNewlyAddedNews()
	{
		search_newly_added_news.click();
	}
	public void enterSearchingNewsTitleField()
	{
		search_manage_field.sendKeys("Rainy Day");
		
	}
	public void clickOnSearchButton()
	{
		news_search_button.click();
	}
	
	public void resettingTheNews()
	{
		reset_news.click(); 
		
	}
	
}
