package Business;

import DataAcces.ICategoryDao;
import entities.Category;
import entities.Course;

public class CategoryManager {
private ICategoryDao _categoryDao;
	
	public CategoryManager(ICategoryDao categoryDao) {
		this._categoryDao = categoryDao;
	}
	
	public void add(Category category) {
		if(category.getCategoryName().equals(category)) {
			System.out.println("Zaten bu isimde bir kurs mevcuttur.");
		}
			_categoryDao.Add(category);
	}
	
}
