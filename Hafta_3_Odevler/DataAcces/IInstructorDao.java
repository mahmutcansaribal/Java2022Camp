package DataAcces;

import entities.Instructor;

public interface IInstructorDao {

	void Add(Instructor p);
	void Delete(Instructor p);
	void update(Instructor p);
}
