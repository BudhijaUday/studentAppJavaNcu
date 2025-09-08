package com.mystudent.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
    
@RequestMapping("/courses")
@RestController
public class courseController 
{

        /*
     * http://localhost:9002/students/allstudents
     */
    @GetMapping(path = "/allcourses")
    public String getAllStudents() 
    {
        System.out.println("Hello from student controller!");
        //_StudentService.getAllStudents();
        return "Hello from student controller!";
    }

        /*
     * http://localhost:9002/students/student/Naveen
     */
    @GetMapping(path = "/courses/{courseid}")
    public String getStudentByName(@PathVariable("courseid") String courseid) 
    {
        System.out.println("Hi!! " + "welcome " + courseid + " to the course!");
        //_StudentService.getStudentByName(studentname);
        return "Hi!! " + "welcome " + courseid + " to the course!";
    }

        /*
     * http://localhost:9002/students/student?studentname=NaveenS&stydentroll=r101
     */
    @GetMapping(path = "/course")
    public String getStudentByNameFromRequest(@RequestParam("courseid") String courseid,
    @RequestParam("studentroll") String sroll)
    {
        System.out.println("Hi!! Welcome to course" + courseid);
        //_StudentService.getStudentByNameFromRequest(studentname);
        return "Hi!! Welcome to course" + courseid;
    }


}