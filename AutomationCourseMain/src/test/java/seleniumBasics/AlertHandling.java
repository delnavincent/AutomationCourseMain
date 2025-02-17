package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	public void handlingAlerts() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void handlingConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlert.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

	public void handlingPrompt() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("delna");
		alert.accept();

	}

	public static void main(String[] args) {
		AlertHandling alert = new AlertHandling();
		alert.initializeBrowser();
		//alert.handlingAlerts();
		 alert.handlingConfirmAlert();
		//alert.handlingPrompt();
        // alert.driverCloseQuit();

	}

}
