- student crud.
- partial update.
- search based on any fields.
- follow the best practices package structures.

Create an application that allows the user to manage Students, an application must provide the following functionalities

Users must allow managing Students via the application. To manage the Student user must choose one option from the available one, An application must manage the Student accordingly.

Note: for all the below requirements take the inputs from the user via the console 
            
Requirements
  
1. Insert Student: allow a user to add new Student

2. Update Student: allow a user to update the existing Student (the partial update is not allowed)

   ex. consider Student is following details

     Student: {

       rollNo: 1,
       firstName: Devang,
       lastName : Chauhan
       contactNo : 1234567890

     }

  now user update the above student with following inputs

      rollNo: 1
      firstName: Drisana
      lastName: "" 
      contactNo: ""

  Then updated Student must be as expected one

  Expected output

   Student: {

       RollNo: 1,
       First Name: Drisana
       Last Name : 
       ContactNo : 
   }          

(3). partial update: allow the user to change any field of existing Student

   ex. consider existing Student with the following details

     Student: {
         rollNo: 1
         firstName: Devang
         lastName: Chauhan
         contactNo: 1234567890
     }
  Now user update the above Student with following inputs

    roll No :1 
    fieldName : FirstName
    value : Drisana

Then updated Student must be as expected one

Expected output

   Student: {

       rollNo: 1,
       first Name: Drisana,
       last Name: Chauhan
       contactNo: 1234567890
   }

(4). Delete Student: allow the user to delete Student based on rollno

(5). Search Student: allow the user to search Student based on field value

   Note possible search fields are : rollNo, firstName, lastName, contactNo

   ex. consider you have two Students available with following details

      Students: {

           rollNo: 1,
           firstName: Devang,
           lastName : Chauhan
           contactNo : 1234567890
      }, 
      {
           rollNo: 2,
           firstName: Jay,
           lastName : Parikh
           contactN) : 2312345678
      }

now user search the Student with firstName: Jay then the user will be able to see all the Students with firstName = Jay
  
 expected output

   Student: {
         
         rollNo: 2,
         firstName: Jay,
         lastName : Parikh
         contactNo : 2312345678
    }

(6). view Students: show all existing Student to user    

(7). rollNo must be unique for each Student. meaning two Students with same rollNo do not allow 

(8). exit: if the user chose this option terminate the application 

  Note  your application do not terminate until user choose this option