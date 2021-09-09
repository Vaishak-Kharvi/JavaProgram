package basic;

import java.util.Scanner;

public class Palindrome {
	public static boolean palindrome(int number) {
		int num = number;
		int last = 0;
		int rev =0 ;
		while(num>0) {
			last = num % 10;
			rev = (rev * 10) + last;
			num = num/10;
		}
		if(rev == number) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean result = palindrome(n);
		System.out.println("Palindrime = "+result);
		input.close();
	}

}
