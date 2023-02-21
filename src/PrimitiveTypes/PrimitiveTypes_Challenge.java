package PrimitiveTypes;

public class PrimitiveTypes_Challenge {

    public static void main(String[] args) {

        byte myByteNumber = 120;
        short myShortNumber = 20000;
        int myIntNumber = 900000;

        long myLongValue = 50000L + 10L*(myByteNumber+myShortNumber+myIntNumber);
        System.out.println(myLongValue);

        short myShortValue = (short)(1000 + 10 * (myByteNumber+myShortNumber+myIntNumber)); //Casting is required as Java considers the whole number as int data type by default.
        System.out.println(myShortValue);
    }

}
