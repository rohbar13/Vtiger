package leads;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import home.HomePage;
import utilites.WebUtil;

public class LeadsList {

	@Test
	public void addLead() throws InterruptedException {
		WebUtil el = new WebUtil();

		HomePage hp = new HomePage();
		WebDriver driver = hp.clickModule("Leads");
		Thread.sleep(2500);

		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();

		el.selectDropDropSearch(driver,"salutationtype", "Prof.");
		
		el.sendKeys(driver, "id", "Leads_editView_fieldName_firstname", "Kunal");
		el.sendKeys(driver, "id", "Leads_editView_fieldName_lastname", "Kapoor");
		el.sendKeys(driver, "id", "Leads_editView_fieldName_phone", "9879879879");
		el.sendKeys(driver, "id", "Leads_editView_fieldName_company", "BBC");
		el.sendKeys(driver, "id", "Leads_editView_fieldName_mobile", "9988668899");
		el.sendKeys(driver, "id", "Leads_editView_fieldName_designation", "Manager");
		el.sendKeys(driver, "id", "Leads_editView_fieldName_fax", "1472583699");

		el.selectDropDropSearch(driver,"leadsource", "Trade Show");

		el.sendKeys(driver, "id", "Leads_editView_fieldName_email", "richard@abc.com");

		el.selectDropDropSearch(driver,"industry", "Apparel");

		el.selectDropDropSearch(driver, "assigned_user_id", "Support Group");

		driver.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();
		el.clickElement(driver, "id", "Leads_editView_fieldName_emailoptout");
		el.sendKeys(driver, "id", "Leads_editView_fieldName_description", "Text Area");
		el.clickElement(driver, "xpath", "//div/button[@type='submit']");

		boolean isEditPageVisible = false;

		try {
			isEditPageVisible = driver.findElement(By.id("Leads_editView_fieldName_firstname")).isDisplayed();
		} catch (Exception e) {
			isEditPageVisible = false;
		}
		
		
		Assert.assertEquals(false, isEditPageVisible);

	}

}
