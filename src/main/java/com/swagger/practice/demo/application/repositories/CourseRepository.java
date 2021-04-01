package com.swagger.practice.demo.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swagger.practice.demo.application.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
