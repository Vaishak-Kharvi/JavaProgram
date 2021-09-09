package StringManipulation;

import java.util.Scanner;

public class FewCharUpperCase {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		char arr[] = s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 'a') {
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}
		String result = String.valueOf(arr);
		System.out.println(result);
		input.close();
	}
	
}
