package Testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.HomePage;
import Pageobject.LoginPage;
import Pageobject.RegisterPage;
import utilitues.Actions;
import utilitues.Excelutility;
import utilitues.LoggerLoad;
import utilitues.ReadConfig;

public class TC_LoginTestValid extends Baseclass {
	
	
	@Test(dataProvider="Logindata")
	public void loginTest(String username,String password) throws IOException, InterruptedException
	{
		
		ReadConfig read= new ReadConfig();
		RegisterPage rp = new RegisterPage(driver);
		HomePage hp=new HomePage(driver);
		Actions a = new Actions();
		LoginPage lp=new LoginPage(driver);
		
		
		driver.get(read.getapplicationurl());
		a.windowmax();
		rp.getstarted();
		Thread.sleep(200);
		hp.clickSignin();
		 
		
		LoggerLoad.info("URL opened");
		
		lp.setUsername(username);
		LoggerLoad.info("Entered username");
		
		
		lp.setPassword(password);
		LoggerLoad.info("Entered password");
		
		
		lp.clickLogin();
		Thread.sleep(3000);
		
		System.out.println("*****New Title************="+driver.getTitle());
			
		//Assert.assertEquals("NumpyNinja", driver.getTitle());
		
		if (driver.getTitle().equalsIgnoreCase("NumpyNinja"))
		{
			LoggerLoad.info("Login successful");
			capturescreen(driver,"TC_LoginTestValid");
			Assert.assertTrue(true);
			hp.clickSignout();
		}
		else {
			LoggerLoad.info("Login failed : Invalid data");
			capturescreen(driver,"TC_LoginTestValid");
			Assert.assertTrue(false);
			LoggerLoad.info("Testcase failed and captured screenshot");
		}
	}
	
	
	@DataProvider (name="Logindata")
    
	public String[][] getdata() throws IOException
	  {
    	
    	//get data from excelsheet
    	String path=".//src//test//resources//TestData//Loginvalidinputs.xlsx";
    	Excelutility Excelutil=new Excelutility(path);
    	int totalrows=Excelutil.getrowcount("Sheet1");
    	int totalcolumns=Excelutil.getcellcount("Sheet1",1);
    	String logindata[][]= new String [totalrows][totalcolumns];
    	
    	for(int i=1;i<=totalrows;i++) {
    		
    		for(int j=0;j<totalcolumns;j++) {
    			
    			logindata[i-1][j]=Excelutil.getcelldata("Sheet1",i,j);	
    			
    		}
    	}
    	
		return logindata;
		
		}
	

}
