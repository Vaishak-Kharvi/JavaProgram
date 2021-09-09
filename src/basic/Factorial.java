package basic;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n){
		int fact = 1;
		while(n>0) {
			fact = fact * n;
			n--;
		}
		return fact;
		
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		int al = factorial(max);
		System.out.println(al);
		input.close();
	}

}
