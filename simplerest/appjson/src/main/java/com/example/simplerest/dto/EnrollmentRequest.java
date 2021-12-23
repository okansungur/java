package com.example.simplerest.dto;

public class EnrollmentRequest {

	private int studentid;
	private String lectureid;
	private String roomname;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getLectureid() {
		return lectureid;
	}

	public void setLectureid(String lectureid) {
		this.lectureid = lectureid;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}


}
