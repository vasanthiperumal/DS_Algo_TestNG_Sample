package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Testcase.Baseclass;
import utilitues.ReadConfig;

public class HomePage {

WebDriver ldriver;
ReadConfig read= new ReadConfig();
	
	public HomePage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(linkText = "Data Structures")
	@CacheLookup
	WebElement dropdown;
	
	
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	@CacheLookup
	WebElement Loginmsg;
	
	
	@FindBy(xpath ="//a[@class='navbar-brand']")
	@CacheLookup
	WebElement Pagetitle;
	
	
	@FindBy(linkText  ="data-structures-introduction")
	@CacheLookup
	WebElement Displayusername;
	
	
	@FindBy(xpath = "//a[text()=' Register ']")
	@CacheLookup
	WebElement Register;
	
	
	
	@FindBy(xpath ="//ul//a[3]")
	@CacheLookup
	WebElement Signout;
	
	
	@FindBy(xpath = "//a[text()='Sign in']")
	@CacheLookup
	WebElement Signin;
	
	
	
	@FindBy(xpath = "//body/div[3]/div[1]/div/div/a")
	@CacheLookup
	WebElement DSGetstart;
	
	@FindBy(xpath="//div[2]/div/div/a")
	@CacheLookup
	WebElement ArrGetstart;
	
	@FindBy(xpath="//body/div[3]/div[3]/div/div/a")
	@CacheLookup
	WebElement LinklistGetstart;
	
	@FindBy(xpath="//body/div[3]/div[4]/div/div/a")
	@CacheLookup
	WebElement StackGetstart;
	
	@FindBy(xpath="//body/div[3]/div[5]/div/div/a")
	@CacheLookup
	WebElement QueueGetstart;
	
	@FindBy(xpath="//body/div[3]/div[6]/div/div/a")
	@CacheLookup
	WebElement TreeGetstart;
	
	@FindBy(xpath="//body/div[3]/div[7]/div/div/a")
	@CacheLookup
	WebElement GraphGetstart;
	
	
	@FindBy(xpath="//textarea[@tabindex=0]")
	@CacheLookup
	WebElement pythoncode;
	
	
	//driver.findElement (By.xpath("//textarea[@tabindex=0]")).sendKeys(read.geteditor());
	
	public void enterpythoncode()
	{
		//pythoncode.sendKeys(read.geteditor());
		pythoncode.sendKeys(read.geteditor());
	}
	
	
	
	
	public void clickdropdown()
	{
		dropdown.click();
	}
	
	public void clickSignin()
	{
		Signin.click();
	}
	
	
	public void clickSignout()
	{
		Signout.click();
	}
	
	
	public void clickRegister()
	{
		Register.click();
	}
	
	public void clickDSgetstart()
	{
		DSGetstart.click();
	}
	
	public void clickArraygetstart()
	{
		ArrGetstart.click();
	}
	
	public void clickLinklistgetstart()
	{
		LinklistGetstart.click();
	}
	
	public void clickStackgetstart()
	{
		StackGetstart.click();
	}
	
	public void clickQueuegetstart()
	{
		QueueGetstart.click();
	}
	
	public void clickTreegetstart()
	{
		TreeGetstart.click();
	}
	
	public void clickGraphgetstart()
	{
		GraphGetstart.click();
	}
	
	

}
