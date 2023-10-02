package LeetCode_Problems.Arrays;

import java.util.Arrays;

/*Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */
public class ConcatenationOfAnArray_1929 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{7,8,19})));
        System.out.println(Arrays.toString(getConcatenation(new int[]{4,16,80, 26})));
    }

    public static int[] getConcatenation(int[] nums) {
        int arrayLength = nums.length;
        int[] concatenatedArray = new int[2*arrayLength];
        for(int i=0;i<arrayLength;i++) {
            concatenatedArray[i] = nums[i];
            concatenatedArray[i + arrayLength] = nums[i];
        }
        return concatenatedArray;
    }

}
