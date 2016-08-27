package CalculatorTests;

import org.junit.Assert;
import org.junit.Test;

import Calculator.Calculator;

/**
 * File Name: CalculatorTest.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 24, 2016
 */
/**
 * CalculatorTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class CalculatorTestDivide {

	Object actual;

	double expected = 0.5;

	int num1 = 3;

	int num2 = 6;

	double results2;

	@Test
	public void testCalculatorStaticDiv() {
		this.results2 = Calculator.divideNumbers(this.num1, this.num2);
		System.out.println("division is: " + this.results2);
		Assert.assertEquals("Divider function does not calculate division correctly", this.expected, this.results2, 0);
	}
	// results2 = (int) Calculator.divideNumbers(num1, num2);
	// results3 = Calculator.powerNumber(num1, num2);
	// public int getTotal();
	// public void add(int num);
	// public void subtract(int num);
	// public void multiply(int num);
}
