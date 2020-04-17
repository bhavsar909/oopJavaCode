package com.rajbhavsar.practice.collections.studentmanagementusinghashmap.data;

import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.model.Student;

import java.util.HashMap;

public class StudentData {
//    private List<Student> students= new ArrayList<Student>();

    private HashMap<String, Student> studentHashMap=new HashMap<>();

    public HashMap<String, Student> getStudentHashMap() {
        return studentHashMap;
    }

  /*  public List<Student> getStudents() {
        return students;
    }*/
}
