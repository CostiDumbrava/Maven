package selenium.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
public WebDriver browser;
	
	@BeforeClass 
	public void setup() throws InterruptedException {
		
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // se adauga in Base Test si nu in @Test pentru ca e o actiune generala
		browser.get("https://keybooks.ro");
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000); //pauza de 5sec executiei, este bad practice in testarea automata
		browser.quit();	
	}

}
