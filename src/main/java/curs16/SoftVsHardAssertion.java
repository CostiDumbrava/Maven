package curs16;

import static org.testng.Assert.*;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftVsHardAssertion {
	
	/*
	 * 1. hard assertion -- inseamna intreruperea executiei cand conditia nu este indeplinita
	 * 2. soft assertion -- este softlanding, am prins exceptia dar nu se opreste pana la final cands arunc toate exceptiile sa vedem ce nu a functionat
	 */
	//@Test   -comentez @Test cand nu vreau sa mai execut un test 
	
	@Ignore    //este acelasi lucru cu comentarea lui @Test
   public void hardAssertExample() {
	
		System.out.println("Code here");
	   assertFalse(true);//nu trece mai departe de aici pt ca asteapta "false"
	   
	   System.out.println("Some other code here");
	   assertNotNull(null);
	   
	   System.out.println("Final code here");
}
	
	@Test
	public void softAssert() {
		System.out.println("Code here");
		SoftAssert sa = new SoftAssert();
		
		sa.assertFalse(true); //trece iar la final arunca exceptia sa stim ce nu a functionat
		System.out.println("Some other code here");
		sa.assertNotNull(null); //trece iar la final arunca exceptia sa stim ce nu a functionat
		System.out.println("Final code here");
		sa.assertAll(); // in totdeauna trebuie folosit assertAll la final, pt ca lasa sa iasa toate exceptiile intalnite
		
	}
	
	
	
}
