package gr.aueb.cf.week2;

/**
 * Chapter: 4. Char-for-switch
 * Exercise: 2
 * This program prints 10 lines
 * filled with 10 stars
 * @author reyke
 */

public class ChapterFourExerciseTwo {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
