/*
    An example of the Primative Data Types available in Java
*/

public class PrimativeDataTypes
{
    public static void main(String[] args)
    {
        
        System.out.println("Byte");
        System.out.println("Minimum value of a Byte: " + Byte.MIN_VALUE);
        System.out.println("Maximum value of a Byte: " + Byte.MAX_VALUE);
        System.out.println("Number of Bits: " + Byte.SIZE);
        System.out.println("Number of Bytes: " + Byte.BYTES);
        System.out.println();
        System.out.println("Character");
        System.out.println("Minimum value of a Character: " + Character.MIN_VALUE);
        System.out.println("Maximum value of a Character: " + Character.MAX_VALUE);
        System.out.println("Number of Bits: " + Character.SIZE);
        System.out.println("Number of Bytes: " + Character.BYTES);
        System.out.println();
        System.out.println("Short");
        System.out.println("Minimum value of a Short: " + Short.MIN_VALUE);
        System.out.println("Maximum value of a Short: " + Short.MAX_VALUE);
        System.out.println("Number of Bits: " + Short.SIZE);
        System.out.println("Number of Bytes: " + Short.BYTES);
        System.out.println();
        System.out.println("Integer");
        System.out.println("Minimum value of a Integer: " + Integer.MIN_VALUE);
        System.out.println("Maximum value of a Integer: " + Integer.MAX_VALUE);
        System.out.println("Number of Bits: " + Integer.SIZE);
        System.out.println("Number of Bytes: " + Integer.BYTES);
        System.out.println();
        System.out.println("Double");
        System.out.println("Minimum value of a Double: " + Double.MIN_VALUE);
        System.out.println("Maximum value of a Double: " + Double.MAX_VALUE);
        System.out.println("Number of Bits: " + Double.SIZE);
        System.out.println("Number of Bytes: " + Double.BYTES);
        System.out.println();
        System.out.println("Float");
        System.out.println("Minimum value of a Float: " + Float.MIN_VALUE);
        System.out.println("Maximum value of a Float: " + Float.MAX_VALUE);
        System.out.println("Number of Bits: " + Float.SIZE);
        System.out.println("Number of Bytes: " + Float.BYTES);
        System.out.println();

        boolean result = true; 
        char capitalE = 'E';
        byte aByte = 101; //binary value 101 decimal value 5
        short aShort = 10000;
        int anInt = 100000;

        System.out.println(result);
        System.out.println(capitalE);
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(anInt);

        // The number 26, in decimal
        int decVal = 26;
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        // The number 26, in binary
        int binVal = 0b11010;
        System.out.println();
        System.out.printf("Decimal 26: %d\n",decVal);
        System.out.printf("Hex 26: %d\n",hexVal);
        System.out.printf("Binary 26: %d\n", binVal);

        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1  = 123.4f;

        System.out.println();
        System.out.printf("Value: %.4f \n", d1);
        System.out.printf("Value:  %.4e \n", d2);
        System.out.printf("Value: %.4f \n", f1);

        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi =  3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

        System.out.println();
        System.out.println(creditCardNumber);
        System.out.println(socialSecurityNumber);
        System.out.printf("Value: %.4f \n", pi);
        System.out.printf("Hex Bytes: %x \n", hexBytes);
        System.out.printf("Hex Words: %x \n",hexWords);
        System.out.printf("Max Long: %x \n", maxLong);
        System.out.printf("Nybbles: %x \n", nybbles);
        System.out.printf("bytes: %d \n", bytes);

    }
}