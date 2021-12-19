package midExams.midExam_05;

import java.util.Scanner;

public class bonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());
        int numLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = Double.MIN_VALUE;
        int currentAttendance = 0;


        for (int i = 0; i < numStudents; i++) {

            int studentAttendance = Integer.parseInt(scanner.nextLine());

            double totalBonus = studentAttendance * 1.0 / numLectures * (5 + additionalBonus);

            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                currentAttendance = studentAttendance;
            }

        }
        System.out.printf("Max Bonus: %.0f.\n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", currentAttendance);

    }
}



