## Homework 8-A

Write a program called ArrayMethods.java 

In this programming assignment you will use common array algorithms. You will use a random number generator to fill up an 
array with values.

Write array methods that carry out the following tasks for an array of doubles by completting the ArrayMethods class below. 

```java
// You will need to import the Random class
import java.util.Random;

public class ArrayMethods
{
  public void swapFirstLast(double[] values)
  {
    // Fill in implementation detail
  }

  public void rotateRight(double[] values) {}

  public void replaceEven(double[] values){}

  public static void main(String[] args)
  {
    // Create an array of doubles initialized to hold 10 elements
    
    // Create a utility object to work with the methods you will create
    ArrayMethods utility = new ArrayMethods();

    // Create a random object to generate random values
    Random generator = new Random();

    //Fill up your array with random double values

    // Perform swap
    utility.swapFirstLast(values);

    // Print values in array 

    // Perform Shift
    utility.rotateRight(values);

    // Print Values in array

    // Perform Replace with Even with Zeros
    utility.replaceEven(values);

    // Print Values  

  }
 
}
```



### Due 11/10 before 8am

Sumbit ArrayMethods.java  to canvas under Homework 8 by 7:59 am on November 10.

