package patterPrinting;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);

		System.out.println("Enter row value ");

		int r = S.nextInt();

		for (int i = r; i >= 1; i--) {

			for (int j = r; j > i; j--) {

				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {

				System.out.print("*");

			}

			System.out.println(" ");

		}

	}

}
