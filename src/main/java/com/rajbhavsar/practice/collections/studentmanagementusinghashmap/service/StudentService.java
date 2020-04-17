package com.rajbhavsar.practice.collections.studentmanagementusinghashmap.service;

import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.model.Student;

import java.util.HashMap;

public interface StudentService {

    String insert(String rollNumber, Student student);
    String partialUpdate(String rollNumber, String field, String newValue);
    void partialUpdateByField(String field, String oldValue, String newValue);
    String updateStudent(String rollNumber,Student newStudent);
    String delete(String rollNumber);
    void getAll();
    HashMap<String,Student> search(String field, String value);

}
