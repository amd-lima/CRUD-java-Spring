package com.amanda.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.amanda.model.Course;


public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
