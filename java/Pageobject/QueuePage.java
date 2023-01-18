package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {
	
WebDriver ldriver;
	
	public QueuePage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath ="//div/h4")
	@CacheLookup
	WebElement Pageheading;
	
	@FindBy(linkText = "Implementation of Queue in Python")
	@CacheLookup
	WebElement linkImplementationofqueue;
	
	@FindBy(linkText = "Implementation using collections.deque")
	@CacheLookup
	WebElement linkImplementationusingcollections;
	
	@FindBy(linkText = "Implementation using array")
	@CacheLookup
	WebElement linkImplementationusingarray;
	
	@FindBy(linkText = "Queue Operations")
	@CacheLookup
	WebElement linkQueueoperations;
	
	@FindBy(xpath="//body/div[2]/div/div[2]/a[text()='Try here>>>']")
	@CacheLookup
	public
	WebElement btnTryhere;
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun;
	
	
	
	
	
	public void clicklinkImplementationofqueue()
	{
		linkImplementationofqueue.click();
	}
	
	public void clicklinkImplementationusingcollections()
	{
		linkImplementationusingcollections.click();
	}
	
	public void clicklinkImplementationusingarray()
	{
		linkImplementationusingarray.click();
	}
	
	public void clicklinkQueueoperations()
	{
		linkQueueoperations.click();
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
