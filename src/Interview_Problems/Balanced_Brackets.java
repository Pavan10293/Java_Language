package Interview_Problems;

import java.util.Stack;
import java.lang.Character;

/*given a string containing only characters '(', ')', '{', '}', '[' and ']',
and you need to determine if the brackets in the string are balanced.
This means that every opening bracket must have a corresponding closing bracket,
and they must be in the correct order.
 */
public class Balanced_Brackets {

        public static void main(String[] args) {

            String input = "{[()]}";
            System.out.println(isBalancedBracketsCorrectOrder(input));
            String input2 = "{[(])}";
            System.out.println(isBalancedBracketsCorrectOrder(input2));
            System.out.println(isBalancedBracketsAnyOrder(input2));
        }

        private static boolean isBalancedBracketsCorrectOrder(String inputString) {
            Stack<Character> stack = new Stack<>();
            for (char bracket : inputString.toCharArray()) {
                if (bracket == '(' || bracket == '{' || bracket == '[') {
                    stack.push(bracket);
                } else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false; // mismatched bracket, not balanced
                }
            }
            return stack.isEmpty(); // true if stack is empty (all brackets are balanced)
        }

        private static boolean isBalancedBracketsAnyOrder(String inputString) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < inputString.length(); i++) {
                char bracket = inputString.charAt(i);
                if (bracket == '(' || bracket == '{' || bracket == '[') {
                    stack.push(i); // store the index of opening brackets
                } else if (bracket == ')' || bracket == '}' || bracket == ']') {
                    if (stack.isEmpty()) {
                        return false; // no matching opening bracket
                    }
                    int top = stack.pop();
                    char openBracket = inputString.charAt(top);
                    if ((bracket == ')' && openBracket != '(') ||
                            (bracket == '}' && openBracket != '{') ||
                            (bracket == ']' && openBracket != '[')) {
                        System.out.println("Mismatched brackets at index: " + top + " and " + i);
                        return false; // mismatched opening and closing brackets
                    }
                }
            }
            if (!stack.isEmpty()) {
                System.out.println("Unclosed brackets at index: " + stack.pop());
                return false; // unclosed opening brackets
            }
            return true;
        }

}
