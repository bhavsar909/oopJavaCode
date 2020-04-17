package com.rajbhavsar.practice.collections.studentmanagement.service;

import com.rajbhavsar.practice.collections.studentmanagement.model.Student;

import java.util.List;

public interface StudentService {

    String insert(Student student);
    String partialUpdate(String rollNumber,String field, String newValue);
    void partialUpdateByField(String field, String oldValue, String newValue);
    String updateStudent(Student newStudent);
    String delete(String rollNumber);
    void getAll();
    List<Student> search(String field, String value);

}
