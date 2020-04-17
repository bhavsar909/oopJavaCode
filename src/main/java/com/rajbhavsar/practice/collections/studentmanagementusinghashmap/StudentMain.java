package com.rajbhavsar.practice.collections.studentmanagementusinghashmap;

import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.model.Student;
import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.service.StudentService;
import com.rajbhavsar.practice.collections.studentmanagementusinghashmap.service.impl.StudentServiceImpl;

import java.util.HashMap;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();

        /*Student student1 = new Student("2020CSE001", "John", "Grey", "+1 440-283-5473");
        Student student2 = new Student("2020CSE002", "Tommy", "Grey", "+1 440-283-5573");
        Student student3 = new Student("2020CSE003", "Clara", "Grey", "+1 440-243-5373");
        Student student4 = new Student("2020CSE004", "Dohnzo", "Grey", "+1 440-253-5473");
        Student student5 = new Student("2020CSE005", "Fliuza", "Shelton", "+1 420-283-5473");
        studentService.insert(student1);
        studentService.insert(student2);
        studentService.insert(student3);
        studentService.insert(student4);
        studentService.insert(student5);*/

        int option;

        while (true) {
            System.out.println("1. Fetch All the student Records");
            System.out.println("2. Insert ");
            System.out.println("3. Update ");
            System.out.println("4. Delete ");
            System.out.println("5. Field Specific Update(Field Names should be as following: \n \t First Name (or) \n" +
                    " \t " +
                    "Last Name  (or) \n " +
                    "\t Contact Number)");
            System.out.println("6. Search based on field(Field Names should be as following: \n \t Roll Number (or) " +
                    "\n \t First Name (or) \n \t Last Name  (or) \n \t Contact Number)");
            System.out.println("0. Exit");
            System.out.println("Select the Option:");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    System.out.println("Exiting................");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("\n");
                    studentService.getAll();
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Insert the Roll Number and press enter:");
                    String rollNumber = scanner.nextLine();
                    System.out.println("Insert the First Name and press enter:");
                    String firstName = scanner.nextLine();
                    System.out.println("Insert the Last Name and press enter:");
                    String lastName = scanner.nextLine();
                    System.out.println("Insert the Contact Number and press enter:");
                    String contactNumber = scanner.nextLine();
                    System.out.println(studentService.insert(rollNumber,new Student(firstName, lastName,
                            contactNumber)));
                    break;
                case 3:
                    System.out.println("Insert the Roll Number for which you want to update the data and press enter:");
                    String rollNumberUpdate = scanner.nextLine();
                    System.out.println("Insert the new First Name and press enter:");
                    String firstNameUpdated = scanner.nextLine();
                    System.out.println("Insert the new Last Name and press enter:");
                    String lastNameUpdated = scanner.nextLine();
                    System.out.println("Insert the new Contact Number and press enter:");
                    String contactNumberUpdated = scanner.nextLine();
                    System.out.println(studentService.updateStudent(rollNumberUpdate,new Student(
                            firstNameUpdated,
                            lastNameUpdated,
                            contactNumberUpdated)));
                    break;
                case 4:
                    System.out.println("Insert the Roll Number for which you want to delete the data and press enter:");
                    String rollNumberDelete = scanner.nextLine();
                    System.out.println(studentService.delete(rollNumberDelete));
                    break;
                case 5:
                    System.out.println("Insert the Roll Number for which you want to update the data and press enter:");
                    String rollNumberUP = scanner.nextLine();

                    System.out.println("Insert the Field Name for which you want to update the data and press enter:");
                    String fieldNameUP = scanner.nextLine();

                    System.out.println("Insert the New Value and press enter:");
                    String newValueUP = scanner.nextLine();

                    System.out.println(studentService.partialUpdate(rollNumberUP, fieldNameUP, newValueUP));
                    break;
                case 6:
                    System.out.println("Insert the Field Name for which you want to Search the data and press enter:");
                    String fieldNameSearch = scanner.nextLine();
                    System.out.println("Insert the Search Value and press enter:");
                    String valueSearch = scanner.nextLine();
                    HashMap<String,Student> searchedStudents = studentService.search(fieldNameSearch, valueSearch);
                    System.out.println(searchedStudents.toString());
                    break;
                default:
                    System.out.println("please choose from above options only");
                    break;
            }
        }
    }
}
