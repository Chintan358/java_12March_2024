package array;

import java.util.Scanner;

public class A006_MDMEtrics {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[][] = new int[3][3];
		System.out.println("**********Enter A**********");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.println("enter value for index : " + i + " , " + j);
				a[i][j] = sc.nextInt();
			}

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("*********************");

		int b[][] = new int[3][3];

		System.out.println("**********Enter B**********");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.println("enter value for index : " + i + " , " + j);
				b[i][j] = sc.nextInt();
			}

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("***********************");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
