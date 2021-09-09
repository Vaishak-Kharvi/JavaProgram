package StringManipulation;

import java.util.Scanner;

public class String_Manipulation {
	///hi my name is vaishak
	//c1 : remove space
	//c2 : reverse
	//c3 : print odd char
	public StringBuffer reverse(String s1) {
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		return sb;
	}
	public String removeSpace(StringBuffer s2) {
		String rs = new String(s2);
		String ws = rs.replaceAll(" ", "");
		return ws;
	}
	public StringBuffer printOdd(String s3) {
		char arr[] = s3.toCharArray();
		StringBuffer oddOutput = new StringBuffer();
		for(int i = 0; i<arr.length;i++) {
			if(i%2 == 0) {
				oddOutput = oddOutput.append(arr[i]);
			}
		}
		return oddOutput;
		
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String_Manipulation sm = new String_Manipulation();
		StringBuffer reverse = sm.reverse(s);
		System.out.println(reverse);
		String withourSpace = sm.removeSpace(reverse);
		System.out.println(withourSpace);
		StringBuffer finalResult = sm.printOdd(withourSpace);
		System.out.println(finalResult);
		input.close();
	}

}
