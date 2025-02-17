package seleniumBasics;

public class BrowserCommands extends Base {

	public void browserCommands() {
		String url = driver.getCurrentUrl();// to print the url in console
		System.out.println(url);
		String title = driver.getTitle();// to get the title
		System.out.println(title);
		String handleId = driver.getWindowHandle();// to get the unique id
		System.out.println(handleId);
		String pageSource = driver.getPageSource();// to get source code
		System.out.println(pageSource);

	}

	public static void main(String[] args) {

		BrowserCommands browser = new BrowserCommands();
		browser.initializeBrowser();
		browser.browserCommands();
		browser.driverCloseQuit();
	}

}
