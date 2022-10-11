package entities;

public class Course {

	private int id;
	private String courseName;
	private String courseDescription;
	private int price;
	
	public Course() {
		
	}
	
	public Course(int id, String name, String desc, int price) {
		this.id = id;
		this.courseName = name;
		this.courseDescription = desc;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
}
