package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	public void handlingFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		//XPath of all frames in the webpage
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		
		//to get the total count of frames in the webpage
		int framesCount = iframes.size();
		System.out.println(framesCount);
		
		//XPath of the frame 'This is a Sample page'
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
		//switch to the frame 'This is a Sample page'
		driver.switchTo().frame(firstFrame);
		
		//XPath of the text in the frame 'This is a Sample page'
		WebElement frameText=driver.findElement(By.id("sampleHeading"));
		
		//print text in the frame
		System.out.println(frameText.getText());
		
		//switch to main page,frame to web page
		driver.switchTo().defaultContent();
		
	}
	
	

	public static void main(String[] args) {
		HandlingFrames frames = new HandlingFrames();
		frames.initializeBrowser();
		frames.handlingFrames();
		frames.driverCloseQuit();

	}

}
