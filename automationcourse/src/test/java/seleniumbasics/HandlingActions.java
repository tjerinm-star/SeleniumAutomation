package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base 
{
public void verifyRightClick()
{
	WebElement others = driver.findElement(By.xpath("//a[@id='others']"));
	Actions action = new Actions(driver);
	action.contextClick(others).build().perform();
	
	
}
public void verifyMouseOver()
{
	WebElement others = driver.findElement(By.xpath("//a[@id='others']"));
	Actions action = new Actions(driver);
	action.moveToElement(others).build().perform();
	
	
}
public void verifyDragandDrop()
{
driver.navigate().to("https://demoqa.com/droppable");
WebElement drag =driver.findElement(By.id("draggable"));
WebElement drop =driver.findElement(By.id("droppable"));
Actions action = new Actions(driver);
action.dragAndDrop(drag, drop).build().perform();


}
public void verifyKeyboardAction() throws AWTException
{
	Robot robot = new  Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_T);
}
public static void main(String[] args) 
	
	{
		HandlingActions actions=new HandlingActions();
		actions.InstaizeBrowser();
		//actions.verifyRightClick();
		//actions.verifyMouseOver();
		actions.verifyDragandDrop();
		try
		{
			actions.verifyKeyboardAction();
		}
		catch(AWTException e)
		{
			e.printStackTrace();
		}
		}

	}


