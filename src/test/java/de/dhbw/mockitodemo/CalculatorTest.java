package de.dhbw.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {
	
	CalculatorService service = Mockito.mock(CalculatorService.class);
	Calculator calculator = new Calculator(service);
	
	@Test
	public void addTest()
	{
		Mockito.when(calculator.add(2, 3)).thenReturn(5);
		assertEquals(5, calculator.add(2, 3));
		Mockito.verify(service).add(2, 3);
	}
	
	@Test
	public void subtractTest()
	{
		Mockito.when(calculator.substract(3, 2)).thenReturn(1);
		assertEquals(1, calculator.substract(3, 2));
		Mockito.verify(service).substract(3, 2);
	}
	
	@Test
	public void multiplyTest()
	{
		Mockito.when(calculator.multiply(3, 2)).thenReturn(6);
		assertEquals(6, calculator.multiply(3, 2));
		Mockito.verify(service).multiply(3, 2);
	}
	
	@Test
	public void divideTest()
	{
		Mockito.when(calculator.divide(6, 2)).thenReturn(3.0);
		assertEquals(3, calculator.divide(6, 2), 4);
		Mockito.verify(service).divide(6, 2);
	}
	
	//This is an example of when NOT to mock!
	@Test(expected = IllegalArgumentException.class)
	public void divideByZeroThrowsException()
	{
		assertEquals(1, calculator.divide(3, 0), 2);
	}
	
}
