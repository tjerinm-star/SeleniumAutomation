package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  
{

	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")WebElement admin_logout_icon;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout_button;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement more_info_manage_news;
	
	
	public void clickOnAdminLogoutIcon()
	{
		admin_logout_icon.click();
	}
	
	public void clickOnLogoutButton()
	{
		logout_button.click();
	}
	public void clickOnManageNewsMoreInfo()
	{
		more_info_manage_news.click();
	}
	
	
}
