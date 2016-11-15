## COMP B11 Fall 2016 Project

### Academic Standards
This is not a group project. Do not accept code from other students or tutors.
Do not have the code of other students in your own directories or repositories.

### Requirements
I will accept one comopressed folder with your Course Project source code. I suggest you first create 
a folder called project. Your project should be structured in the following format. All of your source code
files should be in a directory called src. If you're using eclipse, this shoud be the default behavior when 
creating an Application.

```console
/project  
/project/src  
/project/src/Person.java  
/project/src/Instructor.java  
/project/src/Student.java  
/project/src/Course.java  
/project/src/CourseAware.java  
/project/src/CourseAwareMain.java  
/project/src/CourseAwareTester.java  
```

Do not send me your binaries  
No /bin directories please.  

### Project Milestones
Phase | Percent | Description
------|---------|------------
Phase I | 60% | Create a Course in the CourseAwareApp  
Phase II | 70% | Populate course with Students  
Phase III | 80% | Add test scores to Students 
Phase IV | 90% | Support Multiple Courses  
Phase V | 100% | Flare (Points for Creativity) 

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
Each of your code should have a header at the top. An example follows. The description for each files
should accuratley describe its purpose. Points will be deducted for copy/paste errors.

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

### Phase I
#### 60%

#### Professor Story 1A

As a professor, I would like to create a course so that I can keep track of a semester

A professor launches the CourseAware application and is presented with the Professor Menu. The
professor selects 'Enter Test Scores' menu option. 


```console
  Welcome to CourseAware's Faculty Menu
  ====================================
  1. Create Course 
  2. Add Students to a Course
  3. View Course Schedule
  4. Add Test scores to a Course

  0.  Exit
  ====================================
  Enter selection:
```

#### Deliverables


```console
Person.java  
Instructor.java  
Student.java  
Course.java  
CourseAware.java  
CourseAwareMain.java  
CourseAwareTester.java  
```


File | Purpose
------------ | -------------
Person.java | Base Class
Student.java | Inherits from Person
Instructor.java | Inherits from Person
Course.java | Implementation details of a Course object
CourseAware.java | Core Logic of the CourseAware application
CourseAwareMain.java | Main program 
CourseAwareTester.java | Test Runner 

Object | Properties
------------ | -------------
Person | First Name, Last Name, Middle Initial
Instructor | Title
Student | Status, GPA
Course | Name, Number, Units, Instructor, Students
CourseAware | Course, Instructor
CourseAwareMain | Main Driver
CourseAwareTester | Tests

### User Acceptance Test 60%

Test Case | Description
----------|-------------
Start Application as an Instructor | 2 Steps
1. Lauch App | Execute Application
    | See Main Menu
2. Create Course | Select Create Course Menu option
  | Enter Course Information
  | View Course in Instructor Schedule


### Phase II
#### 70%

#### Professor Story 2A

As a professor, I would like t add a list of Students to my course so that I can keep track of a their progress

A professor launches the CourseAware application and is presented with the Professor Menu. The
professor selects 'Add Students to a Course' menu option. 


```console
  Welcome to CourseAware's Faculty Menu
  ====================================
  1. Create Course 
  2. Add Students to a Course
  3. View Course Schedule
  4. Add Test scores to a Course

  0.  Exit
  ====================================
  Enter selection:
```

#### Deliverables
Everything from Phase I plus ...   


### User Acceptance Test 70%

Test Case | Description
----------|-------------
Start Application as an Instructor | 2 Steps
1. Lauch App | Execute Application
    | See Main Menu
2. Create Course | Select Add Students to a course option
  | Enter Name of Student File
  | View List of Imported Students


### Phase II
#### 80%

#### Professor Story 3A

As a professor, I would like t add a test scores to the Students in my course so that I maintain their progress

A professor launches the CourseAware application and is presented with the Professor Menu. The
professor selects 'Add Test scores to a Course' menu option. 

#### Deliverables
Everything from Phase I plus ...   


### User Acceptance Test 80%

Test Case | Description
----------|-------------
Start Application as an Instructor | 2 Steps
1. Lauch App | Execute Application
    | See Main Menu
2. Create Course | Select Add Students to a course option
  | View Course
  | Select Course
  | Add Test Scores to each Student  
3. Verify
