package curs15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	//add testNG library
	//import testNG
	
	//cand adnotarea @Test este prezenta deasupra unei metode avem o referinta catre o 
	//functionalitate - putem accesa in acest caz fara main 
	
	@Test
	public void openBrowser() {
		
		
		//FirefoxDriver()
		//EdgeDriver()
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.emag.ro");
		
	}

}
