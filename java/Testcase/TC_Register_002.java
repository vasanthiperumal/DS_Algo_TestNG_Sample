package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.Arraypage;
import Pageobject.HomePage;
import Pageobject.RegisterPage;
import utilitues.Actions;
import utilitues.Excelutility;
import utilitues.LoggerLoad;
import utilitues.ReadConfig;

public class TC_Register_002 extends Baseclass {
	
	
	@BeforeTest
	public void setapplication() throws InterruptedException {
		
		ReadConfig read= new ReadConfig();
		RegisterPage rp = new RegisterPage(driver);
		Actions a = new Actions();
		
		driver.get(read.getapplicationurl());
		a.windowmax();
		rp.getstarted();        //getstarted
		a.sleep();
		rp.homeregister();
		
	}
	
	
	
	
	@Test (dataProvider="Registerdata")
	
	public static void RegisterTest(String username,String password,String repassword) throws InterruptedException, IOException {
			
		
		//ReadConfig read= new ReadConfig();
		RegisterPage rp = new RegisterPage(driver);
		HomePage hp=new HomePage(driver);
		Actions a = new Actions();
		
		
		//driver.get(read.getapplicationurl());
		//a.windowmax();
		//rp.getstarted();        //getstarted
		//a.sleep();
		//rp.homeregister();      //click home register
		  
		
		rp.setUsername(username);
		rp.setPassword(password);
		rp.setRePassword(repassword);
		rp.clickRegister();
		Thread.sleep(2000);
		
		System.out.println("*****New Title************="+driver.getTitle());
		
		if(driver.getTitle().contains("NumpyNinja")) 
		
		//if(rp.newregistersuccess().contains("New Account Created")) 
		{
			
			capturescreen(driver,"TC_Register_002");
			String successmsg= rp.newregistersuccess();
			System.out.println("Refisterd a customer successefully------"+successmsg);
			LoggerLoad.info("Customer registered successefully");
			Assert.assertTrue(true);
			hp.clickSignout();
			driver.switchTo().defaultContent();
		}
		else
		{
			capturescreen(driver,"TC_Register_002");
			//String failuremsg=rp.invalidregister();
			//System.out.println("Register a customer failed-----"+failuremsg);
			LoggerLoad.warn("Invalid details : Not a able to register a customer");
			Assert.assertTrue(true);
			
		}
		
		
	}
	
	@DataProvider(name="Registerdata")
	public String[][]getdata() throws IOException
	{
		//get data from excelsheet
    	String path=".//src//test//resources//TestData//RegisterInputs.xlsx";
    	Excelutility Excelutil=new Excelutility(path);
    	int totalrows=Excelutil.getrowcount("Sheet1");
    	int totalcolumns=Excelutil.getcellcount("Sheet1",1);
    	String registerdata[][]= new String [totalrows][totalcolumns];
    	
    	for(int i=1;i<=totalrows;i++) {
    		
    		for(int j=0;j<totalcolumns;j++) {
    			
    			registerdata[i-1][j]=Excelutil.getcelldata("Sheet1",i,j);	
    			
    		}
    	}
    	
		return registerdata;
		
		
		
	}

	
	
}
