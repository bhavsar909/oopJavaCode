package com.rajbhavsar.practice.collections.studentmanagement.dao;


import com.rajbhavsar.practice.collections.studentmanagement.model.Student;

import java.util.List;

public interface StudentDao {
    boolean insertStudent(Student student);
    boolean updateStudent(Student oldStudent,Student newStudent);
    boolean partialUpdateByRollNumber(Student student, String field, String newValue);
    boolean partialUpdateByAnyField(String field, String oldValue, String newValue);
    boolean deleteStudent(Student student);
    List<Student> getAll();
    List<Student> search(String field, String value);
}
