package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilites.Browser;

public class LoginPage {

	
	public WebDriver login() {
		Browser browser = new Browser();
		WebDriver driver = browser.openBrowser("Chrome");
		
		driver.manage().window().maximize();
		
		browser.getURL(driver, "http://localhost:9990/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		return driver;
		
		
		
	}
	
	
}
