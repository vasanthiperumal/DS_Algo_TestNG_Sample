package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {
	
WebDriver ldriver;
	
	public TreePage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//div/h4")
	@CacheLookup
	WebElement Pageheading;
	
	@FindBy(linkText = "Overview of Trees")
	@CacheLookup
	WebElement LinkOverviewofTrees;
	
	@FindBy(linkText = "Terminologies")
	@CacheLookup
	WebElement linkTerminologies;
	
	@FindBy(linkText = "Types of Trees")
	@CacheLookup
	WebElement linkTypesoftrees;
	
	@FindBy(linkText = "Tree Traversals")
	@CacheLookup
	WebElement linkTreeTraversals;
	
	@FindBy(linkText = "Traversals-Illustration")
	@CacheLookup
	WebElement linkTraversalsillustration;
	
	@FindBy(linkText = "Binary Trees")
	@CacheLookup
	WebElement linkBinarytrees;
	
	@FindBy(linkText = "Types of Binary Trees")
	@CacheLookup
	WebElement linkTypesofbinarytrees;
	
	@FindBy(linkText = "Implementation in Python")
	@CacheLookup
	WebElement linkImplementationinpython;
	
	@FindBy(linkText = "Binary Tree Traversals")
	@CacheLookup
	WebElement linkBinarytreetraversals;
	
	
	@FindBy(xpath ="//a[text()='Implementation of Binary Trees']")
	@CacheLookup
	WebElement linkimplementationofbinarytrees;
	
	
	
	@FindBy(linkText = "Applications of Binary trees")
	@CacheLookup
	WebElement linkApplicationsofbinarytrees;
	
	@FindBy(linkText = "Binary Search Trees")
	@CacheLookup
	WebElement linkBinarysearchtrees;
	
	
	@FindBy(xpath ="//a[text()='Implementation Of BST']")
	@CacheLookup
	WebElement linkimplementationofbst;
	
	
	
		@FindBy(xpath="//body/div[2]/div/div[2]/a[text()='Try here>>>']")
		@CacheLookup
		WebElement btnTryhere;
		
		
		@FindBy(xpath="//button[@type='button']")
		@CacheLookup
		WebElement btnRun;
	
	
	public void clickLinkOverviewofTrees()
	{
		LinkOverviewofTrees.click();
	}
	
	public void clicklinkTerminologies()
	{
		linkTerminologies.click();
	}
	
	
	public void clicklinkTypesoftrees()
	{
		linkTypesoftrees.click();
	}
	
	
	public void clicklinkTreeTraversals()
	{
		linkTreeTraversals.click();
	}
	
	public void clicklinkTraversalsillustration()
	{
		linkTraversalsillustration.click();
	}
	
	public void clicklinkBinarytrees()
	{
		linkBinarytrees.click();
	}
	
	public void clicklinkTypesofbinarytrees()
	{
		linkTypesofbinarytrees.click();
	}
	
	public void clicklinkImplementationinpython()
	{
		linkImplementationinpython.click();
	}
	
	public void clicklinkBinarytreetraversals()
	{
		linkBinarytreetraversals.click();
	}
	
	public void clicklinkimplementationofbinarytrees()
	{
		linkimplementationofbinarytrees.click();
	}
	
	
	
	public void clicklinkApplicationsofbinarytrees()
	{
		linkApplicationsofbinarytrees.click();
	}
	
	public void clicklinkBinarysearchtrees()
	{
		linkBinarysearchtrees.click();
	}
	
	
	public void clicklinkimplementationofbst()
	{
		linkimplementationofbst.click();
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
