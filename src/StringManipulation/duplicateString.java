package StringManipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class duplicateString {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String[] word = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < word.length; i++) {
			if (hm.containsKey(word[i])) {
				hm.put(word[i], hm.get(word[i]) + 1);
			} else {
				hm.put(word[i], 1);
			}
		}

		System.out.println(hm.entrySet());
		HashSet<String> hs = new HashSet<String>(hm.keySet());
		System.out.println(hs.toString());
		input.close();
	}

}
