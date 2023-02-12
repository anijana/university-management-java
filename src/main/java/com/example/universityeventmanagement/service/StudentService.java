package com.example.universityeventmanagement.service;

import com.example.universityeventmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class StudentService {
    private static final List<Student> students = new ArrayList<>();
    private static int id = 0;

    static {
        Student s1 = new Student(++id,"Malay","mondal",26,"Physics");
        Student s2 = new Student(++id,"minoti","das",23,"CSE");
        Student s3 = new Student(++id,"palash","jana",21,"ETCE");
        Student s4 = new Student(++id,"Sudip","halder",25,"IT");
        Student s5 = new Student(++id,"sipon","majumder",26,"CSE");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public Student getStudentById(int id){
        for (Student student: students){
            if(student.getStudentId() == id) return student;
        }
        return null;
    }
    public void deleteStudent(int id){
        Predicate<? super Student> predicate = todo -> todo.getStudentId() == id;
        students.removeIf(predicate);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void updateDepartment(int id, Student newStuDept){
        Student student = getStudentById(id);

        student.setDepartment(newStuDept.getDepartment());
    }

}
