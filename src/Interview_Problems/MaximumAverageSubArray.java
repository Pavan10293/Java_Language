package Interview_Problems;
/*Given an array consisting of n integers, find the contiguous subarray of length k that has the maximum
average value and return this value.

Example :

Input : [1, 12, -5, -6, 50, 3], k =4;
Output = 12.75

Explanation : Max average is (12 + -5 + -6 + 50) / 4 = 51 / 4 = 12/75

SLIDING WINDOW INSIGHT

-> Maintain a window of size k
-> Slide the window, updating the sum by removing the leftmost element and adding the new rightmost one
-> Keep track of the maximum sum seen.

Time complexity - O(n)
Space complexity - O(1)

Online resource - https://www.youtube.com/watch?v=oFUjy06MfSg
*/
public class MaximumAverageSubArray {

    public static void main(String[] args) {
        double maxAverage = maximumAverageSubArray(new int[]{1, 12, -5, -6, 50, 3}, 4);
        System.out.println(maxAverage);

        double maxAverage2 = maximumAverageSubArray(new int[]{1, 12, -5, -6, 50, 3}, 3);
        System.out.println(maxAverage2);
    }

    private static double maximumAverageSubArray(int[] array, int k) {
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }

        double maxSum = windowSum;

        // Slide the window
        for (int i = k; i < array.length; i++) {
            windowSum += array[i] - array[i - k]; // Add new, remove old
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;
    }
}
