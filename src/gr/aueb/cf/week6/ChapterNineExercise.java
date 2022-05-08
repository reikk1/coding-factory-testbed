package gr.aueb.cf.week6;

import java.io.*;

/**
 * Chapter: 9. JavaIO
 * Mini Exercise
 * @author reyke
 */

public class ChapterNineExercise {

    public static void main(String[] args) throws IOException {
        File inFile = new File("C:/Users/reyke/OneDrive/Desktop/Reskilling/Coding Factory/Java/1. pre-Easter (week 1-6)/Week 6/week6_Exercise_ReiKerma/grades.txt");
        File outFile = new File("C:/Users/reyke/OneDrive/Desktop/Reskilling/Coding Factory/Java/1. pre-Easter (week 1-6)/Week 6/week6_Exercise_ReiKerma/printOut.txt");
        File logFile = new File ("C:/Users/reyke/OneDrive/Desktop/Reskilling/Coding Factory/Java/1. pre-Easter (week 1-6)/Week 6/week6_Exercise_ReiKerma/log.txt");

        BufferedReader br = new BufferedReader(new FileReader(inFile));
        PrintStream psOut = new PrintStream(outFile);
        PrintStream psLog = new PrintStream(logFile);

        String line;

        while ((line = br.readLine()) != null) {
            double average = 0;
            int grade1 = 0;
            int grade2 = 0;

            String[] str = line.split(" +");

            try {
                grade1 = Integer.parseInt(str[2]);
                grade2 = Integer.parseInt(str[3]);
            } catch (NumberFormatException e) {
                System.out.println("Wrong file format in grades section");
                break;
            }

            if ((grade1 >= 0 && grade1 <= 10) && (grade2 >= 0 && grade2 <= 10)) {
                average = (double) (grade1 + grade2) / 2;
                psOut.print(str[0] + " " + str[1] + " " + average + "\n");
            } else {
                psLog.print(str[0] + " " + str[1] + " " + str[2] + " " + str[3] + "\n");
            }
        }
    }

}
