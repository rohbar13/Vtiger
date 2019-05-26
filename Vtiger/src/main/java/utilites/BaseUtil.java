package utilites;

public class BaseUtil {
	
	private static WebUtil webutil;
	
	public WebUtil getWebUtil() {
		
		if(webutil==null)
		{
			webutil = new WebUtil();
		}
		return webutil;
	}
}
