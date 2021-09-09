package StringManipulation;

import java.util.Scanner;

public class SubString {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		if(s.indexOf("java") != -1) {
			System.out.println("Substring present");
		}
		else {
			System.out.println("Substring not present");
		}
		input.close();
	}

}
