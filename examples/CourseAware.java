/* Developer: Eddie Rangel
*  Course: COMP B11
*  Date: 09/07/2016
*  Assignment: Example
*  Description: CourseAware is an application that helps you track your class through out 
*               a semester. Keep track of grades and display class statistics. 
*/

import java.util.Scanner;

public class CourseAware
{
    private String courseName; // name of course this CourseAware represents

   // constructor initializes the private courseName
   public CourseAware( String name )
   {
      courseName = name; // initializes courseName
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   // display a message to the CourseAware user
   public void displayMessage()
   {
      // getCourseName gets the name of the course
      System.out.printf( "Welcome to CourseAware: A Course Management System for\n%s!\n\n", 
         getCourseName() ); 
   } // end method displayMessage

   // determine class average based on 10 grades entered by the user
   public void determineClassAverage() 
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      int total = 0; // sum of grades entered by user initialized to zero
      int gradeCounter = 0; // number of the grade to be entered next initialized to zero
      int grade = 0; // grade value entered by user initialized to zero
      int average = 0; // average of grades initialized to zero

      gradeCounter = 1; // initialize loop counter
   
      // processing phase uses counter-controlled repetition
      while ( gradeCounter <= 10 ) // loop 10 times
      {
         System.out.print( "Enter student grade: " ); // prompt 
         grade = input.nextInt(); // read grade from user
         total = total + grade; // add grade to total
         gradeCounter++; // increment counter by 1
      } // end while
   
      // termination phase
      average = total / 10; // integer division

      // display the total and average of grades
      System.out.printf( "\nTotal of all 10 grades is %d\n", total );
      System.out.printf( "Class average is %d\n", average );
   } // end method determineClassAverage

}