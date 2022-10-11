package KodlamaIo;

import Business.CourseManager;
import DataAcces.HibernateCourseDao;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MSSql;
import entities.Course;

public class Main {

	public static void main(String[] args) {
		Course course = new Course(1,"Yazılım","Yazılım2",15);
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MSSql() };
		
		CourseManager cm = new CourseManager(new HibernateCourseDao(), loggers);
		
		cm.add(course);
		

	}

}
