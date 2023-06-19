package com.example.Student_managment_portal;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer , Student> studentDb = new HashMap<>();
    @GetMapping("/get_info")
    public Student getStudent(@RequestParam("admn") int admnNo){
        return studentDb.get(admnNo);
    }
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentDb.put(student.getAdmnNo() , student);
        return "Student added successfully" ;
    }
//    using path variable for we can get direct end point
    @GetMapping("/get/{id}/{message}")
    public Student getStudentByPath(@PathVariable("id") int admnNo ){

        return studentDb.get(admnNo);
    }
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("delete") int admnNo ){
        studentDb.remove(admnNo);
        return "studentDeleted";
    }
}
