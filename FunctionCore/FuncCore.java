package FunctionCore;

import java.util.Iterator;

public class FuncCore {
	public static void swap(int a, int b) {  //swap 2 natural numbers
		int temp = a;
		b = a;
		b = temp;
	}
	
	public static boolean primeNumber(int number) {  //check prime number
		if(number < 2) return false;
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int gcd01(int a, int b) {  //greatest common divisor (-)
		if (a == 0 || b == 0) {
			return a + b;
		}
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
			
		}
		return a;
	}
	
	public static int gcd02(int a, int b) {  ////greatest common divisor (%)
		while (a * b != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
		}
		return a + b;
	}
	
	public static boolean checkYear(int year) {  //check leap year
		if (year % 4 == 0 && year % 100 != 0 ||year % 400 == 0) {
			return true;
		}
		return false;
	}
	
	public static int fibonacci(int n) {  //find fibonacci n
		if (n == 1 || n <= 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
