package curs17;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class SeleniumLocators extends BaseTest{
	
	//Selenium atinge doar fisierul HTML, nu si fisierul css
	//in fisierul css sunt definite stilul scrisului, marimea
	
	//strategii care ne ajuta sa gasim web elementele
	
	//testele de selenium verifica comportamentul final al utilizatorului
	
	/*
	 * tagname -- nu este f folosit pt ca sunt f multe nume duplicate, spre ex. - div -
	 * linktext
	 * partialLinkText
	 * class  - copiez valoarea atributului class din DOM
	 * id     - copiez valoarea atributului id din DOM
	 * name
	 * css Selector - Selenium doar il foloseste, nu l controleaza 
	 * Xpath  - Selenium doar il foloseste, nu l controleaza \; este cel mai puternic locator dar nu e neaparat cel mai bun. Cel mai bun este locatorul specific in functie de ce nevoie am
	 * 
	 */
	
	
	/*
	 * Relative locators:    sunt locatori care ne ajuta sa gasim un element in apropierea altui element
	 * 
	 * toLeftOf()
	 * toRightof()
	 * above()
	 * below()
	 * near()    -- are o raza, in apropierea lui
	 * 
	 */
    @Test(priority=1) //nu trebuie sa avem niciodata o metoda @Test fara asser in ea!!!!! Este o metoda de test si trebuie sa verific daca rezultatul este la fel cu ce asteptam sa se intample
	public void tagnameLocator() {
    	//<em>Discover</em>    --text ul din pagina web Discover Your Next Book
    	//    textul dintre tag uri, dintre sageti, tagutile : em>  ... <em
    	
    	WebElement discoverText = browser.findElement(By.tagName("em"));
    	String text = discoverText.getText(); // returneaza textul dintre tag -urile HTML
		System.out.println(text);
		assertEquals(text,"Discover"); // in consola --> PASSED: tagnameLocator
	}
    
    @Test(priority=2)
    public void linkTextLocator() {
    		//linkLocator este web elementul care incepe cu <a
    	//<a href="http://keybooks.ro/shop/">Books</a>
    	
    	WebElement shopLink = browser.findElement(By.linkText("BOOKS"));//trebuie caps lock obligatoriu
    	
    	shopLink.click(); //face click pe element, comanda direct pe element
    	
    	assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/shop/"); // comanda pe web element
    		
    }
    
    @Test(priority=3)
    public void partialLinkTextLocator() {
    	//https://keybooks.ro/shop/a-banquet-of-mouse/
    	WebElement book = browser.findElement(By.partialLinkText("banquet"));
    	book.click();
    	
    	assertEquals(browser.getCurrentUrl(),"https://keybooks.ro/shop/a-banquet-of-mouse/");	
    	
    }
    
    @Test(priority=4)
    public void classNameLocator() {
    	
    	WebElement price = browser.findElement(By.className("price"));
    	
    	System.out.println(price.getText()); //$10.20 $9.99 apar ambele preturi
    	
    	assertTrue(price.getText().contains("9.99"));// este o validare booleana; putema folosi assertFalse daca voiam sa vedem ca nu contine
    	
    }
    
    
    //id ul ar trebui sa fie unic, ar fi locatorul ideal dar, problema e ca poate fi si dublat(se genereaza automat si are un numar la final) sau lipseste id ul complet la un web element
	
    
    @Test(priority=5) //de verificat eroarea!!!!!!!!!!!!!!
    public void idLocator() {
    	
    	WebElement revieTab = browser.findElement(By.id("comment-reply-title"));
    	
    	WebElement commentBox = browser.findElement(By.id("comment"));
    	
    	assertTrue(commentBox.isDisplayed()); //verifica daca este vizibil nu daca exista in DOM
    	
    	
    	/*
    	 * isDisplayed() --> verifica daca un element este vizibil
    	 * isEnabled() --> verifica daca un element este enabled 
    	 * isSelected() --> doar pentru checkbox sau radio button
    	 * 
    	 */
    	
    }
    
    @Test(priority=6) 
    public void nameLocator() throws InterruptedException {
    	
    	WebElement commentBox = browser.findElement(By.name("comment"));
    	commentBox.sendKeys("My super message");
    	Thread.sleep(3000);
    	commentBox.clear();//elimina textul dintr un element care primeste input
    	Thread.sleep(3000);
    	commentBox.sendKeys("New message");
    }
    
    @Test(priority=7)
    public void cssSelectorLocator() {
    	
    	//tag name [atribut]  asa se scrie css in forma cea mai  simpla 
    	//input[name='author']
    	//css este limitat sa citeasca elementele intre sageti ><, xpath-ul poate sa faca asta
    	
    	browser.findElement(By.cssSelector("input[name='author']")).sendKeys("Test");
    	
    	
    }
    
    @Test(priority=8)
    public void xpathLocator() {
    	
    	//asa se scrie in forma cea mai simpla   //input[@type='email']
    	
    	browser.findElement(By.xpath("//input[@type='email']")).sendKeys("test@test.com");
    	
    }
}
