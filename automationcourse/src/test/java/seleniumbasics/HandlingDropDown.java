package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown  extends Base 
{
	public void verifyDropDown()
	{
		
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown =driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select =new Select(dropdown);
		//select.selectByIndex(1);
		// select.selectByVisibleText("SQL");
		select.selectByValue("python");
	}
		
		
		public void verifyCheckBox()
		{
			driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			WebElement checkBox = driver.findElement(By.xpath("//input[@value='option-1']"))	;
			//System.out.println(checkBox.isSelected());
			checkBox.click();
			System.out.println(checkBox.isSelected());
		}
		public void verifyRadioButton()
		{
			driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			WebElement radio = driver.findElement(By.xpath("//input[@value='orange']"));
			radio.click();
		}
		
		
		


	
	public static void main(String[] args)
	{
		HandlingDropDown drop = new HandlingDropDown();
		drop.InstaizeBrowser();
		//drop.verifyDropDown();
		//drop.verifyCheckBox();
		drop.verifyRadioButton();

	}

}
