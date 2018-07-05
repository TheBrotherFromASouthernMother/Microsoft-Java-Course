package DEV276x;

import java.util.*;

public class OddOrEven {
    private static Scanner input = new Scanner(System.in);

    private static void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    private static String initGame() {
        String userChoice = "";
        while (!userChoice.contains("e") && !userChoice.contains("o")) {
            printDashes(25);
            System.out.println("Let’s play a \"game\" called Odds and Evens");
            System.out.print("what's your name? ");
            String userName = input.nextLine();
            System.out.print("Greetings " + userName + " which do you choose? (O)dds or (E)vens? ");
            userChoice = input.nextLine().toLowerCase();

            if (userChoice.equals("o")) {
                System.out.println(userName + " has picked odds! The computer will be evens. ");
            } else if (userChoice.equals("e")) {
                System.out.println(userName + " has picked evens! The computer will be odss. ");
            }
            printDashes(25);
        }
        return userChoice;
    }
    // decided to implement modulo because I M*****fing can
    private static int modulo (int dividend, int divisor) {
        int accumlator = 0;
        for (int i = 0; i <= dividend; i += divisor ) {
            accumlator += divisor;
        }
        return dividend - accumlator;
    }

    private static String runGame(String userChoice) {
        System.out.print("How many fingers are you holding out?");
        int userFingers = input.nextInt();
        Random rand = new Random();
        int computerFingers = rand.nextInt(6);
        System.out.println("The computer has played " + computerFingers + " fingers");
        printDashes(25);
        int sum = computerFingers + userFingers;
        System.out.println(userFingers + " + " + computerFingers + " = " + sum);

        if (modulo(sum, 2) == 0) {
            System.out.println(sum + " is even");
            if (userChoice.equals("o")) {
                return "computer victory";
            } else {
                return "user victory";
            }
        } else {
            System.out.println(sum + " is odd");
            if (userChoice.equals("e") ) {
                return "computer victory";
            } else {
                return "user victory";
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(Math.random() * 10);
        String userAnswer = initGame();
        String result = runGame(userAnswer);
        System.out.println(result);
        printDashes(25);


    }
}
