package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUploads  extends Base
{

	public void FileUploadingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement upload =driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C://Users//tjeri//git//SeleniumAutomation//automationcourse//src//test//resources//Assignment10.pdf");
		
		WebElement accept = driver.findElement(By.id("terms"));
		accept.click();
		
		WebElement submitt=driver.findElement(By.id("submitbutton"));
	    submitt.click();
	}
	public void FileUploadingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement robot =driver.findElement(By.id("pickfiles"));
		robot.click();
		
		StringSelection selection =new StringSelection("C://Users//tjeri//git//SeleniumAutomation//automationcourse//src//test//resources//Assignment10.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot r=new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUploads fileupload=new HandlingFileUploads();
		fileupload.InstaizeBrowser();
		fileupload.FileUploadingSendKeys();
		 try {
			fileupload.FileUploadingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
