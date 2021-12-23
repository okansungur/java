package com.example.simplerest.entity;


import javax.persistence.*;

@Entity
@Table(name = "lectures", schema = "myproject")
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lectureid;
    private String lecturename;

    public int getLectureid() {
        return lectureid;
    }

    public void setLectureid(int lectureid) {
        this.lectureid = lectureid;
    }

    public String getLecturename() {
        return lecturename;
    }

    public void setLecturename(String lecturename) {
        this.lecturename = lecturename;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureid=" + lectureid +
                ", lecturename='" + lecturename + '\'' +
                '}';
    }
}
