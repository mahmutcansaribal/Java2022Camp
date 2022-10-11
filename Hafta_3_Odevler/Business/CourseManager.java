package Business;

import DataAcces.ICourseDao;
import core.logging.Logger;
import entities.Course;

public class CourseManager {

	private ICourseDao _courseDao;
	private Logger[] loggers;
	
	public CourseManager(ICourseDao coursedao,Logger[] loggers) {
		this._courseDao = coursedao;
		this.loggers = loggers;
	}
	
	public void add(Course course) {
		if(course.getCourseName().equals(course)) {
			System.out.println("Zaten bu isimde bir kurs mevcuttur.");
		}if(course.getPrice()<0) {
			System.out.println("Kursun fiyati 0'dan kucuk olamaz!");
		}
		_courseDao.Add(course);
	}
	
	
}
