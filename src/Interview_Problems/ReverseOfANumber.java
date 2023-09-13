package Interview_Problems;
import java.util.Scanner;


    public class ReverseOfANumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int reversedNumber = 0;

            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            System.out.println("Reversed number: " + reversedNumber);
            scanner.close();
        }
    }
