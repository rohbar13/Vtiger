package login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilites.Browser;
import utilites.Property;

public class LoginPage {
	
	public WebDriver login() throws IOException {
		Browser browser = new Browser();
		WebDriver driver = browser.openBrowser("Chrome");
		
		driver.manage().window().maximize();
		
		
		Property pr = new Property();
		browser.getURL(driver, pr.getUrl());
		
		driver.findElement(By.id("username")).sendKeys(pr.getUserName());
		driver.findElement(By.id("password")).sendKeys(pr.getPassword());
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		return driver;
		
	}
}
