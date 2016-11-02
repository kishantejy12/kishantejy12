package string;

import java.util.Scanner;

public class FibanacciRecursive {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int x, y, z, n = 1, a;
			System.out.println("Enter number to find Fibonacci series  ");
			a = sc.nextInt();
			x = y = 1;

			while (n <= a) {
				System.out.println(x);
				z = x + y;
				x = y;
				y = z;
				n++;
			}
		}
		catch (Exception e) {
			System.out.println("enter proper number");
		}
	}
}