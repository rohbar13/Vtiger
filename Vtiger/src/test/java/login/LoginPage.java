package login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import home.HomePage;
import utilites.Property;

public class LoginPage {

	public HomePage login(WebDriver driver) throws IOException {

		Property pr = new Property();
		driver.findElement(By.id("username")).sendKeys(pr.getUserName());
		driver.findElement(By.id("password")).sendKeys(pr.getPassword());
		driver.findElement(By.xpath("//button[.='Sign in']")).click();

		return new HomePage();
		
	}
}
