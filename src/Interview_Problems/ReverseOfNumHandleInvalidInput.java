package Interview_Problems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseOfNumHandleInvalidInput {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Enter an integer: ");
                    int number = scanner.nextInt();
                    System.out.println("You entered: " + number);
                    validInput = true; // Exit the loop if valid input is provided
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.nextLine(); // Consume the invalid input
                }
            }

            scanner.close();
        }


}
