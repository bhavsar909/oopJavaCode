package com.rajbhavsar.practice.collections.studentmanagementusinghashmap.dao.impl;

import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.dao.StudentDao;
import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.data.StudentData;
import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.model.Student;

import java.util.*;

public class StudentDaoImpl implements StudentDao
{
    //private List<Student> studentsDb= new StudentData().getStudents();
    private HashMap<String,Student> studentsDb=new StudentData().getStudentHashMap();
/*
    @Override
    public boolean insertStudent(Student student) {
        return studentsDb.add(student);
    }
*/

    @Override
    public Student insertStudent(String rollNumber,Student student) {
        return studentsDb.put(rollNumber,student);
    }

    @Override
    public Student updateStudent(String rollNumber, Student newStudent) {
//                studentsDb.set(studentsDb.indexOf(studentTemp),newStudent);
                return studentsDb.replace(rollNumber,newStudent);
    }

    @Override
    public boolean partialUpdateByRollNumber(String rollNumber, String field, String newValue) {
        Student student=studentsDb.get(rollNumber);
        switch (field) {
            case "First Name":
                student.setFirstName(newValue);
                studentsDb.replace(rollNumber,student);
                return true;
            case "Last Name":
                student.setLastName(newValue);
                studentsDb.replace(rollNumber,student);
                return true;
            case "Contact Number":
                student.setContactNo(newValue);
                studentsDb.replace(rollNumber,student);
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean partialUpdateByAnyField(String field, String oldValue, String newValue) {
        List<Student> studentsList = (List<Student>) studentsDb.values();
        Iterator iterator = studentsList.iterator();
        Student student;
        while (iterator.hasNext()) {
            student = (Student) iterator.next();
            switch (field) {
                case "firstName":
                    if (student.getFirstName().equals(oldValue))
                        student.setFirstName(newValue);
                    return true;
                case "lastName":
                    if (student.getLastName().equals(oldValue))
                        student.setLastName(newValue);
                    return true;
                case "contactNo":
                    if (student.getContactNo().equals(oldValue))
                        student.setContactNo(newValue);
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    @Override
    public HashMap<String,Student> search(String field, String value) {
        HashMap<String,Student> result=new HashMap<>();
        Set students=studentsDb.entrySet();
        Iterator studentsIterator = students.iterator();
        Student student;
        while (studentsIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) studentsIterator.next();
            switch (field) {
                case "Roll Number":
                    if (entry.getKey().equals(value))
                        result.put((String)entry.getKey(),(Student)entry.getValue());
                    break;
                case "First Name":
                    student=(Student)entry.getValue();
                    if (student.getFirstName().equals(value))
                        result.put((String)entry.getKey(),student);
                    break;
                case "Last Name":
                    student=(Student)entry.getValue();
                    if (student.getLastName().equals(value))
                        result.put((String)entry.getKey(),student);
                    break;
                case "Contact Number":
                    student=(Student)entry.getValue();
                    if (student.getContactNo().equals(value))
                        result.put((String)entry.getKey(),student);
                    break;
                default:
                    break;
            }
        }
        return result;
    }

/*
    @Override
    public boolean deleteStudent(Student student) {
        return studentsDb.remove(student);
    }
*/

/*    @Override
    public List<Student> getAll() {
        return studentsDb;
    }*/

    public Student deleteStudent(String rollNumber) {
        return studentsDb.remove(rollNumber);
    }

    @Override
    public HashMap<String,Student> getAll() {
        return studentsDb;
    }
}
