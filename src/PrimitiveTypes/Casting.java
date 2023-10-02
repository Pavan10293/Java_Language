package PrimitiveTypes;

public class Casting {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;

        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);

        byte myMinByteValue = Byte.MIN_VALUE;

//      byte myNewByteValue= (myMinByteValue / 2); //Compiler throws an error here as the content is the parantheses is treated as an Int which is the default whole number in Java
        //To overcome the above error, we use Typecasting :-
        byte myNewByteValue2= (byte)(myMinByteValue / 2);
        System.out.println(myNewByteValue2);

        //Similarly for short data type
        short myMinShortValue = Short.MIN_VALUE;
        short myNewShortValue = (short)(myMinShortValue / 2);
        System.out.println(myNewShortValue);
    }

}
