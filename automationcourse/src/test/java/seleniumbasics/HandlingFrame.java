package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrame extends Base
{
	
	public void verifyFrames()
	{
		//total frames
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalframes =driver.findElements(By.tagName("iframe"));
		System.out.println(totalframes.size());
		
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		
		WebElement frameHeading = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameHeading.getText());
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingFrame frame = new HandlingFrame();
		frame.InstaizeBrowser();
		frame.verifyFrames();
		
	}

}
