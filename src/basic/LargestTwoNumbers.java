package basic;

import java.util.Arrays;
import java.util.Scanner;

public class LargestTwoNumbers {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int l = input.nextInt();
		int arr[] = new int[l];
		for(int i=0;i<arr.length;i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Largest two are "+arr[l-2]+" and "+arr[l-1]);
		input.close();
	}

}
