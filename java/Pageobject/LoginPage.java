package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	 @FindBy(id="id_username")
	 @CacheLookup
	 WebElement txtUsername;
	 
	 
	 @FindBy(id="id_password")
	 @CacheLookup
	 WebElement txtPassword;
	 
	 @FindBy(xpath = "//input[@value='Login']")
	 @CacheLookup
	 WebElement btnLogin;
	 
	 public void setUsername(String uname) {
		 txtUsername.sendKeys(uname);
	 }
	 
	 public void setPassword(String pwd) {
		 txtPassword.sendKeys(pwd);
	 }
	 
	 public void clickLogin() {
		 btnLogin.click();
	 }
	 
	

}
