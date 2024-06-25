package com;

public class Data {
	public static void main(String[] args) {
		
		
		
		ExcellReader rd = new ExcellReader("C:\\Users\\tops technologies\\Desktop\\Test.xlsx","reg");
		int rows =  rd.rowCount();
		System.out.println("Rows : "+rows);
		
		int cols = rd.colCount();
		System.out.println("cols : "+cols);
		
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				String data = rd.getData(i, j);
				System.out.println(data);
			}
		}
		
		
		
	}
}
