package curs18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

/*tagname[atribut=valoareAtribut]  ---F12, click in DOM, apoi ctrl +F, si apare jos -->  ... pt a modifica in josul ferestrei html
 * 
 * <li class="menu_user_login">    -- copy outer html - copiaza de la tag ul de deschidere pana la cel de inchidere
 * 
 * li -->  tagname 
 * class --> atribut
 * 
 * menu_user_login  --> valoare atribut
 * 
 * li[class='menu_user_login']
 * 
 * mereu primul este tag ul: poate fi a, li, div ...
 * 
 * in css atributul id si class au shortcut uri --> prin . se intelege atributul class  -->  .menu_user_login este la fel cu [class='menu_user_login']	la fel si li.menu_user_login este la fel cu li[class='menu_user_login']                                           
 * 
 *                                              --> prin # se intelege atributul id  --> input#log
 *  in search   //li   cauta tot ce cu li
 * 
 * 
 * 
 * 
 */

public class CssSelectorExample extends BaseTest {

	//@Test
	public void cssSelectorExample1() {
		
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		
		// .--> class
		
		WebElement loginLink = browser.findElement(By.cssSelector(".menu_user_login"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",loginLink);  //highlight elementul 
		
		loginLink.click();
		
		
		//# --> id  
	
		
		WebElement user = browser.findElement(By.cssSelector("input#log"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",user);  //highlight elementul 
		
		user.sendKeys("Test");
		
		//input[name='pwd'][placeholder='Password'][type='Password']  --> functioneaza ca un AND, trebuie sa fie toate cele 3 atribute pentru a gasi wel elementul acesta
		
		// logical AND
		WebElement pass = browser.findElement(By.cssSelector("input[name='pwd'][placeholder='Password'][type='Password']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:pink; border: 4px solid green;')",pass);  //highlight elementul 
		
		
		
		//logical OR
		//input[id='rememberme'],[type='checkbox'],[value='forever'] --> la fel ca AND doar ca este virgula intre atribute
		
		WebElement rememberMe = browser.findElement(By.cssSelector("id='rememberme'],[type='checkbox'],[value='forever']"));
				
		rememberMe.click();
		
		
		// form[name='login_form']>div>input[class='submit_button']  --> asa cobori pana la un copil  -->   sageata > insemana ca treci de la parinte la copil
		
		WebElement submitButton = browser.findElement(By.cssSelector("form[name='login_form']>div>input[class='submit_button']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:pink; border: 4px solid green;')",submitButton);  //highlight elementul		
		submitButton.click();		
		
	}
	
	@Test
	public void cssSelectorExample2() {
		
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		// sc_title sc_title_regular sc_align_center margin_bottom_tiny
		//h3[class='sc_title sc_title_regular sc_align_center margin_bottom_tiny']
		//h3[class*='tiny']  --> * inseamna ca ce caut contine atributul 'tiny', astfel restrang punctele de cautare
		
		// * --> contains
		
		WebElement book1 = browser.findElement(By.cssSelector("a[href*='deep-silence']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:pink; border: 4px solid green;')",book1);  //highlight elementul
		
		// ^ --> starts with 
		
		// a[href^='life']
		
		WebElement book2 = browser.findElement(By.cssSelector(" a[href^='life']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",book2);  //highlight elementul
		
		//$ --> end with
		//a[href$='story']
		
		WebElement book3 = browser.findElement(By.cssSelector(" a[href$='story']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",book3);  //highlight elementul
		
		
		//div[class~='wpb_text_column wpb_content_element ']  --> cauta o secventa de caractere care incepe la un spatiu si se termina la un spatiu
		//div[class~='wpb_content_element'] --> contains word
		
		WebElement book4 = browser.findElement(By.cssSelector(" div[class~='wpb_content_element']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid green;')",book4);  //highlight elementul
		
	}
	
}
