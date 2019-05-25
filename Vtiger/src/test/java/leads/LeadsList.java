package leads;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import home.HomePage;
import login.LoginPage;
import utilites.Browser;
import utilites.TestData;
import utilites.WebUtil;

public class LeadsList{

	public Lead addLead(WebDriver driver) throws Exception {
		WebUtil el = new WebUtil();

		TestData td = new TestData();
		Map<String,String> testData = td.getTestData("Leads","Leads_004");
		
		Lead l = new Lead();
		
		l.salutation=testData.get("Salutation");
		l.firstName="Khubaib";
		l.lastName="Ali";
		l.email="khubaib.ali@gmail.com";
		l.company="Franconnect";
		l.website="http://www.gmail.com";
		l.mobile="9966885577";
		l.leadSource="Employee";
		l.fax="8855996655";
		l.assignedUser="Administrator";
		l.designation="Team Member";
		l.industry="Chemicals";
		l.phoneNumber="5544887755";
		l.description="Test Description";
		
		Thread.sleep(2500);

		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();

		el.selectDropDropSearch(driver,"salutationtype", l.salutation);
		
		el.sendKeys(driver, "id", "Leads_editView_fieldName_firstname", l.firstName);
		el.sendKeys(driver, "id", "Leads_editView_fieldName_lastname", l.lastName);
		el.sendKeys(driver, "id", "Leads_editView_fieldName_phone", l.phoneNumber);
		el.sendKeys(driver, "id", "Leads_editView_fieldName_company", l.company);
		el.sendKeys(driver, "id", "Leads_editView_fieldName_mobile", l.mobile);
		el.sendKeys(driver, "id", "Leads_editView_fieldName_designation", l.designation);
		el.sendKeys(driver, "id", "Leads_editView_fieldName_fax", l.fax);

		el.selectDropDropSearch(driver,"leadsource", l.leadSource);

		el.sendKeys(driver, "id", "Leads_editView_fieldName_email", l.email);

		el.selectDropDropSearch(driver,"industry", l.industry);

		el.selectDropDropSearch(driver, "assigned_user_id", l.assignedUser);

		driver.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();
		el.clickElement(driver, "id", "Leads_editView_fieldName_emailoptout");
		el.sendKeys(driver, "id", "Leads_editView_fieldName_description", l.description);
		el.clickElement(driver, "xpath", "//div/button[@type='submit']");

		boolean isEditPageVisible = false;

		try {
			isEditPageVisible = driver.findElement(By.id("Leads_editView_fieldName_firstname")).isDisplayed();
		} catch (Exception e) {
			isEditPageVisible = false;
		}
		
		Assert.assertEquals(false, isEditPageVisible);
		return l;
		
	}
	
	@Test
	public void searchLead() throws Exception
	{
		WebUtil el = new WebUtil();
		
		LoginPage lp = new LoginPage();
		
		Browser browser = new Browser();
		WebDriver driver = browser.openBrowser("chrome");
		browser.getURL(driver, "http://localhost:9990/");
		
		lp.login(driver);
		
		HomePage hp = new HomePage();
		hp.clickModule(driver,"Leads");
		
		Lead lead = addLead(driver);
		
		hp.clickModule(driver,"Leads");
		
		el.sendKeys(driver, "name", "firstname", lead.firstName);
		el.sendKeys(driver, "name", "lastname", lead.lastName);
		el.sendKeys(driver, "name", "company", lead.company);
		el.sendKeys(driver, "name", "phone", lead.phoneNumber);
		el.sendKeys(driver, "name", "email", lead.email);
		el.clickElement(driver, "xpath", "//button[.='Search']");
		
	}
}
