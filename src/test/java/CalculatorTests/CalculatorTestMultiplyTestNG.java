/**
 * File Name: CalculatorTestMultiplyTestNG.java<br>
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
 * CalculatorTestMultiplyTestNG //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class CalculatorTestMultiplyTestNG {
	// Data provider understanding - method
	// public static double multNumbers(int nums1, int nums2) {
	// mult = (nums1 * nums2);
	// System.out.println("Mult is:" + mult);
	// return mult;}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 2, 2, 4.0 }, new Object[] { 3, 3, 9.0 }, };
	}

	// Test for Powers
	@Test(dataProvider = "dp")
	public void testMultNumbers(int num1, int num2, Object expected) {
		double actual = Calculator.multNumbers(num1, num2);
		Assert.assertEquals(actual, expected, "Calculator add Method does not work properly");
	}
}
