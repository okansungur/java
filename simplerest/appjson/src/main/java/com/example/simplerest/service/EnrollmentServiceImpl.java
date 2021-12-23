package com.example.simplerest.service;

import com.example.simplerest.dto.EnrollmentRequest;
import com.example.simplerest.entity.Enrollment;
import com.example.simplerest.entity.Lecture;
import com.example.simplerest.entity.Student;
import com.example.simplerest.repo.EnrollmentRepository;
import com.example.simplerest.repo.LectureRepository;
import com.example.simplerest.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    LectureRepository lectureRepository;
    @Autowired
    EnrollmentRepository enrollmentRepository;


    @Override
    public Enrollment enrollClass(EnrollmentRequest request) {
        Student student=studentRepository.findById(request.getStudentid()).get();
        Lecture lecture=lectureRepository.findById(request.getStudentid()).get();
        Enrollment enrollment=new Enrollment();
        enrollment.setStudent(student);
        enrollment.setLecture(lecture);
        enrollment.setRoomname(request.getRoomname());
        enrollmentRepository.save(enrollment);
        return enrollment;
    }
}
