package curs18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class RelativeLocatorsExample extends BaseTest {
	/*identifici un element pe baza altui element din apropiere:
	 * 
	 * toLeftOf()
	 * toRightOf()
	 * above()
	 * below()
	 * near()
	 * 
	 */
	
	@Test
	public void relativeLocatorsExample() {
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		
	//h5[class*='sc_title_regular']
	//toLeftOf()
		
		WebElement price1 = browser.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title_regular']")).toLeftOf(By.cssSelector("a[href*='garden']")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:pink; border: 4px solid green;')",price1);  //highlight elementul
		
		//toLeftOf()
		
		WebElement price2 = browser.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title_regular']")).toRightOf(By.cssSelector("a[href*='garden']")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:pink; border: 4px solid green;')",price2);  //highlight elementul
		
		
        //below
		WebElement price3 = browser.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title_regular']")).below(By.cssSelector("a[href*='garden']")));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",price3);  //highlight elementul
		
		
		//above
		//div[class='wpb_wrapper']
		
		WebElement author = browser.findElement(RelativeLocator.with(By.cssSelector("div[class='wpb_wrapper']")).above(price1));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",author);  //highlight elementul
		
		//near
		//img[src*='book3']

		WebElement picture = browser.findElement(RelativeLocator.with(By.cssSelector("img[src*='book3']")).near(By.cssSelector("a[href*='garden']"), 300));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",picture);  //highlight elementul
		
		
		
		
		
	}

}
