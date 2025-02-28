package Inheritance;

public class LiveClass extends Course {

	private boolean liveClass;

	public LiveClass(String courseName, String instructor, int price, boolean liveClass) {
		super(courseName, instructor, price);
		this.liveClass = liveClass;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Live Class: " + (liveClass ? "Yes" : "No"));
	}

}
