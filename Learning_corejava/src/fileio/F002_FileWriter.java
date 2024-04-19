package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class F002_FileWriter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("Enter email : ");
		String email =sc.next();
		
		
		
		try 
		{
			FileWriter fw = new FileWriter("C:\\Chintan_work\\Files\\"+name+".txt");
			//String str = "This is my first io program";
			fw.write(email);
			fw.flush();
			System.out.println("done...");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
