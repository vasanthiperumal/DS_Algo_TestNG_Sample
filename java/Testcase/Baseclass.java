package Testcase;




import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Pageobject.HomePage;
import utilitues.ReadConfig;

public class Baseclass {
	
	
	
    static ReadConfig read= new ReadConfig();
	public static String baseURL=read.getapplicationurl();
	//public String username=read.getusername();
	//public String password=read.getpassword();
	
	
			
	//public static String baseURL="https://dsportalapp.herokuapp.com/";
	//public String username="Besusnswpy";
	//public String password="sdet-78$";
	public static WebDriver driver;
	public static Logger logger;
	
	
	
	@Parameters("browser") 
	@BeforeSuite
	public void setup(String br) {
		if (br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", read.getchromepath());
			driver=new ChromeDriver();
		}
		else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//test//resources//Drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", read.getedgepath());
			driver=new EdgeDriver();
		}
		
		//driver.get(baseURL);
	}
	
	
	
	
	
	/*
	@SuppressWarnings("deprecation")
	@BeforeSuite
    public void setup()
	{
		
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//Drivers//chromedriver.exe");
    	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
    }
  */
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
	
	
	public static void capturescreen(WebDriver driver,String tname) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		 Timestamp timestamp=new Timestamp(System.currentTimeMillis());
		 SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmss");
		  String currentdatestring = dateformat.format(timestamp);
		File source= ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"//src//test//resources//Screenshots//"+tname+"_"+currentdatestring+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Captured screenshot");
		
		
	}
	
	
	
	
	
	
}
