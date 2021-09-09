package StringManipulation;

import java.util.HashMap;
import java.util.Scanner;

public class CountDuplicate {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		char arr[] = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i =0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm.entrySet());
		input.close();
	}

}
