package seleniumBasics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowHandling extends Base {

	public void handlingMultipleWindow() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentWindowHandleid = driver.getWindowHandle();
		System.out.println(parentWindowHandleid);

		WebElement clickField = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickField.click();
		
		Set<String> handleids=driver.getWindowHandles();//multiple windows handleids
		
		Iterator<String> values = handleids.iterator();
 		while (values.hasNext()) {
			String currentId = values.next();
			if (!currentId.equals(parentWindowHandleid)) {
				System.out.println("Currentid is "+currentId);
				driver.switchTo().window(currentId);
				
				WebElement emailid = driver.findElement(By.xpath("//input[@name='emailid']"));
				emailid.sendKeys("nayana@gmail.com");
				WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
				submitButton.click();
			}
		}

	}

	public static void main(String[] args) {
		MultipleWindowHandling multiple = new MultipleWindowHandling();
		multiple.initializeBrowser();
		multiple.handlingMultipleWindow();
		// multiple.driverCloseQuit();


}

}
