package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webElementCommands() {
		// navigate to input form page of obsqura testing
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		//XPath of Message
		WebElement messageField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		// Enter input(here Delna) in message field using sendKeys() 
		messageField.sendKeys("Delna");
		
		//XPath of ShowMessage button
		WebElement messageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		//click ShowMessage button using click()
		messageButton.click();
		
		//to clear the message
		//messageField.clear();
		
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));//XPath of YourMessage
		String message=yourMessage.getText();//to get the message in console output
		System.out.println(message);
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showMessageButton.getCssValue("background-color"));//to get colour of button
		
		System.out.println(showMessageButton.getSize());//get size of button
		System.out.println(showMessageButton.getTagName());//to get tag
		
	}

	public static void main(String[] args) {
		WebElementCommands element = new WebElementCommands();
		element.initializeBrowser();
		element.webElementCommands();
		 //element.driverCloseQuit();
	}

}
