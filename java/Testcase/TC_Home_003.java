package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pageobject.DSPage;
import Pageobject.HomePage;
import Pageobject.LoginPage;
import Testcase.TC_LoginTest_001;
import utilitues.Actions;
import utilitues.Excelutility;
import utilitues.LoggerLoad;
import utilitues.ReadConfig;

public class TC_Home_003 extends Baseclass{
	
	LoginPage lp=new LoginPage(driver);
	 
	 
	//DSPage dsp= new DSPage(driver);
	
	@Test
	
	public void HomeTest () throws InterruptedException, IOException {
		//driver.get("https://dsportalapp.herokuapp.com/home");
		 HomePage hp=new HomePage(driver);
		 DSPage dsp= new DSPage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
		 TC_LoginTest_001 lp1=new TC_LoginTest_001();
		 
		 
		a.windowmax();
		a.sleep();
		lp1.loginTest(read.getusername(),read.getpassword());
		hp.clickdropdown();
		Thread.sleep(2000);
		hp.clickDSgetstart();
		a.sleep();
		a.scrolldown();
		a.sleep();
		
		
		LoggerLoad.info("DS : Time complexity started");
		dsp.clickbtnTimecomplexity();
		a.sleep();
		a.scrolldown();
		dsp.clickbtnTryhere();
		hp.enterpythoncode();
		a.sleep();
		dsp.clickbtnRun();
		a.navigateback();
		a.navigateback();
		a.navigateback();
		
		hp.clickSignout();
	}
	

}
