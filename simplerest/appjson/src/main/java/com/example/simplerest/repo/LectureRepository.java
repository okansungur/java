package com.example.simplerest.repo;

import com.example.simplerest.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LectureRepository extends JpaRepository<Lecture, Integer> {

}