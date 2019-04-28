package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testng1 {

	@Test
	public void testmethod1() {
		System.out.println("Hello world1");
		
		boolean v1 = false;
		boolean v2 = true;
		
		Reporter.log("Open Browser");
		Reporter.log("Close Browser");
		
		Assert.assertEquals(v1, v2);
		
	}
	
	
	@Test
	public void testmethod2() {
		System.out.println("Hello world2");
		
		boolean v1 = false;
		boolean v2 = true;
		
		Reporter.log("Open Browser");
		Reporter.log("Close Browser");
		
		Assert.assertEquals(v1, v2);
		
	}
	
	
	@Test
	public void testmethod3() {
		System.out.println("Hello world3");
		
		boolean v1 = false;
		boolean v2 = false;
		
		Reporter.log("Open Browser");
		Reporter.log("Close Browser");
		
		Assert.assertEquals(v1, v2);
		
	}
	
}
