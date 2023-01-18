package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import Pageobject.Arraypage;
import Pageobject.DSPage;
import Pageobject.HomePage;
import Pageobject.QueuePage;
import utilitues.Actions;
import utilitues.LoggerLoad;
import utilitues.ReadConfig;

public class TC_Arrays_005 extends Baseclass {
	
	
	@Test(priority=1)
	
	public void Arrays() throws IOException, InterruptedException{
	
		HomePage hp=new HomePage(driver);
		ReadConfig read= new ReadConfig();
		Arraypage ap= new Arraypage(driver);
		Actions a = new Actions();
		
		
		//driver.get("https://dsportalapp.herokuapp.com/home");
		
		a.windowmax();
		TC_LoginTest_001 lp1=new TC_LoginTest_001();
		lp1.loginTest(read.getusername(),read.getpassword());
		hp.clickArraygetstart();
		a.scrolldown();
		a.sleep();
		
		
		
		
			
	    
		LoggerLoad.info("ARRAY : Array in python started");
		ap.linkArrayainpython();
		a.sleep();
		 a.scrollbodylength();
		 a.tryhere1();
		a.pythoncode1();
		
		a.sleep();
		a.run1();
		a.navigateback();
		a.navigateback();
		
	}
	
	@Test(priority=2)
	
	public void arrayusingliststarted() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		ReadConfig read= new ReadConfig();
		Arraypage ap= new Arraypage(driver);
		Actions a = new Actions();
		
		LoggerLoad.info("ARRAY : Arrays using list started");
		a.scrolldown();
		ap.clicklinkArraysusinglist();
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
	public void arraybasicoperationsinlist() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		ReadConfig read= new ReadConfig();
		Arraypage ap= new Arraypage(driver);
		Actions a = new Actions();
		LoggerLoad.info("ARRAY : Basic operations in lists started");
		a.scrolldown();
		ap.clicklinkBasicoperationsinlists();
		a.sleep();
		a.scrollbodylength();
		a.tryhere1();
		a.pythoncode1();
		a.sleep();
		a.run1();
		a.navigateback();
		a.navigateback();
	}
	
	@Test(priority=4)
	public void arrayapplicationsofarray() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		ReadConfig read= new ReadConfig();
		Arraypage ap= new Arraypage(driver);
		Actions a = new Actions();
		
		LoggerLoad.info("ARRAY : Applications of array started");
		a.scrolldown();
		ap.clicklinkApplicationsofarray();
		a.sleep();
		a.scrollbodylength();
		a.tryhere1();
		a.pythoncode1();
		a.sleep();
		a.run1();
		a.navigateback();
		a.navigateback();
		
	}
	
	@Test(priority=5)
	public void arrayarraysinpython() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		ReadConfig read= new ReadConfig();
		Arraypage ap= new Arraypage(driver);
		Actions a = new Actions();
		
		//ap.linkArrayainpython();
		driver.findElement(By.linkText("Arrays in Python")).click();
		a.sleep();
		ap.linkpracticequestions();
		
		
		LoggerLoad.info("ARRAY : Search array started");
		ap.clicklinksearchthearray();
		a.sleep();
		a.sleep();
		a.deleteeditor();
		a.pythoncode1();
		a.sleep();
		ap.clickbtnRun();
		a.sleep();
		a.navigateback();
		a.sleep();
		
	}
	
	@Test(priority=6)
	public void arraymaxconsecutiveones() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		ReadConfig read= new ReadConfig();
		Arraypage ap= new Arraypage(driver);
		Actions a = new Actions();
		
		LoggerLoad.info("ARRAY : Max consecutive ones started");
		ap.clicklinkmaxconsecutiveones();
		a.sleep();
		a.sleep();
		a.deleteeditor();
		a.pythoncode1();
		a.sleep();
		a.run1();
		a.sleep();
		a.navigateback();
		a.sleep();
		
	}
	
	@Test(priority=7)
	public void arrayfindevennumbers() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		ReadConfig read= new ReadConfig();
		Arraypage ap= new Arraypage(driver);
		Actions a = new Actions();
		LoggerLoad.info("ARRAY : Find even number started");
		ap.clicklinkfindevennumber();
		a.sleep();
		a.sleep();
		a.deleteeditor();
		a.pythoncode1();
		a.sleep();
		a.run1();
		a.sleep();
		a.navigateback();
		a.sleep();
		
		
	}
	
	@Test(priority=8)
	public void arrayinpython() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		ReadConfig read= new ReadConfig();
		Arraypage ap= new Arraypage(driver);
		Actions a = new Actions();
		
		LoggerLoad.info("ARRAY : Array in python started");
		driver.findElement(By.xpath("//a[@href='/question/4']")).click();
		a.sleep();
		a.sleep();
		a.deleteeditor();
		a.pythoncode1();
		a.sleep();
		a.run1();
		a.sleep();
		a.navigateback();
		a.sleep();
		a.navigateback();
		a.navigateback();
		a.navigateback();
		
		hp.clickSignout();
		
	}

}
