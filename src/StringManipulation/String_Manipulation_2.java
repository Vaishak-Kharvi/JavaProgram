package StringManipulation;

import java.util.Scanner;

public class String_Manipulation_2 {
	public static String removeWhiteSpace(String s1) {
		String ws = s1.replaceAll(" ", "");
		return ws;
	}

	public static StringBuffer reverseString(String s2) {
		StringBuffer sb = new StringBuffer(s2);
		sb.reverse();
		return sb;
	}

	public static StringBuffer printOddChar(StringBuffer s3) {
		StringBuffer sb1 = new StringBuffer();
		String ss = new String(s3);
		char arr[] = ss.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sb1 = sb1.append(arr[i]);
			}
		}
		return sb1;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String rws = removeWhiteSpace(s);
		System.out.println("String after removing white space = " + rws);
		StringBuffer rev = reverseString(rws);
		System.out.println("String after reverse operation = " + rev);
		StringBuffer odd = printOddChar(rev);
		System.out.println("Odd char of string = " + odd);
		input.close();
	}

}
