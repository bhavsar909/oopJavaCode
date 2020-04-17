package com.rajbhavsar.practice.collections.studentmanagement.service.impl;

import com.rajbhavsar.practice.collections.studentmanagement.dao.StudentDao;
import com.rajbhavsar.practice.collections.studentmanagement.dao.impl.StudentDaoImpl;
import com.rajbhavsar.practice.collections.studentmanagement.model.Student;
import com.rajbhavsar.practice.collections.studentmanagement.service.StudentService;

import java.util.Iterator;
import java.util.List;

public class StudentServiceImpl implements StudentService
{

    private StudentDao students=new StudentDaoImpl();

    private List<Student> studentList=students.getAll();

    @Override
    public String insert(Student student) {
        Iterator iterator = studentList.iterator();
        Student studentTemp;
        while (iterator.hasNext()) {
            studentTemp = (Student) iterator.next();
            if (studentTemp.getRollNo().equals(student.getRollNo())) {
                return "Student with this roll number is already exist...";
            }
        }
        return students.insertStudent(student)? student.toString() + "Inserted Successfully..." :student.toString() +
                "Not Inserted..." ;
    }

    @Override
    public String updateStudent(Student newStudent) {

        Iterator iterator = studentList.iterator();
        Student studentTemp;
        while (iterator.hasNext()) {
            studentTemp = (Student) iterator.next();
            if (studentTemp.getRollNo().equals(newStudent.getRollNo())) {
                students.updateStudent(studentTemp,newStudent);
                return newStudent.toString() + "updated successfully";
               }
        }
        return "Record doesn't exist, Not Updated.....";
    }

    @Override
    public String partialUpdate(String rollNumber, String field, String newValue) {

        Iterator iterator = studentList.iterator();
        Student student;
        while (iterator.hasNext()) {
            student = (Student) iterator.next();
            if (student.getRollNo().equals(rollNumber))
                return students.partialUpdateByRollNumber(student,field,newValue)? field+" updated with "+newValue:field +" doesn't exists....";
        }
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
        Iterator iterator = studentList.iterator();
        Student studentTemp;
        while (iterator.hasNext()) {
            studentTemp = (Student) iterator.next();
            if (studentTemp.getRollNo().equals(rollNumber)) {
                return students.deleteStudent(studentTemp)?"Student with roll Number " + rollNumber + " Removed " +
                        "successfully": "Not deleted" ;
            }
        }
        return "Record with "+rollNumber+" doesn't exist";
    }

    @Override
    public void getAll() {
        System.out.println(students.getAll());
    }

    @Override
    public List<Student> search(String field, String value) {
        return students.search(field,value);
    }

}
