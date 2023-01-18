package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pageobject.DSPage;
import Pageobject.HomePage;
import Pageobject.QueuePage;
import utilitues.Actions;
import utilitues.LoggerLoad;
import utilitues.ReadConfig;

public class TC_Queue_008 extends Baseclass {

	
@Test(priority=1)
	
	public void Queue() throws IOException, InterruptedException{
	
	QueuePage qp=new QueuePage(driver);
	HomePage hp=new HomePage(driver);
	DSPage dsp= new DSPage(driver);
	ReadConfig read= new ReadConfig();
	Actions a = new Actions();
	
		//driver.get("https://dsportalapp.herokuapp.com/home");
		
		a.windowmax();
		TC_LoginTest_001 lp1=new TC_LoginTest_001();
		lp1.loginTest(read.getusername(),read.getpassword());
		hp.clickQueuegetstart();
		a.scrolldown();
		a.sleep();
		
		
		LoggerLoad.info("QUEUE : Implementation of QUEUE started");
		qp.clicklinkImplementationofqueue();
		a.scrolldown();
		qp.clickbtnTryhere();
		hp.enterpythoncode();
		a.sleep();
		qp.clickbtnRun();
		a.navigateback();
		a.navigateback();
}


@Test(priority=2)
public void queuecollectionstarted() throws InterruptedException {
	
	QueuePage qp=new QueuePage(driver);
	HomePage hp=new HomePage(driver);
	DSPage dsp= new DSPage(driver);
	ReadConfig read= new ReadConfig();
	Actions a = new Actions();
	
		
		LoggerLoad.info("QUEUE : Implementation using collections started");
		qp.clicklinkImplementationusingcollections();
		dsp.clickbtnTryhere();
		a.pythoncode1();
		a.sleep();
		dsp.clickbtnRun();
		a.navigateback();
		a.navigateback();
		
}

@Test(priority=3)

public void queueimplementationusingarray() throws InterruptedException {
	QueuePage qp=new QueuePage(driver);
	HomePage hp=new HomePage(driver);
	DSPage dsp= new DSPage(driver);
	ReadConfig read= new ReadConfig();
	Actions a = new Actions();
		
		LoggerLoad.info("QUEUE : Implementation using array started");
		qp.clicklinkImplementationusingarray();
		a.scrolldown();
		a.refresh();
		a.tryhere1();
		a.pythoncode1();
		a.sleep();
		a.run1();
		a.navigateback();
		a.navigateback();
		
		
}


@Test(priority=4)
public void queueoperationstarted() throws InterruptedException {
	
	QueuePage qp=new QueuePage(driver);
	HomePage hp=new HomePage(driver);
	DSPage dsp= new DSPage(driver);
	ReadConfig read= new ReadConfig();
	Actions a = new Actions();
		
		LoggerLoad.info("QUEUE : operations started");
		qp.clicklinkQueueoperations();
		a.sleep();
		a.scrolldown();
		a.refresh();
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
	

