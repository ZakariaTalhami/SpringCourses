package com.database.work.Course_db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.database.work.Course_db.model.Course;
import com.database.work.Course_db.services.CourseService;


@RestController
public class CourseController {
 
//	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/course")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
//		List<Course> c = new ArrayList<Course>(Arrays.asList(
//				new Course(5, "han", 1, 1),
//				new Course(6, "han", 2, 2),
//				new Course(7, "han", 3, 3)
//				));
//		return c;
	}
	
	@RequestMapping(value="/course/{id}")
	public Course getCourse(@PathVariable int id ) {
		Course course =  courseService.getCourse(id);
		return course;
//		return new Course(id, "getCourse", 2, 2);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/course")
	public Course addCourse(@RequestBody Course c) {
		return courseService.addCourse(c);
//		return c;
	}
}
