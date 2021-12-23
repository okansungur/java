
DROP SCHEMA IF EXISTS myproject cascade;
create schema myproject;

CREATE SEQUENCE  myproject.prj_user_sequence INCREMENT 1 START 1;
CREATE SEQUENCE   myproject.prj_role_sequence INCREMENT 1 START 1;

CREATE SEQUENCE myproject.prj_student_sequence  INCREMENT 1 START 1;

CREATE SEQUENCE myproject.prj_lecture_sequence  INCREMENT 1 START 1;
CREATE SEQUENCE myproject.prj_enroll_sequence  INCREMENT 1 START 1;



CREATE TABLE    myproject.prj_user (
user_id INTEGER DEFAULT nextval('myproject.prj_user_sequence'::regclass) NOT NULL,
firstName VARCHAR(100),
lastName VARCHAR(100),
email VARCHAR(100),
password VARCHAR(100),
CONSTRAINT user_pkey PRIMARY KEY(user_id)
) 
WITH (oids = false);



CREATE TABLE myproject.students
(
    studentid integer NOT NULL DEFAULT nextval('myproject.prj_student_sequence'::regclass),
    studentname character varying(100) COLLATE pg_catalog."default",
    studentaddress character varying(100) COLLATE pg_catalog."default",
    age integer,
        CONSTRAINT student_pkey PRIMARY KEY (studentid)
)
    WITH (oids = false);




CREATE TABLE  myproject.prj_role (
 role_id INTEGER DEFAULT nextval('myproject.prj_role_sequence'::regclass) NOT NULL,
name VARCHAR(100),
user_id  int,

CONSTRAINT role_pkey PRIMARY KEY(role_id)
)
WITH (oids = false);


CREATE TABLE myproject.lectures
(
    lectureid integer NOT NULL DEFAULT nextval('myproject.prj_lecture_sequence'::regclass),
    lecturename character varying(100) COLLATE pg_catalog."default",

    CONSTRAINT lecture_pkey PRIMARY KEY (lectureid)
)WITH (oids = false);


CREATE TABLE myproject.enrollment
(
    enroll_id integer NOT NULL DEFAULT nextval('myproject.prj_enroll_sequence'::regclass),
    studentid integer NOT NULL,
    lectureid integer NOT NULL,
    roomname character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT enroll_pkey PRIMARY KEY (enroll_id)
)WITH (oids = false);



insert into myproject.prj_user(firstName,lastName,email,password) values('john','te','john@sss.com','$2a$12$GZ6Hmp2z7erKUHbgr3fUh.5Urv5lL6yDsZUJMabTk4qdmG92wcRNa'); -- 123
insert into myproject.prj_user(firstName,lastName,email,password) values('kate','te','kate@sss.com','$2a$12$XVAnsBMVkUjDdSZVvH.B0.DgyOUgbHizobwnkOMWWP4bdyEMwx8N6'); --456
insert into myproject.prj_role(name,user_id) values('ROLE_ADMIN',1);
insert into myproject.prj_role(name,user_id) values('ROLE_USER',2);


INSERT INTO myproject.students(	 studentname, studentaddress, age)	VALUES ( 'John', 'Dover', 22);
INSERT INTO myproject.students(	 studentname, studentaddress, age)	VALUES ( 'Kate', 'Coventry', 28);
INSERT INTO myproject.students(	 studentname, studentaddress, age)	VALUES ( 'Andy', 'Lancaster', 27);
INSERT INTO myproject.students(	 studentname, studentaddress, age)	VALUES ( 'Sue', 'Liverpool', 32);
INSERT INTO myproject.students(	 studentname, studentaddress, age)	VALUES ( 'Nancy', 'Birmingham', 36);
INSERT INTO myproject.students(	 studentname, studentaddress, age)	VALUES ( 'Lisa', 'Nottingham', 42);



INSERT INTO myproject.lectures(	 lecturename)	VALUES ( 'Math');
INSERT INTO myproject.lectures(	 lecturename)	VALUES ( 'Algebra');
INSERT INTO myproject.lectures(	 lecturename)	VALUES ( 'Chemistry');
INSERT INTO myproject.lectures(	 lecturename)	VALUES ( 'Literature');


INSERT INTO myproject.enrollment(studentid, lectureid, roomname)VALUES ( 1, 1, 'F101');