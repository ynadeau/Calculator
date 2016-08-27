package CalculatorTests;

import org.junit.Assert;
import org.junit.Test;

import Calculator.Calculator;
// import junit.framework.Assert;

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
public class CalculatorTestMult {

	Object actual;

	int num1 = 3;

	int num2 = 6;

	int result;

	@Test
	public void testCalculatorStaticMult() {
		this.result = (int) Calculator.multNumbers(this.num1, this.num2);
		Assert.assertEquals("Multiplier function does not calculate Multipication correctly", 18, this.result);
	}
}
// results2 = (int) Calculator.divideNumbers(num1, num2);
// results3 = Calculator.powerNumber(num1, num2);
// public int getTotal();
// public void add(int num);
// public void subtract(int num);
// public void multiply(int num);
