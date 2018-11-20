package assignment23;

public class Main 
{

	public static void main(String[] args) 
	{
		Student A = new Student("Collin McMillan");
		A.addGrade(0.0);
		A.addGrade(1.2);
		A.addGrade(3.1);
		System.out.println(A);
		
		Student B = (Student) A.clone();
		System.out.println(B);
		B.updateGrade(0, 1.3);
		System.out.println("Updated B's first grade...");
		System.out.println(A);
		System.out.println(B);
		
	}

}
