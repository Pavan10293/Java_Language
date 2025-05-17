package Collections.ArraysClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class LearnArraysClass {

    public static void main(String[] args) {

//        System.out.println("The index of element 4 in the array is :"+binarySearchedIndex(4));
//        System.out.println("The index of element 7 in the array is :"+binarySearchedIndex(7));
        sortArray();
//        fillArray();
    }


    private static int binarySearchedIndex(int key) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        return Arrays.binarySearch(numbers, key);
    }

    private static void sortArray() {
        int[] numbers = {16, 2, 43, 24, 5, 36, 97, 8, 999, 10};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers); //This prints the object reference hashcode instead of the values of the array.
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArray() {
        int[] numbers = {16, 2, 43, 24, 5, 36, 97, 8, 999, 10};
        Arrays.fill(numbers, 12);
        System.out.println(Arrays.toString(numbers));
    }

}
