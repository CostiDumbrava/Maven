package curs20;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class FluentWaitExample extends BaseTest{
	
	@Test
	public void fluentWaitExample() { //fluent wait este un explicit wait configurabil
		

		browser.get("https://the-internet.herokuapp.com/dynamic_loading/2");
			
		browser.findElement(By.cssSelector("div[id='start']>button")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(browser).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(250))
				.ignoring(NoSuchElementException.class); // este un chain de metode
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[id='finish']>h4"),"Hello World!"));// la fel ca un explicit wait
		
		
		
		WebElement finishText = browser.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finishText.getText(), "Hello World!");
		
		
	}
	

}
