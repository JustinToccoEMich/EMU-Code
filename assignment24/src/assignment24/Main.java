package assignment24;

public class Main 
{

	public static void main(String[] args) 
	{
		CourseList courseList = new CourseList();
		courseList.addFirst("COSC 111");
		System.out.println(courseList.first());
		System.out.println(courseList.size());
		courseList.addLast("COSC 112");
		System.out.println(courseList.first());
		System.out.println(courseList.size());
		courseList.addFirst("COSC 211");
		System.out.println(courseList.first());
		System.out.println(courseList.size());
		courseList.addLast("COSC 212");
		System.out.println(courseList.first());
		System.out.println(courseList.size());
		courseList.addFirst("COSC 471");
		System.out.println(courseList.first());
		System.out.println(courseList.size());
		courseList.addLast("COSC 481W");
		System.out.println(courseList.first());
		System.out.println(courseList.size());
		// System.out.println(courseList);
		courseList.removeFirst();
		System.out.println(courseList.first());
		System.out.println(courseList.size());
		courseList.removeLast();
		System.out.println(courseList.first());
		System.out.println(courseList.size());
//		System.out.println(courseList);
	}

}
