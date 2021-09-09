package basic;

import java.util.Scanner;

public class RandomNumber {
	public static int randomNumber(int m, int n) {
		int num = (int) (Math.random() * (m - n) + n);
		return num;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		int min = input.nextInt();
		double number = randomNumber(max, min);
		System.out.println("Random number between " + max + " and " + min + " is " + number);
		input.close();
	}

}
