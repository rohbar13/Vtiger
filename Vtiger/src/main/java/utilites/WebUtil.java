package utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebUtil {

	

/**
 * This method will derive element from the information provided in parameters below
 * @param driver
 * @param locatorType
 * @param element
 * @return
 */
	public WebElement getElement(WebDriver driver,String locatorType,String element) {
		
		WebElement el = null;
		
		locatorType = locatorType.toLowerCase();
		
		switch (locatorType) {
		case "id":
			el = driver.findElement(By.id(element));
			break;
		case "name":
			el = driver.findElement(By.name(element));
			break;
		case "xpath":
			el = driver.findElement(By.xpath(element));
			break;
		case "linktext":
			el = driver.findElement(By.linkText(element));
			break;
		case "partiallinktext":
			el = driver.findElement(By.partialLinkText(element));
			break;
		case "classname":
			el = driver.findElement(By.className(element));
			break;
		case "cssselector":
			el = driver.findElement(By.cssSelector(element));
			break;
		case "tagname":
			el = driver.findElement(By.tagName(element));
			break;

		default:
			break;
		}
		
		return el;
		
	}
	
	public void clickElement(WebDriver driver,String locatorType,String element) {
		WebElement el = getElement(driver, locatorType, element);
		moveToElement(driver, el);
		el.click();
	}
	
	public void sendKeys(WebDriver driver,String locatorType,String element,String value) {
		WebElement el = getElement(driver, locatorType, element);
		moveToElement(driver, el);
		el.sendKeys(value);
	}
	
	public void moveToElement(WebDriver driver,WebElement element) {
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void getText(){
		
	}
	
	public void getTitle() {
		
	}
	
	public void selectValueInDropDown() {
		
	}
	
	public void dragDrop() {
		
	}
	
	public void selectDropDropSearch(WebDriver driver,String dropdownName, String value) throws InterruptedException {
		Thread.sleep(1500);
		WebElement el = driver.findElement(By.xpath("//select[@name='"+dropdownName+"']/following-sibling::div"));
		
		moveToElement(driver, el);
		
		el.click();
		Thread.sleep(1000);
		WebElement salText = el.findElement(By.xpath(".//input"));
		salText.sendKeys(value);
		salText.sendKeys(Keys.ENTER);
		
	}
	
	
	
	
	
}
