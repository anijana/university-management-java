package com.example.universityeventmanagement.controller;

import com.example.universityeventmanagement.model.Student;
import com.example.universityeventmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("add-student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @GetMapping("get-all-students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("get-student/id/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @PutMapping("update-student-department/id/{id}")
    public void updateDepartment(@PathVariable int id, @RequestBody Student student){
        studentService.updateDepartment(id,student);
    }
    @DeleteMapping("delete-student/id/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
