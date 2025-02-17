package seleniumBasics;

public class NavigationCommands extends Base {
	public void navigationCommands() {
		driver.navigate().to("https://www.amazon.in/");// to navigate to other webpage(here amazone)
		driver.navigate().back();// to back to obsqura testing webpage
		driver.navigate().forward();// to get forward required url
		driver.navigate().refresh();// to refresh the current page
	}

	public static void main(String[] args) {
		NavigationCommands navigation = new NavigationCommands();
		navigation.initializeBrowser();
		navigation.navigationCommands();
		// navigation.driverCloseQuit();
		

	}

}
