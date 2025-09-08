package com.mystudent.controller.enrollments;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
    
@RequestMapping("/enrollments")
@RestController
public class enrollmentController 
{

        /*
     * http://localhost:8082/enrollments/allenrollments
     */
    @GetMapping(path = "/allenrollments")
    public String getAllEnrollments() 
    {
        System.out.println("Hello from enrollment controller!");
        //_StudentService.getAllStudents();
        return "Hello from student controller!";
    }

        /*
     * http://localhost:9002/students/student/<rollnumber>
     */
    @GetMapping(path = "/enrolment/{rollnumber}")
    public String getEnrollmentByStudentRollNumber(@PathVariable("rollnumber") String rollnumber) 
    {
        System.out.println("Hi!! " + "welcome " +  rollnumber + " to the course!");
        //_StudentService.getStudentByName(studentname);
        return "Hi!! " + "welcome " + rollnumber + " to the course!";
    }

}