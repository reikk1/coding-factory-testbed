package gr.aueb.cf.week5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Chapter: 8. Exceptions
 * Exercise
 * This program prints a menu getting input from user
 * checking for InputMismatchException using relevant method
 * @author reyke
 */

public class ChapterEightExercise {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int userInput;

        while (true) {

            System.out.println("Διαλέξτε μία επιλογή, με βάση τα παρακάτω: ");
            printMenu();

            try {
                userInput = getUserInput();
                if (userInput > 5 || userInput < 1)
                    System.out.printf("Η Επιλογή %d δεν είναι έγκυρη\n", userInput);
                if (userInput == 5) {
                    System.out.println("Αντίο!");
                    in.close();
                    break;
                } else
                    System.out.println("Διαλέξατε την Επιλογή " + userInput + "\n");
            } catch (InputMismatchException e) {
                System.out.println("Μή έγκυρη επιλογή, δοκιμάστε ξανά" + "\n");
                in.nextLine();
            }

        }
    }

    public static void printMenu() {
        System.out.println("1. Επιλογή 1");
        System.out.println("2. Επιλογή 2");
        System.out.println("3. Επιλογή 3");
        System.out.println("4. Επιλογή 4");
        System.out.println("5. Έξοδος");
    }

    public static int getUserInput () {
        int userInput;
        try {
            userInput = in.nextInt();
            return userInput;
        } catch (InputMismatchException e) {
            e.printStackTrace();
            throw e;
        }
    }

}
