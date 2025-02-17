package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends Base {
	public void mouseAction()
	{
		//navigate to OTHERS page of Obsqura Testing
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));//XPath of Draggable n01
		Actions actions=new Actions(driver);
		actions.contextClick(rightClick).build().perform();
	}
	
	public void mouseAction2()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement mouseHover=driver.findElement(By.xpath("//a[text()='Drag and Drop']"));//XPath Drag and Drop
		Actions actions=new Actions(driver);
		actions.moveToElement(mouseHover).build().perform();
	}
	// keyboard action...press Ctrl+T ..(to perform new tab window command)
	public void keyboardAction() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);//KeyEvent is a class,here press keyboard key Ctrl
		robot.keyPress(KeyEvent.VK_T);//here press keyboard key T
		robot.keyRelease(KeyEvent.VK_CONTROL);//Here release keyboard key Ctrl
		robot.keyRelease(KeyEvent.VK_T);//Here release keyboard key T
	}

	public static void main(String[] args) {
		ActionsClass mouse=new ActionsClass();
		mouse.initializeBrowser();
		try {
			mouse.keyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//mouse.mouseAction();
		//mouse.mouseAction2();
		//mouse.driverCloseQuit();

	}

}
