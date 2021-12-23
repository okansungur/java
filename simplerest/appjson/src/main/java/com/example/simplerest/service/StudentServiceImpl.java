package com.example.simplerest.service;

import com.example.simplerest.entity.Student;
import com.example.simplerest.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getOrderedStudentList(int limit) {

        return entityManager.createQuery("SELECT p FROM  Student p ORDER BY p.studentId",
                Student.class).setMaxResults(limit).getResultList();

    }


    @Override
    public String addUpdateStudent(Student student) {
        Student stu = studentRepository.save(student);

        return "Saved: " + stu.getStudentId();
    }


    @Override
    public String deleteStudent(Student student) {
        studentRepository.delete(student);
        return "Deleted ";
    }


    public Optional<Student> getStudentByID(int studentid) {

        return studentRepository.findById(studentid);

    }


}
