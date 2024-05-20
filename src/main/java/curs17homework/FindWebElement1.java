package curs17homework;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class FindWebElement1 {

	WebDriver browser;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://keybooks.ro/");
	}
	
	//@AfterClass
	public void tearDown() {
		browser.quit();
	}
	
	@Test
	public void login() throws InterruptedException {
		
		browser.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		assertTrue(browser.findElement(By.id("log")).isDisplayed());
			
	}
	
	
	
	
}
