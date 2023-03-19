package com.amanda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amanda.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
