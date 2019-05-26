package products;

import java.util.Map;

import utilites.TestData;

public class Product {

	private String productName;
	private String productActive;
	private String partNumber;
	private String manufacturer;
	private String salesStartDate;
	private String salesEndDate;
	private String handler;
	
	public String getProductName() {
		return productName;
	}
	public String getProductActive() {
		return productActive;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getSalesStartDate() {
		return salesStartDate;
	}
	public String getSalesEndDate() {
		return salesEndDate;
	}
	public String getHandler() {
		return handler;
	}
	
	
	public Product(String testCaseId) throws Exception {
		
		TestData td = new TestData();
		Map<String,String> testData = td.getTestData("Products",testCaseId);
		
		productName = testData.get("productName");
		productActive = testData.get("productActive");
		partNumber = testData.get("partNumber");
		manufacturer = testData.get("manufacturer");
		salesStartDate = testData.get("salesStartDate");
		salesEndDate = testData.get("salesEndDate");
		handler = testData.get("handler");
		
	}
	
	
}
