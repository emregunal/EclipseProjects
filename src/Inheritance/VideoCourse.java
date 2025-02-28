package Inheritance;

public class VideoCourse extends Course {
	
	private String courseName, instructor;
	private int price,videoDuration;

	public VideoCourse(String courseName, String instructor, int price,int videoDuration) {
		super(courseName,instructor,price);
		this.videoDuration=videoDuration;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Video Duration: " + videoDuration);
	}

}
