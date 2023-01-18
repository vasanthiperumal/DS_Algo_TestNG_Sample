package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import Pageobject.DSPage;
import Pageobject.HomePage;
import Pageobject.QueuePage;
import Pageobject.StackPage;
import utilitues.Actions;
import utilitues.LoggerLoad;
import utilitues.ReadConfig;

public class TC_Stack_007 extends Baseclass{
	
	@Test(priority=1)
	public void Stack() throws IOException, InterruptedException {
		
		
		 
		
		HomePage hp=new HomePage(driver);
		DSPage dsp= new DSPage(driver);
		StackPage sp=new StackPage(driver);
		ReadConfig read= new ReadConfig();
		Actions a = new Actions();
		
		
		
			
			
			//driver.get("https://dsportalapp.herokuapp.com/home");
		    a.windowmax();
			TC_LoginTest_001 lp1=new TC_LoginTest_001();
			lp1.loginTest(read.getusername(),read.getpassword());
			hp.clickStackgetstart();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			a.scrolldown();
			Thread.sleep(1000);
		
		
			
			
			LoggerLoad.info("STACK : operations in stack started");
			sp.clicklinkOperationsinstack();
			a.sleep();
			a.scrolldown();
			a.tryhere1();
			hp.enterpythoncode();
			a.sleep();
			a.run1();
			a.navigateback();
			a.navigateback();
			
	}
	
	
	@Test(priority=2)
	public void stackimplementation() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		DSPage dsp= new DSPage(driver);
		StackPage sp=new StackPage(driver);
		ReadConfig read= new ReadConfig();
		Actions a = new Actions();
		     
			LoggerLoad.info("STACK : Implementation started");
			a.scrolldown();
			sp.clicklinkImplementation();
			a.sleep();
			a.scrolldown();
			a.tryhere1();
			a.pythoncode1();
			a.sleep();
			a.run1();
			a.navigateback();
			a.navigateback();
			
			
	}
	
	
	@Test(priority=3)
	
	public void stackapplication() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		DSPage dsp= new DSPage(driver);
		StackPage sp=new StackPage(driver);
		ReadConfig read= new ReadConfig();
		Actions a = new Actions();
			LoggerLoad.info("STACK : Applications started");
			sp.clicklinkApplications();
			a.sleep();
			a.scrolldown();
			a.tryhere1();
			a.pythoncode1();
			a.sleep();
			a.run1();
			a.navigateback();
			a.navigateback();
			a.navigateback();
			
			hp.clickSignout();
			
	}
		
		
	}


