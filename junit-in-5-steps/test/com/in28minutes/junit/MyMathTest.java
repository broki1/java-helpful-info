package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MyMathTest {
	
	// assertEquals(true/false, condition)
	// assertTrue(condition)
	// assertFalse(condition)
	// assertNotNull(condition)
	// assertNull(condition)
	// assertArrayEquals(array1, array2)
	
	@Before
	public void beforeMethod() {
		System.out.println("B E F O R E");
	}
	
	@After
	public void afterMethod() {
		System.out.println("A F T E R");
	}

	@Test
	void sum_with_4_numbers() {
		MyMath myMath = new MyMath();
		
		int result = myMath.sum(new int[]{5, 4, 7, 9});
		
		assertEquals(25, result);
	}
	
	@Test
	void sum_with_1_numbers() {
		MyMath myMath = new MyMath();
		
		int result = myMath.sum(new int[]{55});
		
		assertEquals(55, result);
	}

}
