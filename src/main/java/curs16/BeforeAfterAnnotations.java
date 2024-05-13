package curs16;

import org.testng.annotations.*;

public class BeforeAfterAnnotations {
	
	//adnotarea @Test este singura care are legatura cu public void main 
	
	@BeforeSuite // este cel mai inalt nivel ierarhic, va rula inaintea suitei
	public void beforeSuite() {
		
		System.out.println("Before suite");
		
	}

	@AfterSuite 
	public void afterSuite() {
		
		System.out.println("After suite");
		
	}
	
	//urmatorul in ierarhie lui before si after este:
	
	
	@BeforeTest // se refera la un tag dintr un .xml de configurare
	public void beforeTest() {
		
		System.out.println("Before test");
		
	}

	@AfterTest 
	public void afterTest() {
		
		System.out.println("After test");
		
	}
	
	//urmatorul in ierarhie lui before si after este:
	
	@BeforeClass // se refera la o clasa java, care poate fi o clasa de test
	            // se va executa pt fiecare clasa din pachet 
	
	public void beforeClass() {
		
		System.out.println("Before class");
		
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("After class");
		
	}
	
	//urmatorul in ierarhie lui before si after este: 
	

	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before method");
		
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After method");
		
	}
	
	@Test
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test2");
	}
	
	@Test
	public void test3() {
		
		System.out.println("Test3");
	}
	
	
}
