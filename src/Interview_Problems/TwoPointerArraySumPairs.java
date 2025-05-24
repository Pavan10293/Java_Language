package Interview_Problems;

//GeeksForGeeks resource link - https://www.geeksforgeeks.org/two-pointers-technique/

/*Given a sorted array arr (sorted in ascending order) and a target,
find if there exists any pair of elements (arr[i], arr[j]) such that their sum is equal to the target.

Input: arr[] = {10, 20, 35, 50}, target =70
Output:  Yes
Explanation : There is a pair (20, 50) with given target.

Input: arr[] = {10, 20, 30}, target =70
Output :  No
Explanation : There is no pair with sum 70

Input: arr[] = {-8, 1, 4, 6, 10, 45}, target = 16
Output: Yes
Explanation : There is a pair (6, 10) with given target.
 */
import java.util.Arrays;

public class TwoPointerArraySumPairs {

    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        int[] arr2 = {-8, 1, 4, 6, 10, 45};
        int target2 = 16;
//        System.out.println(twoSum(arr, target));
//        System.out.println(twoSumTwoPointerApproach(arr, target));
        System.out.println(twoSumTwoPointerApproach(arr2, target2));
    }


    //Naive approach - O(n^2) Time and O(1) Space

    static boolean twoSum(int[] arr, int target){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    //Two pointer approach - O(n) time and O(1) space

    static boolean twoSumTwoPointerApproach(int[] arr, int target){

        Arrays.sort(arr);      // Sort the array
        int left = 0, right = arr.length - 1;

        while (left < right) {         // Iterate while left pointer is less than right
            int sum = arr[left] + arr[right];
            if (sum == target)         // Check if the sum matches the target
                return true;
            else if (sum < target)
                left++;                 // Move left pointer to the right
            else
                right--;                // Move right pointer to the left
        }

        return false;                    // If no pair is found
    }

}
