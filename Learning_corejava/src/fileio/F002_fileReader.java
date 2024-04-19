package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F002_fileReader {
	public static void main(String[] args) {
		
		
		
		try {
			FileReader rd = new FileReader("C:\\Chintan_work\\Files\\test.txt");
			
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
