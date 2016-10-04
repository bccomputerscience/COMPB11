## Homework 4-C

**This assignment is optional**

Write a program called GradeBook save your file as GradeBook.java

Write a program  that asks the user to enter five test scores. The program should display the score, a letter grade for each score, and 
the average test score. This program should have a method defined to return the letter grade of score that was provided.  

```console
Tests     Score     Grade
-------------------------
Test 1       85     B
Test 2       70     C
Test 3       80     B
Test 4       85     B
Test 5       90     A
-------------------------
Average:     82     B

```

In order to receive the full points, you have to use a method that returns the character that represents the score that was received. 

```java
public static char determineGrade(double score)
{
    // Determine Letter Grade based upon the score recieved
}
```

When you create your table, you can pass in your determineGrade method inside of your printf statements.

```java
System.out.printf("My grade is: ", determineGrade(score1));
```

Note: To create the table, use field widths with left and right alignment in your printf format strings. Also, note that character data
is normally left aligned and numeric data is normally right aligned.

### Due 10/11 before 8am
Up to 10 points can be earned.