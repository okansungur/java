package com.example.simplerest.entity;


import javax.persistence.*;

@Entity
@Table(name = "enrollment", schema = "myproject")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int enroll_id;
    @ManyToOne
    @JoinColumn(name = "studentid", nullable = false)
    private Student student;
    @ManyToOne
    @JoinColumn(name = "lectureid", nullable = false)
    private Lecture lecture;

    private String roomname;

    public int getEnroll_id() {
        return enroll_id;
    }

    public void setEnroll_id(int enroll_id) {
        this.enroll_id = enroll_id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enroll_id=" + enroll_id +
                ", student=" + student +
                ", lecture=" + lecture +
                ", roomname='" + roomname + '\'' +
                '}';
    }
}
