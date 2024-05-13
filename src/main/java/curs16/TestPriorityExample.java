package curs16;

import org.testng.annotations.Test;

public class TestPriorityExample {
	
	//testng ul ruleaza testele in ordinea alfabetica a metodelor daca nu stabilim nici o prioritate
    //in general vrem o ordine stabilita de noi, si dam o prioritate; cel mai mic nr este primul rulat
	//daca implementez metode independente nu e nevoie de prioritate, dar in practica nu sunt multe astfel de cazuri
	//daca pun la cateva priority trebuie sa pui la toate, pentru ca cele fara prioritate sunt rulate primele, in ordine alfabetica
	
	@Test (priority=1)
	public void one() {
		
		
		System.out.println("First");
	}
	@Test (priority=2)
    public void two() {
		
		
		System.out.println("Second");
	}

	@Test (priority=3)
   public void three() {
	
	System.out.println("Third");
}
    @Test
	public void four() {
		System.out.println("Fourth");
		
	}
	
    @Test
   	public void five() {
   		System.out.println("Fifth");
   		
   	}
}
