package curs20;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class JSAlertExample extends BaseTest{
	
	@Test(priority=1)
	public void simpleJSAlert() throws InterruptedException {
		
		browser.get("https://keybooks.ro/events_calendar/");
		
		browser.findElement(By.cssSelector("div[id='simpleBtn']>button")).click();
		
		 
		                              
		Thread.sleep(5000);
		//browser.switchTo().alert().accept(); //accept se duce pe OK, iar dismiss pe Cancel, stie singur 
		
		//sau
		Alert alertaJS = browser.switchTo().alert();  //accept se duce pe OK, iar dismiss pe Cancel, stie singur 
		alertaJS.accept();

		WebElement resultText = browser.findElement(By.cssSelector("div[id='demo']"));
		
		assertEquals(resultText.getText(), "You did it.....!");
		
	}

	@Test(priority=2)
	public void confirmJSAlert() throws InterruptedException {
		
		browser.get("https://keybooks.ro/events_calendar/");
		
		browser.findElement(By.cssSelector("div[id='confirmBtn']>button")).click();
		
		 
		                              
		Thread.sleep(5000);
		//browser.switchTo().alert().accept(); //accept se duce pe OK, iar dismiss pe Cancel, stie singur 
		
		//sau
		Alert alertaJS = browser.switchTo().alert();  //accept se duce pe OK, iar dismiss pe Cancel, stie singur 
		alertaJS.dismiss();

		WebElement resultText = browser.findElement(By.cssSelector("div[id='demo']"));
		
		assertEquals(resultText.getText(), "You pressed Cancel!");
		
	}
	
	@Test(priority=3)
	public void promptJSAlert() throws InterruptedException {
		
		browser.get("https://keybooks.ro/events_calendar/");
		
		browser.findElement(By.cssSelector("div[id='promptBtn']>button")).click();
		
		 
		                              
		Thread.sleep(5000);
		//browser.switchTo().alert().accept(); //accept se duce pe OK, iar dismiss pe Cancel, stie singur 
		
		//sau
		Alert alertaJS = browser.switchTo().alert();  //accept se duce pe OK, iar dismiss pe Cancel, stie singur 
		System.out.println(alertaJS.getText());
		
		alertaJS.sendKeys("Harry Potter");
		Thread.sleep(6000);
		alertaJS.accept();

		WebElement resultText = browser.findElement(By.cssSelector("div[id='demo']"));
		
		assertEquals(resultText.getText(), "Hello Harry Potter! How are you today?");
		
	}
}
