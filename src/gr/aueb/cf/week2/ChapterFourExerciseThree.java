package gr.aueb.cf.week2;

/**
 * Chapter: 4. Char-for-switch
 * Exercise: 3
 * This program prints 10 lines with the first line having
 * one star and each additional line with one additional star
 * @author reyke
 */

public class ChapterFourExerciseThree {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1:
                    System.out.print("*");
                    break;
                case 2:
                    for (int j = 1; j <= 2; j++) {
                        System.out.print("*");
                    } break;
                case 3:
                    for (int j = 1; j <= 3; j++) {
                        System.out.print("*");
                    } break;
                case 4:
                    for (int j = 1; j <= 4; j++) {
                        System.out.print("*");
                    } break;
                case 5:
                    for (int j = 1; j <= 5; j++) {
                        System.out.print("*");
                    } break;
                case 6:
                    for (int j = 1; j <= 6; j++) {
                        System.out.print("*");
                    } break;
                case 7:
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*");
                    } break;
                case 8:
                    for (int j = 1; j <= 8; j++) {
                        System.out.print("*");
                    } break;
                case 9:
                    for (int j = 1; j <= 9; j++) {
                        System.out.print("*");
                    } break;
                case 10:
                    for (int j = 1; j <= 10; j++) {
                        System.out.print("*");
                    } break;
            }
            System.out.println();
        }
    }
}
