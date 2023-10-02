package LeetCode_Problems.Arrays;
/*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.



Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
*/

public class RichestCustomerWealth_1672 {

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {{1,2,3},{3,2,1}}));
        System.out.println(maximumWealth(new int[][] {{1,5},{7,3}, {3,5}}));
        System.out.println(maximumWealth(new int[][] {{2,8,7},{7,1,3}, {1, 9, 5}}));
    }

    private static int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for(int[] eachCustomerWealth : accounts) {
            int i = 0, sum=0;
            while (i<eachCustomerWealth.length) {
                sum += eachCustomerWealth[i];
                i++;
            }
            if(sum > maximumWealth) {
                maximumWealth = sum;
            }
        }
        return maximumWealth;
    }
}
