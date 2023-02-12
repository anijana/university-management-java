package com.example.universityeventmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int studentId;
    private String fName;
    private String lName;
    private int age;
    private String department;

}
