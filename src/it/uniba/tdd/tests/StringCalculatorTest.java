package it.uniba.tdd.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniba.tdd.StringCalculator;

public class StringCalculatorTest {

	StringCalculator calc;
	
	@Before
	public void setUp(){
		calc = new StringCalculator();
	}
	
	
	@Test
	public void testVoidStringReturnZero() {
		//Act
		int ris = calc.add("");
		//Assert
		assertEquals(0,ris);
	}
	
	@Test
	public void testStringReturnANumber() {
		//Act
		int ris = calc.add("3");
		//Assert
		assertEquals(3,ris);
	}
	
	@Test
	public void testStringReturnSumTwoNumbers() {
		//Act
		int ris = calc.add("3,2");
		//Assert
		assertEquals(5,ris);
	}
	
	@Test
	public void testStringReturnSumThreeNumbers() {
		//Act
		int ris = calc.add("3,2,1");
		//Assert
		assertEquals(6,ris);
	}
	
	@Test
	public void testStringReturnSumFourNumbers() {
		//Act
		int ris = calc.add("3,2,1,7");
		//Assert
		assertEquals(13,ris);
	}
	
	@Test
	public void testIgnoreNewLine() {
		//Act
		String ris = calc.deleteNewLine("1\n2,3");
		//Assert
		assertEquals("1,2,3",ris);
	}
	
	@Test
	public void testStringReturnSumOfNumbersWithOneNewLine() {
		//Act
		int ris = calc.add("1\n2,3");
		//Assert
		assertEquals(6,ris);
	}
	
	@Test
	public void testStringReturnSumOfNumbersWithTwoNewLine() {
		//Act
		int ris = calc.add("1\n2\n3");
		//Assert
		assertEquals(6,ris);
	}
	
	@Test
	public void testIgnoreNumberEqual1000() {
		//Act
		int ris = calc.ignoreNumbersBiggerThan1000("1000");
		//Assert
		assertEquals(0,ris);
	}
	
	@Test
	public void testIgnoreNumberEquals1200() {
		//Act
		int ris = calc.ignoreNumbersBiggerThan1000("1200");
		//Assert
		assertEquals(0,ris);
	}
	
	@Test
	public void testNotIgnoreNumbersUnder1000() {
		//Act
		int ris = calc.ignoreNumbersBiggerThan1000("12");
		//Assert
		assertEquals(12,ris);
	}
	
	@Test
	public void testSumWithNumbersBiggerThan1000() {
		//Act
		int ris = calc.add("12,1200,1");
		//Assert
		assertEquals(13,ris);
	}
	
	@Test
	public void testSumWithNumbersBiggerThan1000AndNewLine() {
		//Act
		int ris = calc.add("12,1200\n1");
		//Assert
		assertEquals(13,ris);
	}
	
	@Test
	public void testIgnoreNumberEquals1200a() {
		//Act
		int ris = calc.add("1200");
		//Assert
		assertEquals(0,ris);
	}

}
