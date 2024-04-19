package fileio;


import java.io.File;
import java.io.IOException;

public class F001_file {
	public static void main(String[] args) {
		
			
		File file = new File("C:\\Chintan_work\\Files\\test.txt");
		
		
		//System.out.println(file.exists());
		
//		try {
//			file.createNewFile();
//			System.out.println("File created...");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		file.delete();
//		System.out.println("File deleted...");
		
//		file.mkdir();
//		System.out.println("folder created...");
		
		
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		
	}
}
