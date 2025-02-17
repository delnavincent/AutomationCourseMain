package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locators() {
		// to go to input form page of obsqura testing application
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageField = driver.findElement(By.id("single-input-field"));// to locate using id
		WebElement messageField1 = driver.findElement(By.className("form-control"));// to locate using classname
		WebElement ShowmessageBox = driver.findElement(By.tagName("button"));// to locate using tagname
		WebElement headName = driver.findElement(By.name("description"));// to locate using name
		WebElement linkName = driver.findElement(By.linkText("Checkbox Demo"));// locate using link name
		WebElement linkNamePartial = driver.findElement(By.partialLinkText("Checkbox"));// locate using partial link
																						// name
		WebElement cssLocator = driver.findElement(By.cssSelector("button[id='button-one']"));// locate using css
																								// selector

		// /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button //absolute
		// XPath

		WebElement message = driver.findElement(By.xpath("//input[@id='single-input-field']"));// using XPath(relative
																								// XPath)
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement valueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement valueB = driver.findElement(By.xpath("//input[@id='value-b']"));

		driver.findElement(By.xpath("//input[contains(@id,'-b')]"));// for lengthy XPath
		driver.findElement(By.xpath("//button[text()='Show Message']"));// for locating lengthy text using XPath
		driver.findElement(By.xpath("//button[starts-with(text(),Show )]"));// for locating partial text using XPath
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.findElement(By.xpath("//button[@type='button'and @id='button-one'] "));// for locating using and
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics'] "));
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
	}

	public static void main(String[] args) {

		Locators locators = new Locators();
		locators.initializeBrowser();
		locators.locators();
		locators.driverCloseQuit();

	}

}
