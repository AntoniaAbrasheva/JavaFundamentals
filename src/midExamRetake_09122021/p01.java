package midExamRetake_09122021;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sizeOfSide = Double.parseDouble(scanner.nextLine());
        int numberOfSheets = Integer.parseInt(scanner.nextLine());

        double sumArea = 0;

        for (int i = 1; i <= numberOfSheets; i++) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());

            double sheetArea = length * width;



            if (i % 5 == 0) {
                continue;
            } else  if (i % 3 == 0) {
                sheetArea *= 0.75;
            }
            sumArea += sheetArea;


        }
        double boxArea = sizeOfSide * sizeOfSide * 6;

        double totalCoveredArea = (sumArea / boxArea) * 100;
        double needToCover = 100 - totalCoveredArea;
        double leftPaper = ((sumArea - boxArea) / sumArea) * 100;

        if (boxArea > sumArea) {
            System.out.printf("You are out of paper!\n" +
                    " %.2f%% of the box is not covered.",needToCover);
        } else if (boxArea <= sumArea) {
            System.out.printf("You've covered the gift box!\n" +
                    " %.2f%% wrap paper left.",leftPaper);
        }
    }
}
