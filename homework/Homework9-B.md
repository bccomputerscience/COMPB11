## Homework 9-B

Write a program called Student.java

In this assignment we will work on creating inhertied classes. The Student class will derive from our
Person class. 

* Status (Freshman, Sophmore...)
* GPA (3.00 or 2.50)

You will need to override the ToString method so that you can properly print out a Student.


```java

public static void main(String[] args)
{
    Student myStudent = new Student("John", "Doe", "Freshman", 3.5);
    System.out.println(myStudent.toString());
}

```


```java

public class Student extends Person
{
    // Private instance variables

    //Constructor
    public Student(String firstName, String lastName, String status, double gpa)
    {
        super(firstName, lastName);
        this.status = status;
        this.gpa = gpa;
    }

    
    public String toString()
    {
        // Implement details
    }

}

```

### Output

```console
Student: John Doe Status: Freshman GPA: 3.50 
```


### Due 11/17 before 8am

Sumbit Student.java to canvas under Homework 9-B by 7:59 am on November 17.

