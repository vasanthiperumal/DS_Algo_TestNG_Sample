package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {
	
	
WebDriver ldriver;
	
	public GraphPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath ="//div/h4")
	@CacheLookup
	WebElement Pageheading;
	
	@FindBy(linkText = "Graph")
	@CacheLookup
	WebElement LinkGraph;
	
	@FindBy(linkText = "Graph Representations")
	@CacheLookup
	WebElement linkGraphrepresentations;
	
	
	@FindBy(xpath="//body/div[2]/div/div[2]/a[text()='Try here>>>']")
	@CacheLookup
	WebElement btnTryhere;
	
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun;

	
	public void clickLinkGraph()
	{
		LinkGraph.click();
	}
	
	
	public void clicklinkGraphrepresentations()
	{
		linkGraphrepresentations.click();
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
