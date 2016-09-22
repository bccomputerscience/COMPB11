/* Developer: Eddie Rangel
*  Course: COMP B11
*  Date: 09/07/2016
*  Assignment: Example of an Object and its behavior
*  Description: CourseAware is an application that helps you track your class through out 
*               a semester. Keep track of grades and display class statistics. 
*/

public class CourseAwareTester
{
    public static void main(String[] args)
    {
        
        // create CourseAware object myCourses and 
        // pass course name to constructor
        CourseAware myCourses = new CourseAware("COMP B11: Programming Methods 1");

        myCourses.displayMessage();
        myCourses.determineClassAverage();

    }
}