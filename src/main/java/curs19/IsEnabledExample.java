package curs19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class IsEnabledExample extends BaseTest {
	
	@Test
	public void isEnabledTest() {  // spre ex campurile de nume, parola login sunt enabled 
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		
		browser.findElement(By.cssSelector("li[class='menu_user_login']>a")).click();
		WebElement passField = browser.findElement(By.cssSelector("input[name='pwd']"));
		
		System.out.println(passField.isEnabled());// este boolean raspunsul - true
		
		 jse.executeScript("arguments[0].setAttribute('disabled', '')",passField);  //highlight elementul
		 
		 //passField.sendKeys("Test");// va avea eroare, pt ca este disabled acum -eroare -> "element not interactable"
		
		 System.out.println(passField.isEnabled()); //false
		 
		 
		 //element shadow DOM --> div[class='shadow-button']>button[id='showImageButton'] --> nu l gaseste, e in shadow DOM
		 //iframe --> la fel ca shadow DOM --> problema lor este ca in interiorul DOM ului mai exista un document inserat de care DOM ul nu stie
		 
		
		
	}
}
