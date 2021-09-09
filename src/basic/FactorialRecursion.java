package basic;

import java.util.Scanner;

public class FactorialRecursion {
	static int result = 1;

	public static int factorial(int n) {
		if (n > 0) {
			result = result * n;
			n--;
			factorial(n);
		}
		return result;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		int fact = factorial(max);
		System.out.println(fact);
		input.close();
	}

}
