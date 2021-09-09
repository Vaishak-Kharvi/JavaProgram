package basic;

import java.util.Scanner;

public class ReverseNumber {
	public static int reverse(int number) {
		int num = number;
		int last = 0;
		int rev = 0;
		while (num > 0) {
			last = num % 10;
			rev = (rev * 10) + last;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int result = reverse(n);
		System.out.println(result);
		input.close();
	}
}
