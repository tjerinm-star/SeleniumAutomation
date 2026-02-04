package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base 
{
public void verifySimpleAlert()
{
	driver.navigate().to("https://demoqa.com/alerts");	
	WebElement confirm =driver.findElement(By.xpath("//button[@id='alertButton']"));
	confirm.click();
	Alert al=driver.switchTo().alert();
	al.accept();
}
	
	public void verifyComfirmAlert()
	{
		
		driver.navigate().to("https://demoqa.com/alerts");	
		WebElement ConfirmButton =driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ConfirmButton.click();
		Alert al =driver.switchTo().alert();
		//al.accept();
		al.dismiss();
		
	}
	
	public void verifyPromtAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");	
		WebElement prompt =driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt.click();
		Alert al =driver.switchTo().alert();
		al.sendKeys("Jerin");
		al.accept();
		
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		HandlingAlert alert = new HandlingAlert();
		alert.InstaizeBrowser();
		//alert.verifySimpleAlert();
		//alert.verifyComfirmAlert();
		alert.verifyPromtAlert();

	}

}
