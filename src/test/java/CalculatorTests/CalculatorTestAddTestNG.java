/**
 * File Name: CalculatorTestAddTestNG.java<br>
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
 * CalculatorTestAddTestNG //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class CalculatorTestAddTestNG {
	// Data provider understanding
	// public static double addNumbers(double num1, double num2) {
	// addition = num1 / num2;
	// System.out.println("Addition is:" + addition);
	// return addition;}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 2, 2, 4.0 }, new Object[] { 3, 3, 6.0 }, };
	}

	// Test for Powers
	@Test(dataProvider = "dp")
	public void testAddNumbers(double num1, double num2, Object expected) {
		double actual = Calculator.addNumbers(num1, num2);
		Assert.assertEquals(actual, expected, "Calculator add Method does not work properly");
	}
	// @Test(dataProvider = "dp")
	// public void TestPowerNumbers(Integer n, String s) {
	// }
}
