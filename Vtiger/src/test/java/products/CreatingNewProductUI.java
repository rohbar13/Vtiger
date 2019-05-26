package products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseUtil;

public class CreatingNewProductUI extends BaseUtil {
	private WebDriver driver;
	
	@FindBy(xpath="//div[@class='contentHeader row-fluid']//button[@type='submit']")
	private WebElement saveBtn;
	
	@FindBy(id="Products_editView_fieldName_productname")
	public WebElement productName;
	
	public CreatingNewProductUI(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickSave() {
		saveBtn.click();
	}
	
	public CreatingNewProductUI fillProductDetails(Product product) {
		
		if(product.getProductName()!=null)
		{
			getWebUtil().sendKeys(driver, productName, product.getProductName());
		}
		
		return this;
	}
	
	
}
