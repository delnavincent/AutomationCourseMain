package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUploadUsingSendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFile.sendKeys(
				"C:\\Users\\hp\\eclipse-workspace\\AutomationCourseMain\\src\\test\\resources\\sample-5-page-pdf-a4-size.pdf");

		WebElement checkBox = driver.findElement(By.xpath("//input[@id='terms']"));
		checkBox.click();
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitButton.click();

	}

	public void fileUploadUsingRobot() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdfFile = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectPdfFile.click();

		// to get path to Robot class// file path passed as parameter to StringSelection
		StringSelection s = new StringSelection(
				"C:\\Users\\hp\\eclipse-workspace\\AutomationCourseMain\\src\\test\\resources\\sample-5-page-pdf-a4-size.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);// to share the path in StringSelection s
																				// to clipboard

		// Robot object creation
		Robot robot = new Robot();
		robot.delay(2500);// apply a delay of 2500 milliseconds to find the path
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		// pressing ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// releasing ctrl+v

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args) {
		FileUpload file = new FileUpload();
		file.initializeBrowser();
		// file.fileUploadUsingSendkeys();

		try {
			file.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// file.driverCloseQuit();

	}
}
