package curs19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CssSelectorExample extends BaseTest {
	
	
	//@Test
	public void cssSelectorExample1() {
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		//direct child 
		browser.findElement(By.cssSelector("li[class='menu_user_login']>a")).click();
		
		
		//ul[id='menu_user'] input[name='log'] --> spatiu este referinta pentru decender 
		//descendant
		WebElement username = browser.findElement(By.cssSelector("ul[id='menu_user'] input[name='log']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",username);  //highlight elementul 
		
        
        //ul#menu_user form.login_form>div.password_field>input[type='password'] - combinat shortcut si fara shortcut, nu e neparat ok, e foarte greu de urmarit
              
        WebElement password = browser.findElement(By.cssSelector("ul#menu_user form.login_form>div.password_field>input[type='password']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",password);  //highlight elementul
        
        
        //ul input:not([type='hidden'],[type='text'],[type='password'],[type='submit']) --> not, folosit sa gasesti un element atunci cand nu ai nici un atribut clar despre elementul respectiv
        
        WebElement checkbox = browser.findElement(By.cssSelector("ul input:not([type='hidden'],[type='text'],[type='password'],[type='submit'])"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",checkbox);  //highlight elementul
        checkbox.click();
        
	}
	
	@Test
    public void cssExampl2() {
		JavascriptExecutor jse = (JavascriptExecutor)browser;
	
		browser.findElement(By.cssSelector("div[class='menu_main_wrap' ] a[href='https://keybooks.ro/shop/']")).click();
		Actions action = new Actions(browser);
		action.scrollByAmount(0, 1200).perform(); //trebuie acest perform la final altfel nu executa metodele obiectului
		                     //x,y --> sunt pe axe 
		
		
		//ul[class='product-categories']>li:first-child
		//first-child
		
		WebElement category1 = browser.findElement(By.cssSelector("ul[class='product-categories']>li:first-child"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",category1);  //highlight elementul
		
		
		//last-child
		WebElement category11 = browser.findElement(By.cssSelector("ul[class='product-categories']>li:last-child"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",category11);  //highlight elementul
		
		
		//ul[class='product-categories']>li:nth-child(8) --> al n-lea copil, in acest caz al 8 lea copil
		WebElement category8 = browser.findElement(By.cssSelector("ul[class='product-categories']>li:nth-child(8)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",category8);  //highlight elementul
		
		//ul[class='product-categories']>li:nth-child(3n) --> sare din al 3-lea in al 3-lea copil in aces exemplu, dar poate fi selectat orice numar 
		
		
		//selectez din n in n pornind de la un anumit numar 
		//ul[class='product-categories']>li:nth-child(2n+4) --> se duce pe elementul 4 si apoi sare din 2 in 2 in acest exemplu
		
		//ul[class='product-categories']>li:nth-child(odd) --> sare din nr impar in impar 
		//ul[class='product-categories']>li:nth-child(even)  -->sare din nr par in par
		
			
}
}
