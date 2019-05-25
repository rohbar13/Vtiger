package opportunities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpportunitiesList {

	public void addOpportunity(WebDriver driver,Opportunity op) {

		if(op.getOpportunityName()!=null)
		{
			driver.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys(op.getOpportunityName());
		}
		if(op.getOrganizationName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getOrganizationName());
		}
		if(op.getContactName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getContactName());
		}
		if(op.getOpportunityName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getAmount());
		}
		if(op.getOrganizationName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getType());
		}
		if(op.getContactName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getLeadSource());
		}
		if(op.getOpportunityName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getNextStep());
		}
		if(op.getOrganizationName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getAssignedTo());
		}
		if(op.getContactName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getSalesStage());
		}
		if(op.getOpportunityName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getCampaignSource());
		}
		if(op.getOrganizationName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getProbability());
		}
		if(op.getContactName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getForecastAmount());
		}
		if(op.getOpportunityName()!=null)
		{
			driver.findElement(By.id("")).sendKeys(op.getDescription());
		}
	}

	public void filterOpportunities() {

	}

	public void add() {

	}

	public void edit() {

	}

	public void delete() {

	}
	
	public void importOpportunity()
	{
		
	}
	
	public void findDuplicates() {
		
	}

}
