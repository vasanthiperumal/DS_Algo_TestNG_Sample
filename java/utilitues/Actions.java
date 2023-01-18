package utilitues;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import Pageobject.DSPage;
import Testcase.Baseclass;

public class Actions extends Baseclass {
	
	ReadConfig read= new ReadConfig();
	DSPage dsp= new DSPage(driver);

	
	@Test
	public void navigateback() {
		driver.navigate().back();
	}
	
	@Test
	public void refresh() {
		driver.navigate().refresh();
	}
	
	
	@Test
	public void windowmax() {
		driver.manage().window().maximize();
	}
	
	@Test
	public void sleep() throws InterruptedException
	{
		Thread.sleep(1500);
		
	}

	
	@Test
	public void scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
	}
	
	
	
	

	@Test
	public void scrolldown1()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
	}
	
	
	
	@Test
	public void scrollbodylength()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	
	

	@Test
	public void pythoncode1()
	{
		driver.findElement (By.xpath("//textarea[@tabindex=0]")).sendKeys(read.geteditor());
		
	}
	
	
	

	@Test
	public void deleteeditor()
	{
		driver.findElement (By.xpath("//textarea[@tabindex=0]")).sendKeys(Keys.CONTROL+"a");
		driver.findElement (By.xpath("//textarea[@tabindex=0]")).sendKeys(Keys.DELETE);
		
	}
	
	
	@Test
	public void tryhere1()
	{

		try {
			dsp.clickbtnTryhere();
		}
		catch(StaleElementReferenceException e) {
			
			driver.findElement(By.xpath("//body/div[2]/div/div[2]/a[text()='Try here>>>']")).click();	
		}
		
	}
	
	
	
	@Test
	public void run1()
	{

		try{
			dsp.clickbtnRun();
			}
			catch(StaleElementReferenceException e) {
				driver.findElement(By.xpath("//button[@type='button']")).click();
			}
		
	}
	
	
	
}
	

