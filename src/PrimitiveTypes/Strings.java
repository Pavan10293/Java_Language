package PrimitiveTypes;

public class Strings {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to "+myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to "+myString);
        myString = myString + "\u00A9 2019";                 //String can also take in Unicode character in addition to the regular characters.
        System.out.println("myString is equal to "+myString);

        String numberString = "250.55";
        numberString =numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;    //Java converts the numerical value 50 to a string and appends it to the other string for the purpose of this expression.
        System.out.println("Last string = "+ lastString);   //The data type of myInt still remains a string

        double doubleNumber = 250.97d;
        lastString = doubleNumber + lastString;
        System.out.println("Last string = "+ lastString);
    }

}
