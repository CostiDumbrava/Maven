package curs18homework;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CssSelectorHomework extends BaseTest {
	
	@Test
	public void sendMessage() throws InterruptedException {
		
		WebElement selectContacts = browser.findElement(By.cssSelector("a[href='https://keybooks.ro/contacts/']"));	
		selectContacts.click();
		Thread.sleep(1000);		
		
		WebElement nameField = browser.findElement(By.cssSelector("input[name='your-name']"));
		nameField.sendKeys("Ion Alexandru");
		
		WebElement emailField = browser.findElement(By.cssSelector("input[name='your-email']"));
		emailField.sendKeys("i.alexandru@yohoo.com");
		
		WebElement subjectField = browser.findElement(By.cssSelector("input[name='your-s']"));
		subjectField.sendKeys("Test");
		
		WebElement messageField = browser.findElement(By.cssSelector("textarea[name='your-message']"));
		messageField.sendKeys("Test");
		
		WebElement selectSend = browser.findElement(By.cssSelector("input[value='Send Message']"));	
		selectSend.click();
		Thread.sleep(3000);	
		
		WebElement feedbackText = browser.findElement(By.cssSelector("div[class='wpcf7-response-output']"));	
		
		assertTrue(feedbackText.isDisplayed());
		
	}
	
}
