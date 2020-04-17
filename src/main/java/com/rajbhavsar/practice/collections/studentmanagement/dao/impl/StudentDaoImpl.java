package com.rajbhavsar.practice.collections.studentmanagement.dao.impl;

import com.rajbhavsar.practice.collections.studentmanagement.dao.StudentDao;
import com.rajbhavsar.practice.collections.studentmanagement.data.StudentData;
import com.rajbhavsar.practice.collections.studentmanagement.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDaoImpl implements StudentDao
{
    private List<Student> studentsDb= new StudentData().getStudents();

    @Override
    public boolean insertStudent(Student student) {
        return studentsDb.add(student);
    }

    @Override
    public boolean updateStudent(Student oldStudent,Student newStudent) {
//                studentsDb.set(studentsDb.indexOf(studentTemp),newStudent);
                oldStudent.setFirstName(newStudent.getFirstName());
                oldStudent.setLastName(newStudent.getLastName());
                oldStudent.setContactNo(newStudent.getContactNo());
                return true;
    }

    @Override
    public boolean partialUpdateByRollNumber(Student student, String field, String newValue) {
        switch (field) {
            case "First Name":
                student.setFirstName(newValue);
                return true;
            case "Last Name":
                student.setLastName(newValue);
                return true;
            case "Contact Number":
                student.setContactNo(newValue);
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean partialUpdateByAnyField(String field, String oldValue, String newValue) {
        Iterator iterator = studentsDb.iterator();
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
    public List<Student> search(String field, String value) {
        List<Student> result = new ArrayList<Student>();
        Iterator iterator = studentsDb.iterator();
        Student student;
        while (iterator.hasNext()) {
            student = (Student) iterator.next();
            switch (field) {
                case "Roll Number":
                    if (student.getRollNo().equals(value))
                        result.add(student);
                    break;
                case "First Name":
                    if (student.getFirstName().equals(value))
                        result.add(student);
                    break;
                case "Last Name":
                    if (student.getLastName().equals(value))
                        result.add(student);
                    break;
                case "Contact Number":
                    if (student.getContactNo().equals(value))
                        result.add(student);
                    break;
                default:
                    result.add(null);
                    break;
            }
        }
        return result;
    }

    @Override
    public boolean deleteStudent(Student student) {
        return studentsDb.remove(student);
    }

    @Override
    public List<Student> getAll() {
        return studentsDb;
    }
}
