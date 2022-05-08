package gr.aueb.cf.week2;

import java.util.Scanner;

/**
 * Chapter: 3. Boolean_While_doWhile_If
 * Exercise: 2
 * This program reads prints a menu in a loop
 * until user decides to exit. Each time it prints
 * user's choice
 * @author reyke
 */

public class ChapterThreeExerciseTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = 0;

        do{
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            System.out.println("Παρακαλώ εισάγετε τον αριθμό εντολής, όπως αναφέροντε παραπάνω");
            userInput = in.nextInt();

            if (userInput == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (userInput == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (userInput == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (userInput == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (userInput == 5) {
                System.out.println("Επιλέξατε Έξοδος -- Αντίο");
            } else {
                System.out.println("Δεν υπάρχει αυτή η εντολή, παρακαλώ εισάγετε ξανά");
                // Not sure if I should give the user the menu to choose again in this case. I assume that this should do so. Hence, the while condition below.
            }
        } while ((userInput != 5) || (userInput <= 0) || (userInput > 5));

        in.close();
    }
}