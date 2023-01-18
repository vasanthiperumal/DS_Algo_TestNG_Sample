package utilitues;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	
	public static Properties pro;
	
	
	public ReadConfig()
	{
		File src = new File("./src//test//resources//configuration//config.properties");
		
		try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is="+e.getMessage());
		}
	}

	
	public String getapplicationurl()
	{   String url=pro.getProperty("baseURL");
		return url;
			
	}
	
	public String getusername()
	{
	String username=pro.getProperty("username");
	return username;	
	}
	
	public String getpassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getchromepath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getfirefoxpath()
	{
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getedgepath()
	{
		String edgepath = pro.getProperty("edgepath");
		return edgepath;
	}
	
	public String geteditor()
	{   String url=pro.getProperty("editor");
		return url;
			
	}
}
