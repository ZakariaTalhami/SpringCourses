package com.database.work.Course_db.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.work.Course_db.model.Course;
import com.database.work.Course_db.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Course addCourse(Course c) {
		//perform some checking here
		return courseRepository.save(c);
	}
	
	public List<Course> getAllCourses(){
		List<Course> c = new ArrayList<Course>();
		courseRepository.findAll().forEach(c::add);
		return c;
	}
	
	public Course getCourse(int id) {
		return courseRepository.findOne((long)id);//?
	}
	
}
