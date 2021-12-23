package com.example.simplerest.controller;


import com.example.simplerest.dto.EnrollmentRequest;
import com.example.simplerest.service.EnrollmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DummyController {

    @Autowired
    private EnrollmentServiceImpl enrollmentService;

    @GetMapping("/ships")
    public String getShips() {
        String jsonData = "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[44.662,37.3093]},\"properties\":{\"name\":\"shipname1\",\"type\":\"passenger\",\"Imo\":\"14537415\",\"receivedate\":\"2020-04-11 08:58:00.0\",\"velocity\":\"0.8\"}},{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[36.782,36.1973]},\"properties\":{\"name\":\"shipname2\",\"type\":\"cargo\",\"Imo\":\"24589785\",\"receivedate\":\"2020-04-10 18:17:00.0\",\"velocity\":\"1.3\"}},{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[40.09,19.1273]},\"properties\":{\"name\":\"shipname3\",\"type\":\"tanker\",\"Imo\":\"41236547\",\"receivedate\":\"2020-03-11 01:11:00.0\",\"velocity\":\"0.3\"}},{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[45.4413,28.1127]},\"properties\":{\"name\":\"shipname4\",\"type\":\"tanker\",\"Imo\":\"12895647\",\"receivedate\":\"2020-01-11 16:28:00.0\",\"velocity\":\"0.7\"}},{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[36.6567,21.8253]},\"properties\":{\"name\":\"shipname5\",\"type\":\"passenger\",\"Imo\":\"76355241\",\"receivedate\":\"2020-02-22 10:13:00.0\",\"velocity\":\"0.9\"}}]}";
        return jsonData;
    }

    @GetMapping("/encyrpt")
    public String showEncyrpt() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        CharSequence sequence = "123";
        String encoded = passwordEncoder.encode(sequence);

        return "Encoded string:" + encoded;
    }

    @GetMapping("/enroll_test")
    public String sampleEnroll() {
        EnrollmentRequest enrollmentRequest=new EnrollmentRequest();
        enrollmentRequest.setStudentid(2);
        enrollmentRequest.setLectureid("2");
        enrollmentRequest.setRoomname("A-101");
        enrollmentService.enrollClass(enrollmentRequest);
        return "success";
    }


}
