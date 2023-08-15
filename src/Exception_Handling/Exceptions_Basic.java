package Exception_Handling;

public class Exceptions_Basic {

    public static void main(String[] args) {

        try {
            getInt("pants");
            getInt(null);
            getInt("12345");
        } catch (NumberFormatException e) {
            System.out.print("Hey dude, you can't make an int out of it.");
        }
    }

    public static int getInt(String myString) throws NumberFormatException, NullPointerException{
        return Integer.parseInt(myString);
    }
}
