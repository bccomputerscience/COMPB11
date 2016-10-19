## COMP B11 Fall 2016 Project
We're going to work on creating a Course Management application for our class project. 

The application could be used by students, faculty, and staff to manage a campuses courses.

We will focus on several features of the product. They will be presented as a set of User Stories.

As a student, I would like to know my grade for a course.  
As a professor, I would like to create an assignment.  
As a student, I would like to know my class schedule.  
As a professor, I would like to assign grades for a class assignment.  

This can be a console based or gui based program. Higher points will go toward a well presented 
console based application than a sparsely featured graphical application.

We will define a set of tests that will help us determine the completeness of our application.
This will be done during User Acceptance Testing. 

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
