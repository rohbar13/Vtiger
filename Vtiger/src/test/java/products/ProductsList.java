package products;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import home.HomePage;
import login.LoginPage;
import opportunities.Opportunity;
import utilites.Browser;
import utilites.TestData;
import utilites.WebUtil;

public class ProductsList {

	private WebDriver driver;
	
	@BeforeTest
	public void basicOperation() throws IOException, InterruptedException {
		Browser browser = new Browser();
		driver = browser.openBrowser("chrome");
		browser.getURL(driver, "http://localhost:9990/");
		
		LoginPage lp = new LoginPage();
		lp.login(driver);
		
		HomePage hp = new HomePage();
		hp.clickModule(driver,"Products");
	}
	
	@Test
	public void addProduct() throws Exception {
		
		String testCaseId = "TC_Products_addNewProduct_001";
		
		Product product = new Product(testCaseId);
		
		ProductsListUI plist = new ProductsListUI(driver);
		plist.clickAddProduct().fillProductDetails(product).clickSave();
		
	}
	
	
	
	
	
	
}
