package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class F002_fileReader {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter file namne : ");
		String filename = sc.next();
		
		try {
			FileReader rd = new FileReader("C:\\Chintan_work\\Files\\"+filename+".txt");
			
			int i =  rd.read();
			
			while(i !=-1)
			{
				char c = (char) i;
				System.out.print(c);
				i = rd.read();
			}
		
		
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
