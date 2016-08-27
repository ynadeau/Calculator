/**
 * File Name: CalculatorSubtractTestNG.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 27, 2016
 */
package CalculatorTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Calculator.Calculator;

/**
 * CalculatorSubtractTestNG //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class CalculatorSubtractTestNG {

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 2, -2.0 }, new Object[] { 3, -3.0 }, };
	}

	// public void subtract(int num) {
	// this.summary = this.summary - num;}
	//
	// public double getSummary() {
	// return this.summary; }
	//
	// Test for multiplier
	@Test(dataProvider = "dp")
	public void testSubtractingNumbers(int num1, Object expected) {
		Calculator subtract = new Calculator();
		subtract.subtract(num1);
		double actual = subtract.getSummary();
		Assert.assertEquals(actual, expected, "Calculator Addition Method does not work properly");
	}
}
