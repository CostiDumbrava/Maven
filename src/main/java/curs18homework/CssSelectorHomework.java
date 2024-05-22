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
		 
	}
	
}
