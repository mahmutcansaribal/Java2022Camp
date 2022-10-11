package entities;

public class Instructor {

	private int instructorID;
	private String instructorName;
	private String instructorLastName;
	
	public Instructor() {
		
	}
	public Instructor(int id, String name, String lastName) {
		this.instructorID = id;
		this.instructorName = name;
		this.instructorLastName = lastName;
	}
	
	public int getInstructorID() {
		return instructorID;
	}
	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getInstructorLastName() {
		return instructorLastName;
	}
	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}
	
	
}
