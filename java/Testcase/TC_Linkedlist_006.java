package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import Pageobject.HomePage;
import Pageobject.LinkedListPage;
import Pageobject.LoginPage;
import utilitues.Actions;
import utilitues.LoggerLoad;
import utilitues.ReadConfig;

public class TC_Linkedlist_006 extends Baseclass{
	
	@Test(priority=1)
	public void Linkedlist() throws InterruptedException, IOException {
		
		//driver.get("https://dsportalapp.herokuapp.com/home");
		 HomePage hp=new HomePage(driver);
		 LinkedListPage llp=new LinkedListPage(driver);
		 //LoginPage lp=new LoginPage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
		 TC_LoginTest_001 lp1=new TC_LoginTest_001();
		 
		    a.windowmax();
		    a.sleep();
			lp1.loginTest(read.getusername(),read.getpassword());
			a.sleep();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			hp.clickLinklistgetstart();
			a.scrolldown();
			a.sleep();
			
			
			LoggerLoad.info("Linkedlist : Introduction started");
			llp.clicklinkIntroduction();
			a.sleep();
			a.scrolldown();
			llp.clickbtnTryhere();
			a.pythoncode1();
			a.sleep();
			llp.clickbtnRun();
			a.navigateback();
			a.navigateback();
	}
	
	@Test(priority=2)
	
	public void linkedlistcreating() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		 LinkedListPage llp=new LinkedListPage(driver);
		 //LoginPage lp=new LoginPage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
			
			LoggerLoad.info("Linkedlist : Creating linked list started");
			llp.clicklinkCreatinglinkedlist();
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
	public void linkedlisttypesoflinkedliat() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		 LinkedListPage llp=new LinkedListPage(driver);
		 //LoginPage lp=new LoginPage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
			
			LoggerLoad.info("Linkedlist : Types of linked list started");
			llp.clicklinkTypesoflinkedlist();
			a.sleep();
			a.scrolldown();
			a.tryhere1();
			a.pythoncode1();
			a.sleep();
			a.run1();
			a.navigateback();
			a.navigateback();
			
	}
	
	@Test(priority=4)
	
	public void linkedlistimplementationstarted() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		 LinkedListPage llp=new LinkedListPage(driver);
		 //LoginPage lp=new LoginPage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
			
			LoggerLoad.info("Linkedlist : Implement started");
			llp.clicklinkImplement();
			a.sleep();
			a.scrolldown();
			a.sleep();
			a.tryhere1();
			a.pythoncode1();
			a.sleep();
			a.run1();
			a.navigateback();
			a.navigateback();
	}
	
	@Test(priority=5)
	
	public void linkedlisttraversal() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		 LinkedListPage llp=new LinkedListPage(driver);
		 //LoginPage lp=new LoginPage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
			
			LoggerLoad.info("Linkedlist : Traversal started");
			llp.clicklinkTraversal();
			a.sleep();
			a.scrolldown();
			a.sleep();
			a.tryhere1();
			a.pythoncode1();
			a.sleep();
			a.run1();
			a.navigateback();
			a.navigateback();
	}
	
	@Test(priority=6)
	
	public void linkedlistinsertion() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		 LinkedListPage llp=new LinkedListPage(driver);
		 //LoginPage lp=new LoginPage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
		
			LoggerLoad.info("Linkedlist : Insertion started");
			llp.clicklinkInsertion();
			a.sleep();
			a.scrollbodylength();
			a.sleep();
			a.tryhere1();
			a.pythoncode1();
			a.sleep();
			a.run1();
			a.navigateback();
			a.navigateback();
						
	}
	
	@Test(priority=7)
	public void linkedlistdeletion() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		 LinkedListPage llp=new LinkedListPage(driver);
		 //LoginPage lp=new LoginPage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
			LoggerLoad.info("Linkedlist : Deletion started");
			llp.clicklinkDeletion();
			a.sleep();
			a.scrollbodylength();
			a.sleep();
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
