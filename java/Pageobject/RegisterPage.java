package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver ldriver;
	
	

	public RegisterPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(xpath="//button[@class='btn']")
	 @CacheLookup
	 WebElement btngetstarted;
	
	
	@FindBy(linkText = ("Register"))
	 @CacheLookup
	 WebElement homeregister;
	
	@FindBy(xpath="//div[@class='alert alert-primary']")
	@CacheLookup
	WebElement newregister;
	
	
	@FindBy(xpath="//div[@class='alert alert-primary']")
	@CacheLookup
	WebElement invalidregister;
	

	 @FindBy(id="id_username")
	 @CacheLookup
	 WebElement txtUsername;
	 
	 @FindBy(id="id_password1")
	 @CacheLookup
	 WebElement txtPassword;
	 
	 
	 @FindBy(id="id_password2")
	 @CacheLookup
	 WebElement txtRePassword;
	
	@FindBy(xpath="//input[@value='Register']")
	@CacheLookup
	WebElement btnRegister;
	
	@FindBy(xpath="//a[text()='Login']")
	 @CacheLookup
	 WebElement btnLogin;
	
	
	public void getstarted() 
	{
		btngetstarted.click();	
	}
	
	
	public void homeregister() 
	{
		homeregister.click();	
	}
	
	
	
	public String newregistersuccess() 
	{
		return newregister.getText();	
	}
	
	
	public String invalidregister() 
	{
		return invalidregister.getText();	
	}
	
	
	
	public void setUsername(String uname) 
	{
		txtUsername.sendKeys(uname);	
	}
	
    public void setPassword(String pwd) 
    {
    	txtPassword.sendKeys(pwd);	
	}

    public void setRePassword(String repwd)
    {
	
    	txtRePassword.sendKeys(repwd);
    }
	
	public void clickRegister() 
	{
		btnRegister.click();
	}
	
	public void clickLogin() 
	{
		btnLogin.click();
	}
	
	
}
