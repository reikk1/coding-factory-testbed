package gr.aueb.cf.week3;

/**
 * Chapter: 5. Float-Double & Structured Programming
 * Exercise: 1
 * @author reyke
 */

import java.util.Scanner;

public class ChapterFiveExercise {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        runTheApp();
    }

    public static void printMenu () {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static int getUserOption () {
        int userOption = 0;
        System.out.println("Δώσε επιλογή:");
        userOption = in.nextInt();
        return userOption;
    }

    public static int getUserInput () {
        int userInput = 0;
        System.out.println("Πόσο θα ειναι το n?");
        userInput = in.nextInt();
        return userInput;
    }

    public static void runOptionOne (int userInput) {
        for (int i = 1; i <= userInput; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void runOptionTwo (int userInput) {
        for (int i = 1; i <= userInput; i++) {
            System.out.println("*");
        }
    }

    public static void runOptionThree (int userInput) {
        for (int i = 1; i <= userInput; i++) {
            runOptionOne(userInput);
        }
    }

    public static void runOptionFour (int userInput) {
        for (int i = 1; i <= userInput; i++) {
            runOptionOne(i);
        }
    }

    public static void runOptionFive (int userInput) {
        for (int i = userInput; i >= 1; i--){
            runOptionOne(i);
        }
    }

    public static void runTheApp () {
        int userOption = 0;
        int userInput = 0;

        do {

            printMenu();

            userOption = getUserOption();

            while (userOption < 1 || userOption >6) {
                System.out.println("Δεν υπάρχει αυτή η επιλογή");
                userOption = getUserOption();
            }

            if (userOption == 6) {
                System.out.println("Asta lavista, baby!");
                break;
            }

            userInput = getUserInput();

            switch (userOption) {
                case 1:
                    runOptionOne(userInput);
                    break;
                case 2:
                    runOptionTwo(userInput);
                    break;
                case 3:
                    runOptionThree(userInput);
                    break;
                case 4:
                    runOptionFour(userInput);
                    break;
                case 5:
                    runOptionFive(userInput);
                    break;
            }

        } while (true);
    }

}
