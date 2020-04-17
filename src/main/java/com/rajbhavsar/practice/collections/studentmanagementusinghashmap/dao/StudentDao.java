package com.rajbhavsar.practice.collections.studentmanagementusinghashmap.dao;


import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.model.Student;

import java.util.HashMap;

public interface StudentDao {
    Student insertStudent(String rollNumber,Student student);
    Student updateStudent(String rollNumber,Student newStudent);
    boolean partialUpdateByRollNumber(String rollNumber, String field, String newValue);
    boolean partialUpdateByAnyField(String field, String oldValue, String newValue);
    Student deleteStudent(String rollNumber);
    HashMap getAll();
    HashMap search(String field, String value);
}
