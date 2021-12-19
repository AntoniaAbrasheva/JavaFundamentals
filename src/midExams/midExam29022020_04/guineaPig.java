package midExams.midExam29022020_04;

import java.util.Scanner;

public class guineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodInKg = Double.parseDouble(scanner.nextLine());
        double hayInKg = Double.parseDouble(scanner.nextLine());
        double coverInKg = Double.parseDouble(scanner.nextLine());
        double weightInKg = Double.parseDouble(scanner.nextLine());

        double foodInGr = foodInKg * 1000;
        double hayInGr = hayInKg * 1000;
        double coverInGr = coverInKg * 1000;
        double weightInGr = weightInKg * 1000;

        int countDays = 0;
        boolean isEnough = true;

        for (int i = 1; i <= 30; i++) {
            countDays++;

            foodInGr -= 300;

            if (countDays % 2 == 0) {
               double neededHay = foodInGr * 0.05;
               hayInGr -= neededHay;

            }
            if (countDays % 3 == 0) {
                double neededCover = weightInGr / 3;
                coverInGr -= neededCover;
            }

            if (foodInGr < 300 || hayInGr < foodInGr * 0.05 || coverInGr < weightInGr / 3) {
               isEnough = false;
                break;
            }


        }
        if (isEnough) {
            System.out.printf("Everything is fine! Puppy is happy! " +
                            "Food: %.2f, Hay: %.2f, Cover: %.2f.\n",
                    foodInGr / 1000, hayInGr / 1000, coverInGr / 1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }

    }
}
