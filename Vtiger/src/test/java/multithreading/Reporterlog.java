package multithreading;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporterlog {
	@Test
	public void method1() throws InterruptedException {
		for(int x=0;x<5;x++)
		{
			Reporter.log("Method1");
			System.out.println("Method1");
			Thread.sleep(2000);
		}
	}
	
	@Test
	public void method2() throws InterruptedException {
		for(int x=0;x<5;x++)
		{
			Reporter.log("Method2");
			System.out.println("Method2");
			Thread.sleep(2000);
		}
	}
}
