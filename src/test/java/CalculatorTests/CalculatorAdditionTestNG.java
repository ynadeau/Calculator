package CalculatorTests;

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

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Calculator.Calculator;

public class CalculatorAdditionTestNG {

	// Data provider understanding
	// int num1 = 2; int num1 = 3;
	// int num2 = 2; int num2 = 3;
	// int expected = 4; int expected = 27;
	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 2, 2.0 }, new Object[] { 3, 3.0 }, };
	}

	/**
	 * @param num1
	 * @param num2
	 * @param expected
	 */
	// public void add(int num) {
	// int total += num;
	// this.summary = this.summary + num; }
	//
	// public double getSummary() {
	// return this.summary; }
	//
	// Test for Addition
	@Test(dataProvider = "dp")
	public void testAddingNumbers(int num1, Object expected) {
		Calculator adder = new Calculator();
		adder.add(num1);
		double actual = adder.getSummary();
		Assert.assertEquals(actual, expected, "Calculator Addition Method does not work properly");
	}
}
