package gr.aueb.cf.week3;

import java.util.Scanner;

/**
 * Chapter: 6. Arrays
 * Exercise: 1
 * This program reads a table from the user with scanner
 * representing the ages of a class
 * then it rearranges the table
 * and provides the second lower value
 * @author reyke
 */

public class ChapterSixExercise {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] ages = new int[6];

        fillArray(ages);

        System.out.println("Your table is the following:");
        printArray(ages);

        rearrangeArray(ages);

        System.out.println("Reorganized table is the following:");
        printArray(ages);

        System.out.printf("Second lowest value in your table is: %d", ages[1]);
    }

    public static void fillArray (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please insert the age of student #" + (i+1));
            arr[i] = in.nextInt();
        }
    }

    public static void printArray (int arr[]) {
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }

    public static void rearrangeArray (int arr[]) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
