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
    }

}
