package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base
{
	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");	
		String parentHandleId=driver.getWindowHandle();
		System.out.println(parentHandleId);
		
		WebElement clickLink=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickLink.click();
		 
		Set <String> handleId=driver.getWindowHandles();
		System.out.println(handleId);
		
		Iterator<String> it =handleId.iterator();
		while(it.hasNext())
		{
			String currentId=it.next();
			if(!currentId.equals(parentHandleId))
			{
				driver.switchTo().window(currentId);
				WebElement mailid=driver.findElement(By.xpath("//input[@name='emailid']"));
				mailid.sendKeys("tjerin.m@gmail.com");
				
				WebElement submit=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit.click();
			} 
		}
	}

	public static void main(String[] args)
	{
		MultipleWindowHandling  window = new MultipleWindowHandling();
		window.InstaizeBrowser();
		window.verifyMultipleWindow();
	
	}

}
