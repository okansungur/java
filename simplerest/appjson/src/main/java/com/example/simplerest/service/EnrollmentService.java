package com.example.simplerest.service;


import com.example.simplerest.dto.EnrollmentRequest;
import com.example.simplerest.entity.Enrollment;

public interface EnrollmentService {

    public Enrollment enrollClass (EnrollmentRequest request);

}