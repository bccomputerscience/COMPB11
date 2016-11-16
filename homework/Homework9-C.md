## Homework 9-C

Write a program called Instructor.java

In this assignment we will work on creating inhertied classes. The Instructor will derive from the Person
class. 

* Title
* Department

You will need to override the ToString method so that you can properly print out a Instructor.

```java

public static void main(String[] args)
{
    Instructor myInstructor = new Instructor("John", "Doe", "Asst. Professor", "Computer Science");
    System.out.println(myInstructor.toString());
}

```

```java

public class Instructor extends Person
{
    // Private instance variables

    //Constructor
    public Instructor(String firstName, String lastName, String title, String department)
    {
        super(firstName, lastName);
        this.title = title;
        this.department = department;
    }

    public String toString()
    {
        // Implement details
    }

}

```

### Output

```console
Instructor: John Doe Title: Asst. Professor Department: Computer Science 
```


### Due 11/17 before 8am

Sumbit  Person.java to canvas under Homework 9-C by 7:59 am on November 17.

