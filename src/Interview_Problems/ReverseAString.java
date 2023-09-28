package Interview_Problems;

public class ReverseAString {

    public static void main(String[] args) {
        String originalString = "Pavan Kumar";

        System.out.println(reversedString(originalString));
        System.out.println(reversedStringUsingStringBuffer(originalString));
    }

    private static String reversedString(String originalString) {
        String reversedString = "";

        for(int i=originalString.length()-1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }

        return reversedString;
    }

    private static String reversedStringUsingStringBuffer(String originalString) {
        StringBuilder reversedString = new StringBuilder();

        for(int i=originalString.length()-1; i >= 0; i--) {
            reversedString.append(originalString.charAt(i));
        }

        System.out.println("Length of reversed String Builder :- "+reversedString.length());
        System.out.println("String Builder Object :- "+reversedString.getClass());

        return reversedString.toString();
    }

    //NOTE : Use String when you don't need to modify the text often and want thread safety,
    // Use StringBuffer when you need to modify the text in a multi-threaded environment,
    // Use StringBuilder when you need to modify the text in a single-threaded environment for better performance.

}
