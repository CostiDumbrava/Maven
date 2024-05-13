package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WebElementExample {
	
	//selenium stie sa controleze o aplicatie web, nu stie sa faca assert (de aceea avem testng),
	//nu stie sa faca rapoarte(testng), nu stie sas ruleze (testng)
	// selenium + testng + alte libratii rezulta o suita de testare automata
	
	
	//web developer tools - in cadurlunui site web - F12
	//Elements, Network, Application, Storage - Cookies
	//Elements - elemente html - inspector sageata <- hoover
	
	//Chrome driver downloads... incepand cu versiunea 4.4 de Selenium, Selenium isi cauta automat driver ul
   // comanda din dom in browser se face prin acest chrome driver 
	
	//cautam in dom elemente de cautare  - locatori
	
	//<a, <li , <ul = sunt tag uri html
	//tag urile pot fi de inchidere sau de deschidere
	//    < tag de deschidere
	//    </ - tag de inchidere
	// tag urile pot contine diverse atribute ,a href --- href este atribut
			
	
	WebDriver browser;
	
	@BeforeClass 
	public void setup() {
		
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://keyfood.ro");
		
	}
	
	@AfterClass
	public void tearDown() {
		browser.quit();	
	}
	
	@Test
	public void login() {
		
		browser.findElement(By.linkText("My account")).click();  // primeste parametru un locator
		// prima parte este web element -- pana la click
	}
	
	
}
