package oops;


class Student
{
	int id;
	String name;
	
	Student()
	{
		System.out.println("Student const calling");
	}
//	
//	Student(int a)
//	{
//		System.out.println("id : "+a);
//	}
//	
//	Student(String name)
//	{
//		System.out.println("name is : "+name);
//	}
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public void show()
	{
		System.out.println(id+" "+name);
	}

	
}

public class O002_constructorDemo {
	public static void main(String[] args) {
		
		Student st = new Student();
		st.show();
		
		Student st1 = new Student(20,"Test");
		st1.show();
		
		Student st2 = new Student(30,"tech");
		st2.show();
		
		
	}
}
