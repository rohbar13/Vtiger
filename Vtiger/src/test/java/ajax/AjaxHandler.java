package ajax;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilites.Browser;

public class AjaxHandler {

	@Test
	public void handleAjax() throws InterruptedException {

		Browser browser = new Browser();
		WebDriver driver = browser.openBrowser("chrome");
		browser.getURL(driver, "https://onepagelove.com/tag/ajax");

	}
}