package Interview_Problems;

import java.util.List;
import java.util.Arrays;

public class RotateArrayAtAPosition {

        public static void main(String[] args) {
            int[] arr = {23, 52, 42, 41, 89};
            int[] arr2 = {23, 52, 42, 41, 89, 63};
            int[] arr3 = {18, 53, 61, 38, 91, 78, 9, 16};
            System.out.println(Arrays.toString(arrayRotation(arr, 1)));
            System.out.println(Arrays.toString(arrayRotation(arr2, 2)));
            System.out.println(Arrays.toString(arrayRotation(arr3, 3)));

            System.out.println(Arrays.toString(arrayRotation2(arr, 1)));
            System.out.println(Arrays.toString(arrayRotation2(arr2, 2)));
            System.out.println(Arrays.toString(arrayRotation2(arr3, 3)));
        }

    public static int[] arrayRotation(int[] arr, int rotationValue){

            int arrayLength = arr.length;
            int [] modifiedArray = new int[arrayLength];

            for(int i=0; i<arrayLength-rotationValue; i++) {
                modifiedArray[i] = arr[i+rotationValue];
            }

            for(int i=0; i<rotationValue; i++) {
                modifiedArray[arrayLength - rotationValue + i] = arr[i];
            }

            return modifiedArray;
        }

    public static int[] arrayRotation2(int[] arr, int rotationValue){

        int arrayLength = arr.length;
        int[] rotatedArray = new int[arrayLength];
        int size = 0;
        for(int i=arrayLength-rotationValue; i<arrayLength; i++) {
            rotatedArray[size++] = arr[i];
        }  //{41,89,0,0,0}
        for(int i=0;i<=arrayLength-(rotationValue+1);i++) {
            rotatedArray[size++]= arr[i];
        }
        return rotatedArray;
    }

}
