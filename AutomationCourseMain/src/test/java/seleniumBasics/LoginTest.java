package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestNGBase {
	@Test
	public void verifyUserLoginWithValidUsernameAndValidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
	}
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidalidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauc");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndvalidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_use");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_use");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauc");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
	}

}
