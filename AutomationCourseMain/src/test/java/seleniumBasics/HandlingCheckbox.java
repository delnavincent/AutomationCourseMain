package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckbox extends Base {
	public void hadlingCheckbox()
	{
		//navigate to the checkbox Demo page
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbox1.click();
		//checkboxList containing 4 checkboxes...XPath of checkboxList containing 4 checkboxes
		List<WebElement> checkboxList=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(int i=0;i<checkboxList.size();i++)
		{
			checkboxList.get(i).click();
		}
		
		//navigate to Input Form page
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showMessageButton.isDisplayed());
		
		//navigate to Radio Button Demo page
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		//XPath of Female checkbox
		WebElement genderRadio=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		genderRadio.click();
		System.out.println(genderRadio.isSelected());
		
		WebElement showValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showValue.isEnabled());
	}

	public static void main(String[] args) {
		HandlingCheckbox checkbox=new HandlingCheckbox();
		checkbox.initializeBrowser();
		checkbox.hadlingCheckbox();
		//checkbox.driverCloseQuit();
	}

}
