package entities;

public class Category {
	
	private int categoryID;
	private String categoryName;
	
	public Category() {
		
	}
	public Category(int id, String name) {
		this.categoryID = id;
		this.categoryName = name;
	}
	
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
