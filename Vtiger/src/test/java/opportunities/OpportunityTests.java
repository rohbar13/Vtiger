package opportunities;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import home.HomePage;
import leads.Lead;
import login.LoginPage;
import utilites.Browser;
import utilites.TestData;
import utilites.WebUtil;

public class OpportunityTests {

	@Test
	public void createNewOpporunity() throws Exception
	{
		String testCaseId = "TC_Opp_createNewOpporunity_002";
		
		TestData td = new TestData();
		Map<String,String> testData = td.getTestData("Opportunities",testCaseId);
		
		Opportunity op = new Opportunity();
		op.setOpportunityName(testData.get("opportunityName"));
				
		
		WebUtil el = new WebUtil();
		
		Browser browser = new Browser();
		WebDriver driver = browser.openBrowser("chrome");
		browser.getURL(driver, "http://localhost:9990/");
		
		LoginPage lp = new LoginPage();
		lp.login(driver);
		
		HomePage hp = new HomePage();
		hp.clickModule(driver,"opportunities");
		
		driver.findElement(By.id("Potentials_listView_basicAction_LBL_ADD_RECORD")).click();
		
		OpportunitiesList ol = new OpportunitiesList();
		ol.addOpportunity(driver, op);
		
	}
	
}
