package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public WebDriver openBrowser(String browserName) {
		browserName = browserName.toLowerCase();
		
		WebDriver driver = null;
		
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}

		return driver;
	}
	
	public void getURL(WebDriver driver,String URL) {
		driver.get(URL);
	}
	

}
