package LeetCode_Problems.Strings;

public class AddBinary_67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println("Sum: " + manualBinaryAddition(a, b));
        System.out.println("Sum: " + builtInFunction(a, b));
    }

    public static String manualBinaryAddition(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    public static String builtInFunction(String a, String b) {

        // Convert binary strings to decimal integers
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int num3 = Integer.parseInt(a, 16);

        // Add the integers
        int sum = num1 + num2;

        // Convert the result back to binary
        return Integer.toBinaryString(sum);
    }
}

