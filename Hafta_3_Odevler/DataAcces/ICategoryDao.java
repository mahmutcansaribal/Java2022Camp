package DataAcces;

import entities.Category;


public interface ICategoryDao {
	void Add(Category p);
	void Delete(Category p);
	void update(Category p);
}
