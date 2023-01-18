package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcase.Baseclass;

public class DSPage extends Baseclass{
	
WebDriver ldriver;
	
	public DSPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(xpath ="//div/h4")
	@CacheLookup
	WebElement Pageheading;
	
	
	@FindBy(xpath = "//html/body/div[2]/ul/a")
	@CacheLookup
	WebElement btnTimecomplexity;
	
	//div/ul/a[text()='Time Complexity']
	
	//different page
	//@FindBy(xpath="//body/div[2]/div/div[2]/a[text()='Try here>>>']")
	//@CacheLookup
	//WebElement btnTryhere;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	@CacheLookup
	WebElement btnTryhere;
	
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	@CacheLookup
	WebElement btnTryhere10;
	
	
	
	
	//different page
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun;
	
	
	public void clickbtnTryhere()
	{
		btnTryhere.click();
	}
	
	public void clickbtnTimecomplexity()
	{
		btnTimecomplexity.click();
	}
	
	public void clickbtnRun()
	{
		btnRun.click();
	}
	
	
	public void clickbtnTryhere10()
	{
		btnTryhere10.click();
	}

}
