package com.rajbhavsar.practice.collections.studentmanagementusinghashmap.service.impl;

import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.dao.StudentDao;
import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.dao.impl.StudentDaoImpl;
import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.model.Student;
import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.service.StudentService;

import java.util.HashMap;

public class StudentServiceImpl implements StudentService
{

    private StudentDao students=new StudentDaoImpl();

    private HashMap<String, Student> studentList=students.getAll();

    @Override
    public String insert(String rollNumber,Student student) {
        return students.insertStudent(rollNumber,student)==null? student.toString() + "Not Inserted...Roll Number " +
                "already exist":student.toString() + "Inserted Successfully..."  ;
    }

    @Override
    public String updateStudent(String rollNumber,Student newStudent) {
        if (studentList.containsKey(rollNumber)){
            return students.updateStudent(rollNumber,newStudent).toString() + "updated successfully";
        }
        else
            return "Record doesn't exist, Not Updated.....";
    }

    @Override
    public String partialUpdate(String rollNumber, String field, String newValue) {
        if (studentList.containsKey(rollNumber)){
            return students.partialUpdateByRollNumber(rollNumber,field,newValue)? field+" updated with "+newValue:field +" " +
                    "doesn't exists....";
        }
        else
            return rollNumber +" doesn't exists....";
    }

    @Override
    public void partialUpdateByField(String field, String oldValue, String newValue) {
        if (students.partialUpdateByAnyField(field,oldValue,newValue))
            System.out.println(field+"'s "+oldValue+" is replaced with"+newValue);
        else
            System.out.println("Record doesn't exist, Not Updated.....");
    }

    @Override
    public String delete(String rollNumber) {
        if (studentList.containsKey(rollNumber))
            return students.deleteStudent(rollNumber)==null?"Not deleted":"Student with roll Number " + rollNumber + " Removed " +
                    "successfully" ;
        else
            return "Record with "+rollNumber+" doesn't exist";
    }

    @Override
    public void getAll() {
        System.out.println(students.getAll());
    }

    @Override
    public HashMap search(String field, String value) {
        return students.search(field,value);
    }

}
