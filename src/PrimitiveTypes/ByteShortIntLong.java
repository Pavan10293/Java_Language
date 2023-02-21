package PrimitiveTypes;

public class ByteShortIntLong {

    public static void main(String[] args){
        int myValue = 10000;
        System.out.println(myValue);
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1)); //Integer's max value plus 1 doesn't fit into an int datatype. So, it overflows
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); //Integer's min value minus 1 doesn't fit into an int datatype. So, it underflows

        int myMaxIntTest = 2147483647;
        int myMaxIntTest2 = 2_147_483_647; //Underscores can be used to make it more readable.
        System.out.println(myMaxIntTest+" " +myMaxIntTest2);
        //int myMaxIntTest = 2147483648; Compiler flags off an error as the range of int datatype exceeds

        //BYTE

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        //SHORT

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);

        //LONG

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);

        //long bigLongLiteralValue = 2_147_483_6479; Compiler throws error as the Default whole number in Java is an integer and the given no. exceeds the max value of integer.
        long bigLongLiteralValue = 2_147_483_6479L; //"L" is required at the end to instruct the compiler that the value should be considered as a Long data type.
        System.out.println(bigLongLiteralValue);
    }

}
