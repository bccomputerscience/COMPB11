## Homework 9-A

Write a program called Person.java

In this assignment we will work on creating inhertied classes. Person.java will be your super class object.
It will contain general information about a Person.

* First Name
* Last Name

You will need to override the ToString method so that you can properly print out a Person.

```java

public static void main(String[] args)
{
    Person myPerson = new Person("John", "Doe");
    System.out.println(myPerson.toString());
}

```

```java

public class Person
{
    // Private instance variables

    //Constructor
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    public String toString()
    {
        // Implement details
    }

}

```
### Output

```console
Full Name: John Doe 
```


### Due 11/17 before 8am

Sumbit Person.java to canvas under Homework 9-A by 7:59 am on November 17.

