package Business;

import DataAcces.IInstructorDao;
import entities.Instructor;

public class InstructorManager {

	private IInstructorDao _instructor;
	
	public InstructorManager(IInstructorDao ins) {
		this._instructor = ins;
	}
	
	public void add(Instructor inst) {
		_instructor.Add(inst);
	}
	
}
