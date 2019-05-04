package utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

	String userName;
	String password;
	String url;

	public String getUrl() {
		return url;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public Property() throws IOException {
		FileInputStream fis = new FileInputStream("build.property");
		Properties prop = new Properties();
		prop.load(fis);
		this.url = prop.getProperty("url");
		this.userName = prop.getProperty("userName");
		this.password = prop.getProperty("password");

	}
}
