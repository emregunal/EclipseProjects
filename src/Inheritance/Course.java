package Inheritance;

public class Course {

	private String courseName, instructor;
	private int price;

	public Course(String courseName, String instructor, int price) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.price = price;

	}

	public void showInfo() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Instructor: " + instructor);
		System.out.println("Price: " + price);

	}

}
