package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {
	
	WebDriver ldriver;
	
	public LinkedListPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	
	@FindBy(xpath ="//div/h4")
	@CacheLookup
	WebElement Pageheading;
	
	@FindBy(linkText = "Introduction")
	@CacheLookup
	WebElement linkIntroduction;
	
	@FindBy(linkText = "Implement Linked List in Python")
	@CacheLookup
	WebElement linkImplement;
	
	@FindBy(linkText = "Creating Linked LIst")
	@CacheLookup
	WebElement linkCreatinglinkedlist;
	
	@FindBy(linkText = "Types of Linked List")
	@CacheLookup
	WebElement linkTypesoflinkedlist;
	
	@FindBy(linkText = "Traversal")
	@CacheLookup
	WebElement linkTraversal;
	
	@FindBy(linkText = "Insertion")
	@CacheLookup
	WebElement linkInsertion;
	
	@FindBy(linkText = "Deletion")
	@CacheLookup
	WebElement linkDeletion;
	
	
	@FindBy(xpath="//body/div[2]/div/div[2]/a[text()='Try here>>>']")
	@CacheLookup
	WebElement btnTryhere;
	
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun;
	
	public void clicklinkIntroduction()
	{
		linkIntroduction.click();
	}
	
	public void clicklinkImplement()
	{
		linkImplement.click();
	}
	
	public void clicklinkCreatinglinkedlist()
	{
		linkCreatinglinkedlist.click();
	}
	
	public void clicklinkTypesoflinkedlist()
	{
		linkTypesoflinkedlist.click();
	}
	
	public void clicklinkTraversal()
	{
		linkTraversal.click();
	}
	
	
	public void clicklinkInsertion()
	{
		linkInsertion.click();
	}
	
	public void clicklinkDeletion()
	{
		linkDeletion.click();
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
