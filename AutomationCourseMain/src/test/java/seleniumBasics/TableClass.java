package seleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableClass extends Base {
	public void tableHandling() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement showMore = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showMore.click();

		// to fetch entire table data
		WebElement tableField = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(tableField.getText());

		// to select a particular row of data in the table
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']//tbody//tr[2]"));
		System.out.println(tableRow.getText());

	}

	public static void main(String[] args) {
		TableClass table = new TableClass();
		table.initializeBrowser();
		table.tableHandling();
		table.driverCloseQuit();

	}

}
