package products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsListUI{

	private WebDriver driver;
	
	@FindBy(id="Products_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addProductBtn;
	
	public ProductsListUI(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public CreatingNewProductUI clickAddProduct() {
		addProductBtn.click();
		return new CreatingNewProductUI(driver);
	}
	
	
}
