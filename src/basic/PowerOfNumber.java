package basic;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = input.nextInt();
		System.out.println("Enter the power ");
		int power = input.nextInt();
		int sum = 1;
		while(power>0) {
			sum = sum * number;
			power--;
		}
		System.out.println(sum);
		
		input.close();
		
	}

}
