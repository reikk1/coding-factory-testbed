package gr.aueb.cf.week2;

import java.util.Scanner;

/**
 * Chapter: 3. Boolean_While_doWhile_If
 * Exercise: 1
 * This program reads from the user a year and
 * calculates if it is leap or not, then
 * it prints the result
 * @author reyke
 */

public class ChapterThreeExerciseOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputYear = 0;
        boolean leapYear = false;
        int check = 0;
        int count = 0;

        System.out.println("Please provide a 4-digit year");
        inputYear = in.nextInt();
        check = inputYear;

        do {
            check = check / 10;
            count++;
        } while (check != 0);

        while (count != 4) {
            System.out.println("Invalid input, please insert a 4-digit year");
            inputYear = in.nextInt();
            check = inputYear;
            count = 0;
            do {
                check = check / 10;
                count++;
            } while (check != 0);
        }

        if ((inputYear % 4 == 0) && (inputYear % 100 != 0)) {
            leapYear = true;
        } else if ((inputYear % 4 == 0) && (inputYear % 100 == 0) && (inputYear % 400 == 0)) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        System.out.printf("Year %d is %s", inputYear, (leapYear) ? "leap" : "not leap");
        in.close();
    }
}