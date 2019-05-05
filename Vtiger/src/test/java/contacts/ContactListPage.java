package contacts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.WebUtil;


public class ContactListPage extends WebUtil{

	private WebDriver driver;
	
	@FindBy(id="Contacts_listView_basicAction_LBL_ADD_RECORD")
	public WebElement addContactButton;
	
	public ContactListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public CreateNewContactPage clickAddContact() throws IOException
	{
		clickElement(driver, addContactButton);
		return new CreateNewContactPage();
	}
	
}
