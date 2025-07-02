package Interview_Problems;


public class OccurencesOfACharacterInString {

    public static void main(String[] args) {
        System.out.println(occurrencesOfCharacter("Pavan Kumar", 'A'));
        System.out.println(occurrencesOfCharacter("Pavan Kumar", 'a'));
        System.out.println(occurrencesOfCharacter("Pavan Kumar", 'p'));
    }

    public static int occurrencesOfCharacter(String inputString, Character character) {

        String upperCaseString = inputString.toUpperCase();
        int numberOfOccurences = 0;
        for(char eachCharacter : upperCaseString.toCharArray()) {
            if(eachCharacter == Character.toUpperCase(character)) {
                numberOfOccurences++;
            }
        }

        return numberOfOccurences;
    }

}
