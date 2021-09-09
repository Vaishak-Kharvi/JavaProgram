package basic;

import java.util.Scanner;

public class SwapNumbers {
	public static int[] swapNumber(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		int arr[] = new int[2];
		arr[0] = num1;
		arr[1] = num2;
		return arr;

	}

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int arr[] = swapNumber(a, b);
		System.out.println("Before swapping a = " + a + " b = " + b);
		System.out.println("After swapping a = " + arr[0] + " b = " + arr[1]);
		input.close();
	}

}
