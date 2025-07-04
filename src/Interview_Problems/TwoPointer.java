package Interview_Problems;

import java.util.ArrayList;

public class TwoPointer {

    public static void main(String[] args) {

        System.out.println(distanceBetweenTwoString("programmerxpermxremmargorp", "programmer"));

    }

    private static int distanceBetweenTwoString(String inputString, String word) {

        int numberOfCharacters = 0;

        ArrayList<Character> charactersList = new ArrayList<>();
        for(Character eachCharacter : word.toCharArray()) {
            charactersList.add(eachCharacter);
        }

        for(Character eachCharacter : inputString.toCharArray()) {
            if(charactersList.contains(eachCharacter)) {
                charactersList.remove(eachCharacter);
            } else {
                numberOfCharacters++;
            }

        }

        return numberOfCharacters;
    }

}
