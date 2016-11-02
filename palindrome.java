package palindrome;

import java.util.Scanner;

public class palindrome {
private	int z = 0;
	private int y;

	public palindrome() {
		try {
			
			System.out.print("Enter Number integer : ");

			Scanner x = new Scanner(System.in);
			int pal = x.nextInt();
			int a = pal;
			while (pal > 0) {
				y = pal % 10;
				z = z * 10 + y;
				pal = pal / 10;
			}
			if (z == a)
				System.out.println(a + " is a Palindrome Number!");
			else
				System.out.println(a + " is not a Palindrome Number!");
		} catch (Exception e) {
			System.out.println("enter proper number");
		}
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] args) {

		palindrome p = new palindrome();

	}
}
