package curs19homework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CssSelectorHomework19 extends BaseTest {
	String URL;
	
	@Test (priority=1)
	public void findBook() throws InterruptedException {
		
		WebElement selectSearch = browser.findElement(By.cssSelector("button[title='Open search']"));	
		selectSearch.click();
		Thread.sleep(1000);		
		
		WebElement searchText = browser.findElement(By.cssSelector("div[class='menu_main_wrap'] input[class = 'search_field']"));
		searchText.sendKeys("The story about me");
		searchText.submit();
		Thread.sleep(3000);
		
		WebElement loadMore = browser.findElement(By.cssSelector("span[class='viewmore_text_1']"));
		loadMore.click();
		Thread.sleep(3000);
		
		loadMore.click();
		Thread.sleep(3000);
		
		
		
		WebElement myBook = browser.findElement(By.cssSelector(" article[class='post_item post_item_masonry post_item_masonry_3			 post_format_standard odd']>h4[class='post_title']>a[href='https://keybooks.ro/shop/the-story-about-me/']"));
		myBook.click();
		
		Thread.sleep(3000);
		
		assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/shop/the-story-about-me/");
	
		
		WebElement addCart = browser.findElement(By.cssSelector("form[action= 'https://keybooks.ro/shop/the-story-about-me/'] button[class='single_add_to_cart_button button alt']"));
		addCart.click();
		
		Thread.sleep(3000);
		
		WebElement viewCartFeedback = browser.findElement(By.cssSelector("div[class='woocommerce-message']"));	
		assertTrue(viewCartFeedback.isDisplayed());	
		
		
		WebElement viewCart = browser.findElement(By.cssSelector("div[class='woocommerce-message']>a[href='https://keybooks.ro/cart/']"));	
		viewCart.click();
		assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/cart/");
		
		URL = browser.getCurrentUrl();
		
	}
		
	
	@Test (priority=2)
	 public void buyBook() throws InterruptedException {
			
		    browser.navigate().to(URL);
		    Thread.sleep(3000);
			WebElement modifyQuantity = browser.findElement(By.cssSelector("span[class='q_inc']"));	
			modifyQuantity.click();
			Thread.sleep(1000);		
			
			WebElement updateCart= browser.findElement(By.cssSelector("form[action= 'https://keybooks.ro/cart/'] button[value ='Update cart']"));
			updateCart.click();
			Thread.sleep(1000);
			
			WebElement updateCartFeedback = browser.findElement(By.cssSelector("div[class='woocommerce-message']"));	
			assertTrue(updateCartFeedback.isDisplayed());	

			WebElement proceedCheckOut = browser.findElement(By.cssSelector("a[href='https://keybooks.ro/checkout/']"));	
			proceedCheckOut.click();
			Thread.sleep(1000);		
			assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/checkout/");
			
			WebElement billingDetails = browser.findElement(By.cssSelector("div[class='woocommerce-billing-fields']>h3"));
			assertTrue(billingDetails.isDisplayed());	
			
			WebElement AddInfo = browser.findElement(By.cssSelector("div[class='woocommerce-additional-fields']>h3"));
			assertTrue(AddInfo.isDisplayed());	
			
	}
	
}
