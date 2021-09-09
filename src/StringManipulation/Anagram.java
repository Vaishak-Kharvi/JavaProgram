package StringManipulation;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	/*
	 * s = listen
	 * s2 = silent
	 * 
	 * remove white space
	 * sort
	 * equals
	 */
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		
		String rws1 = s1.replaceAll(" ", "").toLowerCase();
		String rws2 = s2.replaceAll(" ", "").toLowerCase();
		
		char arr1[] = rws1.toCharArray();
		Arrays.sort(arr1);
		
		char arr2[] = rws2.toCharArray();
		Arrays.sort(arr2);
		
		System.out.println(Arrays.equals(arr1, arr2));
		input.close();
	}

}
