package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
	public static ArrayList<Integer> fibo(int n) {
		int i = 0;
		int j = 1;
		int k = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(k);
		while (n >= 0) {
			al.add(k);
			k = i + j;
			i = j;
			j = k;
			n--;
		}
		return al;

	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		List<Integer> l = fibo(max);
		System.out.println(l);
		input.close();
	}

}
