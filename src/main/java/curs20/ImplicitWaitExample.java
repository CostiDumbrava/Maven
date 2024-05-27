package curs20;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ImplicitWaitExample extends BaseTest {
	
	@Test
	public void implicitWait() throws InterruptedException {
		
		browser.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		//asteapta ca elememntul sa fie prezent in DOM, dar e o comanda generica, nu asteapta un element anume de aceea se foloseste in Seleniu.utils -> Base Test!! si nu in @Test
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		browser.findElement(By.cssSelector("div[id='start']>button")).click();
		
		//Thread.sleep(8000); //bad practice - el ingheata si asteapta tot timpul, in schimb wait ul asteapta ceva, iar in momentul in care a fost indeplinita conditia iese din wait si nu mai asteapta in plus
		
		WebElement finishText = browser.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finishText.getText(), "Hello World!");
		
		
		
	}

}
