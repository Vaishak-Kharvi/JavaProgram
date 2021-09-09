package basic;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean perfectNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean result = perfectNumber(n);
		if (result == true) {
			System.out.println(n + " is Perfect Number");
		} else {
			System.out.println(n + " is not Perfect Number");
		}
		input.close();
	}

}
