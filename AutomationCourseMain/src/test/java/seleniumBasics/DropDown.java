package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	public void handlingDropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select = new Select(dropDown1);
		select.selectByIndex(3);
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select1 = new Select(dropDown2);
		select1.selectByVisibleText("TestNG");
		WebElement dropDown3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select2 = new Select(dropDown3);
		select2.selectByValue("javascript");

	}

	public static void main(String[] args) {
		DropDown drop = new DropDown();

		drop.initializeBrowser();
		drop.handlingDropDown();
		// drop.driverCloseQuit();

	}

}
