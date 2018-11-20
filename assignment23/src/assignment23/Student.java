package assignment23;

public class Student implements Cloneable
{
	private String name;
	private GradeList grades;
	
	public Student(String theName)
	{
		this.name = theName;
		this.grades = new GradeList();
	}
	
	public void addGrade(double newGrade)
	{
		this.grades.addGrade(newGrade);
	}
	
	public void updateGrade(int index, double newGrade)
	{
		this.grades.updateGrade(index, newGrade);
	}
	
	public String toString()
	{
		return this.name + ": " + this.grades;
	}
	
	public Object clone()
	{
		String newName = this.name + "[clone]";
		Student newStudent = new Student(newName);
		newStudent.grades = (GradeList) this.grades.clone();
		return newStudent;
	}
}
