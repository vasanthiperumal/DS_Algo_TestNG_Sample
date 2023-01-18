package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import Pageobject.DSPage;
import Pageobject.HomePage;
import Pageobject.LoginPage;
import Pageobject.TreePage;
import utilitues.Actions;
import utilitues.LoggerLoad;
import utilitues.ReadConfig;

public class TC_Tree_009 extends Baseclass{
	
	
	@Test(priority=1)
	
	public void Tree() throws InterruptedException, IOException {
		
		//driver.get("https://dsportalapp.herokuapp.com/home");
		 HomePage hp=new HomePage(driver);
		 DSPage dsp= new DSPage(driver);
		 LoginPage lp=new LoginPage(driver);
		 TreePage tp=new TreePage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
		 
		 a.windowmax();
		 a.sleep();
			TC_LoginTest_001 lp1=new TC_LoginTest_001();
			lp1.loginTest(read.getusername(),read.getpassword());
			a.sleep();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			a.scrolldown();
			hp.clickTreegetstart();
			a.scrollbodylength();
			 
			 
			LoggerLoad.info("TREE : Overview of tree started");
		        tp.clickLinkOverviewofTrees();
		        a.sleep();
		        a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				hp.enterpythoncode();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();
	}
	
	@Test(priority=2)
	public void treeterminologies() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		 DSPage dsp= new DSPage(driver);
		 LoginPage lp=new LoginPage(driver);
		 TreePage tp=new TreePage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
				
				
				LoggerLoad.info("TREE : Terminologies started");
				tp.clicklinkTerminologies();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();
				
	}
	
	@Test(priority=3)
	public void treetypesoftreestarted() throws InterruptedException {
	
		HomePage hp=new HomePage(driver);
		 DSPage dsp= new DSPage(driver);
		 LoginPage lp=new LoginPage(driver);
		 TreePage tp=new TreePage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
		
				LoggerLoad.info("TREE : Types of tree started");
				tp.clicklinkTypesoftrees();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();
		
				
	}
	
	@Test(priority=4)
	
	public void treetraversals() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		 DSPage dsp= new DSPage(driver);
		 LoginPage lp=new LoginPage(driver);
		 TreePage tp=new TreePage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
		
				LoggerLoad.info("TREE : Tree traversals started");
				tp.clicklinkTreeTraversals();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();	
				
				
	}
				
	@Test(priority=5)
	public void treetraversalillustration() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		 DSPage dsp= new DSPage(driver);
		 LoginPage lp=new LoginPage(driver);
		 TreePage tp=new TreePage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
				LoggerLoad.info("TREE : Traversal illustration started");
				tp.clicklinkTraversalsillustration();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();
	}
	
	@Test(priority=6)
	public void treebinary() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		 DSPage dsp= new DSPage(driver);
		 LoginPage lp=new LoginPage(driver);
		 TreePage tp=new TreePage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
				LoggerLoad.info("TREE : Binary tree started");
				tp.clicklinkBinarytrees();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();
		
				
	}
	
	@Test(priority=7)
	public void treetypesofbinarytree() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		 DSPage dsp= new DSPage(driver);
		 LoginPage lp=new LoginPage(driver);
		 TreePage tp=new TreePage(driver);
		 ReadConfig read= new ReadConfig();
		 Actions a = new Actions();
		
				LoggerLoad.info("TREE : Types of Binary tree started");
				tp.clicklinkTypesofbinarytrees();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();	
	}
	
	@Test(priority=8)
				public void treeimplementation() throws InterruptedException {
					HomePage hp=new HomePage(driver);
					 DSPage dsp= new DSPage(driver);
					 LoginPage lp=new LoginPage(driver);
					 TreePage tp=new TreePage(driver);
					 ReadConfig read= new ReadConfig();
					 Actions a = new Actions();
				LoggerLoad.info("TREE : Implementation in python started");
				tp.clicklinkImplementationinpython();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();	
				
				}
				
	@Test(priority=9)
				
				public void treebinarytreetraversal() throws InterruptedException {
					HomePage hp=new HomePage(driver);
					 DSPage dsp= new DSPage(driver);
					 LoginPage lp=new LoginPage(driver);
					 TreePage tp=new TreePage(driver);
					 ReadConfig read= new ReadConfig();
					 Actions a = new Actions();
				LoggerLoad.info("TREE : Binary tree traversal started");
				tp.clicklinkBinarytreetraversals();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();	
		
				}
				
	@Test(priority=10)
				public void treeimplementationofbinarytrees() throws InterruptedException {
					HomePage hp=new HomePage(driver);
					 DSPage dsp= new DSPage(driver);
					 LoginPage lp=new LoginPage(driver);
					 TreePage tp=new TreePage(driver);
					 ReadConfig read= new ReadConfig();
					 Actions a = new Actions();
				LoggerLoad.info("TREE : Implementation of binary trees started");
				a.scrolldown();
				a.sleep();
				tp.clicklinkimplementationofbinarytrees();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();
				}
				
	@Test(priority=11)
				public void treeapplicationofbinarytrees() throws InterruptedException {
					
					HomePage hp=new HomePage(driver);
					 DSPage dsp= new DSPage(driver);
					 LoginPage lp=new LoginPage(driver);
					 TreePage tp=new TreePage(driver);
					 ReadConfig read= new ReadConfig();
					 Actions a = new Actions();
				
				LoggerLoad.info("TREE : Application of binary trees started");
				tp.clicklinkApplicationsofbinarytrees();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();
				}
				
	@Test(priority=12)
				public void treebinarysearchtrees() throws InterruptedException {
					
					HomePage hp=new HomePage(driver);
					 DSPage dsp= new DSPage(driver);
					 LoginPage lp=new LoginPage(driver);
					 TreePage tp=new TreePage(driver);
					 ReadConfig read= new ReadConfig();
					 Actions a = new Actions();
				
				LoggerLoad.info("TREE : Binary search trees started");
				tp.clicklinkBinarysearchtrees();
				a.sleep();
				a.scrolldown();
				a.sleep();
				a.refresh();
				a.tryhere1();
				a.pythoncode1();
				a.sleep();
				a.run1();
				a.navigateback();
				a.navigateback();	
				}
				
	@Test(priority=13)	
				public void treeimplementationofBST() throws InterruptedException {
					HomePage hp=new HomePage(driver);
					 DSPage dsp= new DSPage(driver);
					 LoginPage lp=new LoginPage(driver);
					 TreePage tp=new TreePage(driver);
					 ReadConfig read= new ReadConfig();
					 Actions a = new Actions();
		
				a.sleep();
				a.scrolldown();
				LoggerLoad.info("TREE : Implementation of BST started");
				tp.clicklinkimplementationofbst();
				a.sleep();
				a.scrolldown();
				a.sleep();
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
