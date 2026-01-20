package seleniumbasics;

public class HandlingBrowserCommands extends Base
{

	public void verifyBrowserCommand()
	{
		String title =  driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String id = driver.getWindowHandle();
		System.out.println(id);
		String sourse=driver.getPageSource();
		System.out.println(sourse);
		
		
	}
	public void verifyNavigationCommand()
	{
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	
	
	
	public static void main(String[] args) 
	{
		HandlingBrowserCommands browser = new HandlingBrowserCommands();
		
		browser.InstaizeBrowser();
		browser.verifyBrowserCommand();
		browser.verifyNavigationCommand();
		
	}

}
