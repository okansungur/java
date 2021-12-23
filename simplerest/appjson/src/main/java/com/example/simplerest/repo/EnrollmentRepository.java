package com.example.simplerest.repo;

import com.example.simplerest.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

}