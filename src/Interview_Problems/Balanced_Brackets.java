package Interview_Problems;

import java.util.Stack;
import java.lang.Character;

public class Balanced_Brackets {

        public static void main(String[] args) {

            String input = "{{[]{}}}";
            Stack<Character> stackofBrackets = new Stack<Character>();
            for(Character eachCharacter : input.toCharArray()) {
                if(eachCharacter.equals('{') || eachCharacter.equals('[')) {
                    stackofBrackets.push(eachCharacter);
                }
                else {
                    if(stackofBrackets.size()>0) {
                        stackofBrackets.pop();
                    }
                }
            }
            System.out.println(stackofBrackets.size() == 0);
        }


}
