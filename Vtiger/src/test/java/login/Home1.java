package login;

public class Home1 {
	
	
	private static Home1 lp;
	public Home1 getLoginPageObj()
	{
		if(lp==null)
		{
			lp = new Home1();
			System.out.println("Object Initialized");
		}
		
		return lp;
	}
	
}
