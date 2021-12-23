package com.example.simplerest.service;


import com.example.simplerest.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudentList();

    public List<Student> getOrderedStudentList(int limit);

    public String addUpdateStudent(Student student);

    public String deleteStudent(Student student);


}