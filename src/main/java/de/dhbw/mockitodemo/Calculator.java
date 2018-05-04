package de.dhbw.mockitodemo;

public class Calculator {
	
	private CalculatorService calculatorService;

	public Calculator(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	public int add(int i, int j) {
		return calculatorService.add(i, j);
	}

	public int substract(int i, int j) {
		return calculatorService.substract(i, j);
	}
	
	public int multiply(int i, int j) {
		return calculatorService.multiply(i, j);
	}
	
	public double divide(int i, int j)
	{
		if(j == 0) throw new IllegalArgumentException();
		return calculatorService.divide(i, j);
	}

}
