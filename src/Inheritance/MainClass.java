package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		Course course1 = new Course("Java Basics", "Ali Teacher", 100);
		VideoCourse videoCourse1 = new VideoCourse("Python Course", "Zeynep Teacher", 150, 180);
		LiveClass liveClass1 = new LiveClass("Web Development", "Mehmet Teacher", 200, true);

		course1.showInfo();
		videoCourse1.showInfo();
		liveClass1.showInfo();

	}

}
