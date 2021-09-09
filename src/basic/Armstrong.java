package basic;

import java.util.Scanner;

public class Armstrong {
	public static boolean armstrong(int n) {
		int sum = 0;
		int num = n;
		int last;
		while(num>0) {
			last = num % 10;
			sum = sum + (int)(Math.pow(last, 3));
			num = num / 10;
		}
		if(sum == n) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		boolean result = armstrong(number);
		System.out.println(number+" Armstrong = "+result);
		input.close();
	}

}
