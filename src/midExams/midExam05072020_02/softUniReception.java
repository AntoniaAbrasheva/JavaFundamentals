package midExams.midExam05072020_02;

import java.util.Scanner;

public class softUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int allEmployeesAnswersPerHour = firstEmployeeEfficiency + secondEmployeeEfficiency
                                   + thirdEmployeeEfficiency;


        int countHours = 0;

        while (studentsCount > 0) {

            countHours++;

            if (countHours % 4 == 0) {
                continue;
            } else {
                studentsCount -= allEmployeesAnswersPerHour;

            }




        }
        System.out.printf("Time needed: %dh.",countHours);




    }
}
