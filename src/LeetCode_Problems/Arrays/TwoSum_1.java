package LeetCode_Problems.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
public class TwoSum_1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 22)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSumHashMap(new int[]{24,7,9,10}, 16)));
    }

    //Time complexity: O(n^2)
    //Space Complexity: O(1)

    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length-1; i++){
            for(int j=i+1;j<=nums.length-1; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //Time complexity: O(n)
    //Space Complexity: O(n)

        public static int[] twoSumHashMap(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }
                map.put(nums[i], i);
            }
            // Return an empty array if no solution is found
            return new int[] {};
        }
}
