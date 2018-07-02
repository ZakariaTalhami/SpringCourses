package com.database.work.Course_db.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.database.work.Course_db.model.Course;

//@Repository
public interface CourseRepository extends CrudRepository<Course, Long>{

//	public Course addCourse(Course c);
//	public List<Course> getAllCourses();
//	public Course getCourse(int id);
}
