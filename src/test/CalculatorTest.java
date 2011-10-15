package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.Calculator;

public class CalculatorTest {

	Calculator c = null;
	
	@Before
	public void setup(){
		c = new Calculator();
	}

	@Test
	public void shouldSumTwoIntgers(){
		assertEquals(2,c.solve("1+1"));
		assertEquals(3,c.solve("2+1"));
		assertEquals(3,c.solve("1+2"));
		assertEquals(130,c.solve("127+3"));
	}
	
	@Test
	public void shouldSumTwoIntgersWithSpaces(){
		assertEquals(2,c.solve("1 + 1"));
	}
	
	@Test
	public void shouldSumMultipleIntegers(){
		assertEquals(4,c.solve("1+1+2"));
		assertEquals(5,c.solve("1+1+2+1"));
	}
}
