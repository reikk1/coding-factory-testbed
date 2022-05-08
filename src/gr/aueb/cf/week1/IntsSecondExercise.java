package gr.aueb.cf.week1;

import java.util.Scanner;

/**
 * This is the second exercise
 * Module: Integers
 * It takes 3 integers from the user representing
 * their date of birth and prints the result formatted
 */

public class IntsSecondExercise {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("\nPlease insert your date of birth in numbers (e.g. if you are " +
                "born in 12th of November 1997, insert 12 11 1997 and press enter)");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("\nYour date of birth is: %02d/%02d/%04d\n", day, month, year);

    }

}
