/*
    Example showing the byte size of a data type
*/

public class typesizes
{
    public static void main(String[] args)
    {
        int anInt = 0;
        double aDouble = 0.0;
        float aFloat = 0.0f;

        System.out.println("The size of an int: " + Integer.BYTES);
        System.out.println("The size of a double: " + Double.BYTES);
        System.out.println("The size of a float: " + Float.BYTES);

    }
}