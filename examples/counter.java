/* And example of the increment and decrement operators in java
*/

public class counter
{
    public static void main(String[] args)
    {
        int counter = 0;
   
      // demonstrate postfix increment operator
      counter = 5; // assign 5 to c
      System.out.println( counter );   // prints 5
      System.out.println( counter++ ); // prints 5 then postincrements
      System.out.println( counter );   // prints 6

      System.out.println(); // skip a line

      // demonstrate prefix increment operator
      counter = 5; // assign 5 to c
      System.out.println( counter );   // prints 5
      System.out.println( ++counter ); // preincrements then prints 6
      System.out.println( counter );   // prints 6

    }
}