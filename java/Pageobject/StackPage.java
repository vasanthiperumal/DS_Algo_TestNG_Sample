package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {
	
	
WebDriver ldriver;
	
	public StackPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath ="//div/h4")
	@CacheLookup
	WebElement Pageheading;
	
	@FindBy(linkText = "Operations in Stack")
	@CacheLookup
	WebElement linkOperationsinstack;
	
	@FindBy(linkText = "Implementation")
	@CacheLookup
	WebElement linkImplementation;
	
	@FindBy(linkText = "Applications")
	@CacheLookup
	WebElement linkApplications;
	

	@FindBy(xpath="//body/div[2]/div/div[2]/a[text()='Try here>>>']")
	@CacheLookup
	WebElement btnTryhere;
	
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun;
	
	
	public void clicklinkOperationsinstack()
	{
		linkOperationsinstack.click();
	}
	
	
	public void clicklinkImplementation()
	{
		linkImplementation.click();
	}
	
	
	public void clicklinkApplications()
	{
		linkApplications.click();
	}
	
	
	public void clickbtnTryhere()
	{
		btnTryhere.click();
	}
	
	public void clickbtnRun()
	{
		btnRun.click();
	}
	

}
