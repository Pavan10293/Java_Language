package Interview_Problems;

import java.util.List;
import java.util.Arrays;

public class RotateArrayAtAPosition {

        public static void main(String[] args) {
            int[] arr = {23, 52, 42, 41, 89};
            int[] arr2 = {23, 52, 42, 41, 89, 63};
            int[] arr3 = {18, 53, 61, 38, 91, 78, 9, 16};
            System.out.println(arrayRotation(arr2, 1));
            System.out.println(arrayRotation(arr3, 2));
            System.out.println(arrayRotation(arr3, 3));
        }

    public static List<Integer> arrayRotation(int[] arr, int rotationValue){

            int arrayLength = arr.length;
            Integer[] rotatedArray = new Integer[arrayLength];
            int size = 0;
            for(int i=arrayLength-rotationValue; i<arrayLength; i++) {
                rotatedArray[size++] = arr[i];
            }  //{41,89,0,0,0}
            for(int i=0;i<=arrayLength-(rotationValue+1);i++) {
                rotatedArray[size++]= arr[i];
            }
            return Arrays.asList(rotatedArray);
        }

}
