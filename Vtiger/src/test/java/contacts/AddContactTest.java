package contacts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import login.LoginPage;
import utilites.Browser;
import utilites.Property;

public class AddContactTest {

	@Test()
	public void addContact() throws IOException, InterruptedException
	{
		
		Property prop = new Property();
		//To Get the Browser Name
		String browserName = prop.getBrowser();
		
		Browser browser = new Browser();
		//To Get the driver
		WebDriver driver = browser.openBrowser(browserName);
		
		//To Hit the URL in the opened browser
		browser.getURL(driver, prop.getUrl());
		
		LoginPage lp = new LoginPage();
		//To login to the application
		lp.login(driver).clickModule(driver, "contacts");
		
		
		ContactListPage clp = new ContactListPage(driver);
		clp.clickAddContact();
		
		
	}
	
	
	@Test
	public void addContact2() throws IOException, InterruptedException
	{
		
		Property prop = new Property();
		//To Get the Browser Name
		String browserName = prop.getBrowser();
		
		Browser browser = new Browser();
		//To Get the driver
		WebDriver driver = browser.openBrowser(browserName);
		
		//To Hit the URL in the opened browser
		browser.getURL(driver, prop.getUrl());
		
		LoginPage lp = new LoginPage();
		//To login to the application
		lp.login(driver).clickModule(driver, "contacts");
		
		
		ContactListPage clp = new ContactListPage(driver);
		clp.clickAddContact();
		
		
	}
	
}
