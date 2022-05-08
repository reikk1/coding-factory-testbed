package gr.aueb.cf.week5;

import java.util.Scanner;

/**
 * Chapter: 7. Strings
 * Exercise
 * This program takes a string from the user
 * encrypts it with +1 value in ASCII table
 * then decrypts it back to original
 * @author reyke
 */

public class ChapterSevenExercise {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        StringBuilder encryptedStr = new StringBuilder();
        StringBuilder decryptedStr = new StringBuilder();

        s = readString();

        int[] ascArr = new int[s.length()];

        System.out.println("Your string is: " + s);

        ascArr = convertStrToAsc(s);

        encryptAscArr(ascArr);
        encryptedStr = convertAscToStr(ascArr);

        System.out.println("Your encrypted string is: " + encryptedStr);

        decryptAscArr(ascArr);
        decryptedStr = convertAscToStr(ascArr);

        System.out.println("Your decrypted string is: " + decryptedStr);

        in.close();
    }

    public static int[] convertStrToAsc (String s) {
        int[] arrOut = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arrOut[i] = (int) s.charAt(i);
        }
        return arrOut;
    }

    public static StringBuilder convertAscToStr (int[] arr) {
        StringBuilder sbOut = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sbOut.append( (char) arr[i] );
        }
        return sbOut;
    }

    public static void encryptAscArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static void decryptAscArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]--;
        }
    }

    public static String readString () {
        String sOut;
        System.out.println("Please provide your string:");
        sOut = in.nextLine();
        return sOut;
    }

}
