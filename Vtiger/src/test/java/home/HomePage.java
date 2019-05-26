package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

	public WebDriver clickModule(WebDriver driver, String moduleName) throws InterruptedException {
		moduleName = moduleName.toLowerCase();

		switch (moduleName) {

		case "leads":
			Thread.sleep(2500);
			driver.findElement(By.id("menubar_item_Leads")).click();
			break;
		case "contacts":
			Thread.sleep(2500);
			driver.findElement(By.id("menubar_item_Contacts")).click();
			break;
		case "opportunities":
			Thread.sleep(2500);
			driver.findElement(By.id("menubar_item_Potentials")).click();
			break;
		case "products":
			Thread.sleep(2500);
			driver.findElement(By.id("menubar_item_Products")).click();
			break;
		}

		/*
		 * boolean isPageFound = false;
		 * 
		 * try { driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).
		 * isDisplayed(); isPageFound = true; } catch (Exception e) { isPageFound =
		 * false; }
		 * 
		 * Assert.assertEquals(isPageFound, true);
		 */

		return driver;
	}

}
