package Interview_Problems;

/*Explored about this when S.Vembu mentioned this in one of his connect post related to Pali.
Link - https://connect.zoho.com/portal/intranet/forum/post/why-does-the-world-need-yet-another-programming-language
*/

public class HaltingProblem {

    public static void main(String[] args) {
//        simpleHalting();
//        infiniteLoop();
        uncertainHalting();
    }

    public static void simpleHalting() {
        System.out.println("Hello, world!");
        /* This program prints a message and exits — it clearly halts.*/
    }

    public static void infiniteLoop() {
        while (true) {
            System.out.println("Hello, world!");
        }

        /*This program never halts — it loops forever.*/
    }

    public static void uncertainHalting() {
        int n = 27, i =0;
        while (n != 1) {
            i++;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println("Halted. n = "+n);
        System.out.println("i :- "+i);
        /*This uses the Collatz conjecture, which seems to halt for all positive integers.
          But no one has proven it will always halt.
          So a general method cannot guarantee it halts for every input.*/
    }

    public static class HaltingChecker {
        public static boolean halts(String programCode, String input) {
            // This function does NOT exist in real life
            // It's theoretically impossible to implement correctly for all cases
            return true; // placeholder
        }

    }

    public static class Paradox {
        public static void main(String[] args) {
            if (HaltingChecker.halts("Paradox", "Paradox")) {
                while (true) {
                    // Loop forever
                }
            } else {
                System.out.println("Halted.");
            }
        }
    }

    /*If halts() says this halts → it goes into an infinite loop (contradiction).
      If halts() says this loops forever → it halts (contradiction again).
      This self-referencing logic proves that no such universal halts() method can exist, even in Java.*/
}


