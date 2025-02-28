package Inheritance;

public class LiveClass extends Course {
	
	private String courseName, instructor;
	private int price;
	private boolean liveClass;

	public LiveClass(String courseName, String instructor, int price,boolean liveClass) {
		super(courseName,instructor,price);
		this.liveClass=liveClass;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Live Class: " + (liveClass ? "Yes" : "No"));
	}

}
