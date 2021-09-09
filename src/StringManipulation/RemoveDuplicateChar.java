package StringManipulation;


import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		char[] arr = s.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs.toString());
		input.close();
	}

}
