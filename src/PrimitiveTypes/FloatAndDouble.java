package PrimitiveTypes;

public class FloatAndDouble {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d; //It's a good practice to add an 'f' or 'd' for float and double values.

        System.out.println("My Int value = "+myIntValue);
        System.out.println("My float value = "+myFloatValue);
        System.out.println("My Double value = "+myDoubleValue);

        int myIntValue2 = 5 / 2;
        float myFloatValue2 = 5f / 2f;
        double myDoubleValue2 = 5d / 2d;

        System.out.println("My Int value / 2 = "+myIntValue2);
        System.out.println("My float value / 2 = "+myFloatValue2);
        System.out.println("My Double value / 2 = "+myDoubleValue2);

        int myIntValue3 = 5 / 3;
        float myFloatValue3 = 5f / 3f;
        double myDoubleValue3 = 5d / 3d;

        System.out.println("My Int value / 3 = "+myIntValue3);
        System.out.println("My float value / 3 = "+myFloatValue3);
        System.out.println("My Double value / 3 = "+myDoubleValue3);

        //float floatNum = 2.25; Compiler shows error here as the default floating point data type in java is double.
        float floatNum = 2.25f;

        //CHALLENGE

        double numberOfPounds = 200d;
        double kilograms = numberOfPounds * 0.45359237d;
        System.out.println("Challenge result = "+kilograms);
    }

}
