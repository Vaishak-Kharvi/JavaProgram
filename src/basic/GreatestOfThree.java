package basic;

import java.util.Arrays;
import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Greatest of three number is "+arr[2]);
		input.close();
	}

}
