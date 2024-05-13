package curs16;

import static org.testng.Assert.assertEquals;

import org.testng.TestException;
import org.testng.annotations.Test;

//un assertion este o verificare, o validare
//in totdeauna validam un expected result cu actual result, care atunci cand sunt egale testcase ul este passed altfel este failed
//practic inseamna compararea a doua obiecte


public class AssertionExample {

	String actualResult = "Test";
	String expectedResult = "Masina";
	
	//@Test
	public void checkEquality() {
		
		if(expectedResult.equals(actualResult)) {
			
			System.out.println("Test is passed");
		}else {
			
			System.out.println("Test is failed");
			throw new TestException ("Expected :" + expectedResult + " but got " + actualResult);
			
		}
	}
	
	@Test
	public void checkEquality2() {
		assertEquals(expectedResult, actualResult);
		
	}
}
