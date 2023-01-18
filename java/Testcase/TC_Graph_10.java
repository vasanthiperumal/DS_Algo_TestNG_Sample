package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pageobject.GraphPage;
import Pageobject.HomePage;
import Pageobject.LoginPage;
import utilitues.Actions;
import utilitues.LoggerLoad;
import utilitues.ReadConfig;

public class TC_Graph_10 extends Baseclass {
	
@Test(priority=1)
	public void Graph() throws IOException, InterruptedException {
		
		//driver.get("https://dsportalapp.herokuapp.com/home");
		HomePage hp=new HomePage(driver);
		GraphPage gp = new GraphPage(driver);
		ReadConfig read= new ReadConfig();
		Actions a = new Actions();
		TC_LoginTest_001 lp1=new TC_LoginTest_001();
		
		
		a.windowmax();
		a.sleep();
		lp1.loginTest(read.getusername(),read.getpassword());
		a.sleep();
        hp.clickGraphgetstart();
		a.scrolldown();
		a.sleep();
		
		LoggerLoad.info(" Graph : Link graph started");
		gp.clickLinkGraph();
		a.sleep();
		a.scrolldown();
		gp.clickbtnTryhere();
		hp.enterpythoncode();
		a.sleep();
		gp.clickbtnRun();
		a.navigateback();
		a.navigateback();
		a.sleep();
}

@Test(priority=2)
public void linkgraphpresentationstarted() throws InterruptedException {
	HomePage hp=new HomePage(driver);
	GraphPage gp = new GraphPage(driver);
	ReadConfig read= new ReadConfig();
	Actions a = new Actions();
		
		LoggerLoad.info("Graph : Link graph presentations started");
		gp.clicklinkGraphrepresentations();
		a.sleep();
		a.scrolldown1();
		a.sleep();
		a.refresh();
		a.tryhere1();
		a.sleep();
		a.refresh();
		a.pythoncode1();
		a.run1();
		a.navigateback();
		a.navigateback();
		a.navigateback();
		
		hp.clickSignout();
		
		
	}
	

}
