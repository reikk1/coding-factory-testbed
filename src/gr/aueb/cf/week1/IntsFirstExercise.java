package gr.aueb.cf.week1;

import java.util.Scanner;

/**
 * This is the first exercise
 * Module: Integers
 * This program takes oF temperature value from the user and
 * turns it to oC temperature - then it prints the result
 */

public class IntsFirstExercise {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int oFTemp = 0;
        int oCTemp = 0;

        System.out.println("Please insert the Fahrenheit temperature:");
        oFTemp = in.nextInt();

        oCTemp = 5 * (oFTemp  - 32) / 9;

        System.out.printf("The Fahrenheit temperature of %d is approximately %d " +
                "in Celsius", oFTemp, oCTemp);
    }

}
