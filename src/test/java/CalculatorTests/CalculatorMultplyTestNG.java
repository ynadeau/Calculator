/**
 * File Name: CalculatorMultplyTestNG.java<br>
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
 * CalculatorMultplyTestNG //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
// public void add(int num) {
// public void multiply(int num) {
// this.summary = this.summary * num;}
// public double getSummary() {
// return this.summary; }
public class CalculatorMultplyTestNG {

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 2, 0.0 }, new Object[] { 3, 0.0 }, };
	}

	// Test for Powers
	@Test(dataProvider = "dp")
	public void testAddingNumbers(int num1, Object expected) {
		Calculator multiplier = new Calculator();
		multiplier.multiply(num1);
		double actual = multiplier.getSummary();
		Assert.assertEquals(actual, expected, "Calculator Addition Method does not work properly");
	}
}
