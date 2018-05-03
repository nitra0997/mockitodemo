package de.dhbw.mockitodemo;

public class CalculatorService {

	public int add(int i, int j) {
		return i + j;
	}

	public int substract(int i, int j) {
		return i - j;
	}
	
	public int multiply(int i, int j) {
		return i * j;
	}
	
	public double divide(int i, int j)
	{
		if (j == 0) {
			throw new IllegalArgumentException("Can't divide by zero!");
		}
		return (double) i / j;
	}
	
}
