package Interview_Problems;

import java.util.List;
import java.util.Arrays;

public class RotateArrayAtAPosition {

        public static void main(String[] args) {
            int[] arr = {23,52,42,41,89};
            int rotationValue = 2;   // rotation value = 2 --> {41,89,23,52,42}
            System.out.println(arrayRotation(arr, rotationValue));
        }

    public static List<Integer> arrayRotation(int[] arr, int rotationValue){

            int arrayLength = arr.length;
            Integer[] rotatedArray = new Integer[arrayLength];
            int size = 0;
            for(int i=arrayLength-rotationValue; i<arrayLength; i++) {
                rotatedArray[size++] = arr[i];
            }  //{41,89,0,0,0}
            for(int i=0;i<=rotationValue;i++) {
                rotatedArray[size++]= arr[i];
            }
            return Arrays.asList(rotatedArray);
        }

}
