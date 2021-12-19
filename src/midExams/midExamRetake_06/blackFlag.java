package midExams.midExamRetake_06;

import java.util.Scanner;

public class blackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfPlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double allPlunder = 0;

        for (int i = 1; i <= daysOfPlunder; i++) {
            allPlunder += dailyPlunder;

            if (i % 3 ==0) {
                allPlunder += dailyPlunder * 0.5;
            }
            if (i % 5 == 0) {
                allPlunder *= 0.7;
            }


        }
        if (allPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.",allPlunder);

        } else {
            double percentage = (allPlunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.",percentage);
        }
    }
}
