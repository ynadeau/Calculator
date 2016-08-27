package CalculatorTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Calculator.Calculator;

public class CalculatorPowersTestNG {

	// Data provider understanding
	// int num1 = 2; int num1 = 3;
	// int num2 = 2; int num2 = 3;
	// int expected = 4; int expected = 27;
	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 2, 2, 4 }, new Object[] { 3, 3, 27 }, };
	}

	// Test for Powers
	@Test(dataProvider = "dp")
	public void testPowerNumbers(int num1, int num2, Object expected) {
		int actual = (int) Calculator.powerNumber(num1, num2);
		Assert.assertEquals(actual, expected, "Calculator power Method does not work properly");
	}
	// @Test(dataProvider = "dp")
	// public void TestPowerNumbers(Integer n, String s) {
	// }
}
