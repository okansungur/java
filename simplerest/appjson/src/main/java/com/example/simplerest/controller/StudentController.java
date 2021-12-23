package com.example.simplerest.controller;


import com.example.simplerest.entity.Student;
import com.example.simplerest.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;


    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        List<Student> students = null;
        students = studentService.getStudentList();
        return students;

    }





    //@RequestMapping(value = "deleteStudent/{studentId}", method = RequestMethod.GET)
    @GetMapping(path = "/deleteStudent/{studentId}") // Compliant
    public ModelAndView deleteStudent(
            @PathVariable String studentId) {
        int id = Integer.parseInt(studentId);
        Optional<Student> studentResponse = studentService.getStudentByID(id);
        if(studentResponse.isPresent()) {
            studentService.deleteStudent(studentResponse.get());
        }
        return studentmodelAndView();
    }


    @RequestMapping(value = "/addnewStudent", method = RequestMethod.POST)
    public ModelAndView addStudent(
            @RequestParam("studentName") String studentName,
            @RequestParam("studentAddress") String studentAddress,
            @RequestParam("age") String age
    ) {

        Student student = new Student();
        int randomValue = (int) Math.floor(Math.random() * 10000);

        student.setStudentName(studentName);
        student.setStudentAddress(studentAddress + " - " + randomValue);
        student.setAge(Integer.parseInt(age));
        studentService.addUpdateStudent(student);

        return studentmodelAndView();
    }

    private ModelAndView studentmodelAndView(){
        ModelAndView modelAndView = new ModelAndView("student");
        List<Student> students = null;
        students = studentService.getStudentList();
        modelAndView.addObject("studentlist", students);
        return modelAndView;

    }



    @GetMapping("/showStudent")
    public ModelAndView redirection(
            ModelMap model,
            @ModelAttribute("testAttribute") Object flashAttribute) {

        model.addAttribute("testAttribute", flashAttribute);
        return new ModelAndView("/newstudent", model);
    }

    @GetMapping("/student")
    public ModelAndView showStudentsPage() {

        return studentmodelAndView();
    }

    @GetMapping("/student/{id}")
    public Student showStudentById(@PathVariable("id") int id) {

        return studentService.getStudentByID(id).orElse(null);

    }


}
