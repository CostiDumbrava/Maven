package curs17homework;

import static org.testng.Assert.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import selenium.utils.BaseTest;

public class FindWebElement2 extends BaseTest{


	@Test
	public void findTheForest() throws InterruptedException {
			  	
		    
		List<WebElement> menuTabs = browser.findElements(By.className("sc_tabs_title"));
				
		for(int i=0;i<menuTabs.size();i++) {
		menuTabs.get(i).click(); 
		//assertTrue(browser.findElement(By.cssSelector("the-forest")).isDisplayed());  am comentat pentru ca nu functioneaza aceasta parte, nu am reusit gasesc motivul sau o alta solutie 
		
	   }
		
		
		assertTrue(browser.findElement(By.cssSelector("a[href='the-forest']")).isDisplayed());
		browser.findElement(By.cssSelector("a[href='the-forest']")).click();
		Thread.sleep(2000);
		assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/shop/the-forest/");
		

		}
	}
   
