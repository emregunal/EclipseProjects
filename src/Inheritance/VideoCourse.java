package Inheritance;

public class VideoCourse extends Course {

	private int videoDuration;

	public VideoCourse(String courseName, String instructor, int price, int videoDuration) {
		super(courseName, instructor, price);
		this.videoDuration = videoDuration;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Video Duration: " + videoDuration);
	}

}
