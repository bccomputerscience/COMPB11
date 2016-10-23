## COMP B11 Fall 2016 Project

### Academic Standards
This is not a group project. Do not accept code from other students or tutors.
Do not have the code of other students in your own directories or repositories.

### Requirements
I will accept one comopressed folder with your Course Project source code. I suggest you first create 
a folder called project. Your project should be structured in the following format

/src  
/src/Person.java  
/src/Instructor.java  
/src/Student.java  
/src/Course.java  
/src/CourseAware.java  
/src/CourseAwareMain.java  
/src/CourseAwareTester.java  

Do not send me your binaries  
No /bin directories please.  

### Project Milestones
Phase I: 60%  
Phase II: 70%  
Phase III 80%  
Phase IV 90%  
Phase V 100%  

### Project Disclaimers
This is not a trivial project. Start at the 60% mark and work your way up. The features for all preceeding phases
must still work as you complete subsequent phases.

### Due Date
Last day of the semester 12/8 by 8am

### Grading
Your grade for the project will be based on the highest phase that you complete according to 
the specifications. Keep your previous code in case you run into trouble. Feel free to complete 
your project in advance. You may e-mail the instructor for comments.

The project due date is firm. Late projects cannot and will not be accepted for any reason. Don't ask.

After testing your code I will also check your source for readability. Points marked off if your source is not well-documented and clean. Clean means that an algorithm that could be written in 10 lines of code should not be written in 50. Extraneous code is harder to debug. Code should have a consistent and pleasing style

### Required header:
Your code should have a header at the top. An example follows.

```java
/* Developer: Eddie Rangel
   Course: COMP B11
   Date: 12/8/2016
   Project: Homework 4-A
   FileName: Student.java
   Description: Student implementation
*/
```
### Collaboration policy:
You can discuss the project with other students but the code must be written entirely by you. 
Please do not ask tutors to write your code. Tutors can show you how to debug your code and can 
explain algorithms only. Tutors cannot write code for you.

### How to turn in your project final program?
Upload a project.zip folder to Canvas under the Project Assignment

### User Stories

#### Student Stories
As a student, I would like to enroll in a course. 

A student launches the CourseAware application and is presented with the Student Menu. The student
selects the 'Enroll in a Course' menu option. A student cannot enroll in more than 15 units.  


```console
  Welcome to CourseAware's Student Menu
  ====================================
  1.  Enroll in a Course
  2.  View Class Schedule
  3.  View Grades

  0.  Exit
  ====================================
  Enter selection:
```

#### Professor Stories

As a professor, I would like to enter student test scores.

A professor launches the CourseAware application and is presented with the Professor Menu. The
professor selects 'Enter Test Scores' menu option. 


```console
  Welcome to CourseAware's Faculty Menu
  ====================================
  1.  Enter Test Scores
  2.  Create Course
  3.  View Class Schedule

  0.  Exit
  ====================================
  Enter selection:
```
