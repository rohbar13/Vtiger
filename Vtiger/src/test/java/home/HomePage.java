package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import login.LoginPage;

public class HomePage {

	@Test
	public void clickModule() throws InterruptedException {
		LoginPage lp = new LoginPage();
		
		WebDriver driver = lp.login();
		
		String moduleName = "leads";
		
		switch(moduleName) {
		
		case "leads":
			Thread.sleep(2500);
			driver.findElement(By.id("menubar_item_Leads")).click();
			break;
		}
		
		boolean isPageFound = false;
		
		try {
			driver.findElement(By.id("1111Leads_listView_basicAction_LBL_ADD_RECORD")).isDisplayed();
			isPageFound = true;
		}catch(Exception e) {
			isPageFound = false;
		}
		
		Assert.assertEquals(isPageFound, true);
		
	}
	
	
	@Test(dependsOnMethods = "clickModule")
	public void testing() {
		System.out.println("Testing depends on");
	}
	
	
}
