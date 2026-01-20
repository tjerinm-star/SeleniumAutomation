package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElement  extends Base
{
	
	
	public void verifyWebElement()
	{
		//WebElement for the message box
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement  messageBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		//sendKeys();
		messageBox.sendKeys("Sample Text Message");
		//WebElement for the show meassage button
		WebElement showmessageButton =driver.findElement(By.xpath("//button[@id='button-one']"));
		//click()
		showmessageButton.click();
		//WebElement for the your message field
		WebElement yourmessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		//getText()
		System.out.println(yourmessage.getText());
		//clear()
		messageBox.clear();
		//WebElement for total button 
		WebElement totalbutton = driver.findElement(By.xpath("//button[@id='button-two']"));
		//getTagName
		System.out.println(totalbutton.getTagName());
		//getCSSValue()
		System.out.println(showmessageButton.getCssValue("background-color"));
		
		
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) 
	{
		HandlingWebElement webElementHandling = new HandlingWebElement();
		webElementHandling.InstaizeBrowser();
		webElementHandling.verifyWebElement();

	}

}
