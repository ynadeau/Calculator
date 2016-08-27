/**
 * File Name: Calculator.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 24, 2016
 */
package Calculator;

/**
 * Calculator //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class Calculator {

	static double addition; // *
	// private static Scanner scanner;

	static double divide; // *

	static double mult; // *

	static double pwr; // *

	/**
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double addNumbers(double num1, double num2) {
		addition = num1 + num2;
		System.out.println("Addition is:" + addition);
		return addition;
	}

	// static double powers;
	// static double pwr;
	/**
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double divideNumbers(double num1, double num2) {
		divide = num1 / num2;
		System.out.println("div is:" + divide);
		return divide;
	}

	/**
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static double multNumbers(int nums1, int nums2) {
		mult = (nums1 * nums2);
		System.out.println("Mult is:" + mult);
		return mult;
	}

	/**
	 * @param number
	 * @param power
	 * @return
	 */
	public static double powerNumber(int number, int power) {
		int pwr = number;
		for (int i = 1; i < power; i++) {
			// pwr = pwr * number;
			pwr *= number;
			System.out.println("Powers is:" + pwr);
			System.out.println("number is:" + number);
		}
		/// System.out.println("Power is:" + pwr);
		// System.out.println("i is:" + powers + i);
		return pwr;
	}

	double summary = 0;

	/// public void add(int num) {
	// public void getTotal(int num) {
	// public void subtract(int num){
	// public void multiply(int num){
	public void add(int num) {
		// int total += num;
		this.summary = this.summary + num;
	}

	public double getSummary() {
		return this.summary;
	}

	public void multiply(int num) {
		this.summary = this.summary * num;
	}

	public void subtract(int num) {
		this.summary = this.summary - num;
	}
}
