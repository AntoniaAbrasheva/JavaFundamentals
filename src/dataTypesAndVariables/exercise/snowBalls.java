package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class snowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxSnowball = Double.MIN_VALUE;
        int snowBallSnow = 0;
        int snowBallTime = 0;
        int snowBallQuality = 0;


        for (int i = 1; i <= n; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());


            double snowballValue = Math.pow(1.0 * snowballSnow / snowballTime,snowballQuality);

            if (snowballValue > maxSnowball) {
                maxSnowball = snowballValue;
                snowBallSnow = snowballSnow;
                snowBallTime = snowballTime;
                snowBallQuality = snowballQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",
                snowBallSnow,snowBallTime,maxSnowball,snowBallQuality);
    }
}


