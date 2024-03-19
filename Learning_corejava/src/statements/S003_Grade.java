package statements;

import java.util.Scanner;

public class S003_Grade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks : ");
		int marks = sc.nextInt();
		
		if(marks>90 && marks<=100)
		{
			System.out.println("grade A");
		}
		else if(marks>70 && marks<=90)
		{
			System.out.println("grade B");
		}
		else if(marks>50 && marks<=70)
		{
			System.out.println("grade C");
		}
		else if(marks>35 && marks<=50)
		{
			System.out.println("grade D");
		}
		else if(marks>0 && marks<=35)
		{
			System.out.println("grade f");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}
