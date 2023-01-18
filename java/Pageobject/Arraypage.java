package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Arraypage {
	
WebDriver ldriver;
	
	public Arraypage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath ="//div/h4")
	@CacheLookup
	WebElement Pageheading;
	
	
	@FindBy(linkText = "Arrays in Python")
	@CacheLookup
	WebElement linkArrayainpython;
	
	@FindBy(linkText = "Arrays Using List")
	@CacheLookup
	WebElement linkArraysusinglist;
	
	@FindBy(linkText = "Basic Operations in Lists")
	@CacheLookup
	WebElement linkBasicoperationsinlists;
	
	@FindBy(linkText = "Applications of Array")
	@CacheLookup
	WebElement linkApplicationsofarray;
	
	
	
	@FindBy(xpath="//body/div[2]/div/div[2]/a[text()='Try here>>>']")
	@CacheLookup
	WebElement btnTryhere;
	
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun;
	
	
	@FindBy(xpath = "//a[text()='Practice Questions']")
	@CacheLookup
	WebElement linkpracticequestions;
	
	
	@FindBy(xpath = "//a[text()='Search the array']")
	@CacheLookup
	WebElement linksearchthearray;
	
	
	@FindBy(xpath = "//a[text()='Max Consecutive Ones']")
	@CacheLookup
	WebElement linkmaxconsecutiveones;
	
	
	@FindBy(xpath = "//a[text()='Find Numbers with Even Number of Digits']")
	@CacheLookup
	WebElement linkfindevennumber;
	
	@FindBy(xpath = "Squares of  a Sorted Array")
	@CacheLookup
	WebElement linksquaresofarray;
	
	
	
	
	
	public void linkArrayainpython()
	{
		linkArrayainpython.click();
	}
	
	public void clicklinkArraysusinglist()
	{
		linkArraysusinglist.click();
	}
	
	public void clicklinkBasicoperationsinlists()
	{
		linkBasicoperationsinlists.click();
	}
	
	public void clicklinkApplicationsofarray()
	{
		linkApplicationsofarray.click();
	}
	
	
	public void clickbtnTryhere()
	{
		btnTryhere.click();
	}
	
	public void clickbtnRun()
	{
		btnRun.click();
	}
	
	
	
	public void linkpracticequestions()
	{
		linkpracticequestions.click();
	}
	
	
	public void clicklinksearchthearray()
	{
		linksearchthearray.click();
	}
	
	public void clicklinkmaxconsecutiveones()
	{
		linkmaxconsecutiveones.click();
	}
	
	public void clicklinkfindevennumber()
	{
		linkfindevennumber.click();
	}
	
	public void clicklinksquaresofarray()
	{
		linksquaresofarray.click();
	}

}
