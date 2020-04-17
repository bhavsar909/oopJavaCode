package com.rajbhavsar.practice.oom1.example1;

public class TeachingMain {
    public static void main(String[] args) {
        Teacher teacher =new Teacher();
        teacher.setName("Kapil");

        Student student=new Student();
        student.setName("Sunil");

        Subject subject=new Subject();
        subject.setName("Java");

        teacher.teach(subject, student);
        //student.study(subject);
    }
}
