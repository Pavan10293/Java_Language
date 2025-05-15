package LeetCode_Problems.Math;

//Given an integer x, return true if x is a palindrome, and false otherwise.

public class IsNumberPalindrome_9 {

    public static boolean isPalindrome(int x) {
        if(x>0) {
            int original = x;
            int reverse = 0;
            while (x != 0) {
                int digit = x % 10;
                reverse = reverse * 10 + digit;
                x /= 10;
            }
            return original == reverse;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(365));
    }
}
