package midExams.midExam24102021;

import java.util.Scanner;

public class burgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCities = Integer.parseInt(scanner.nextLine());

        double totalEarned = 0;

        int count = 0;

        for (int i = 1; i <= numCities; i++) {
            count++;
            String nameOfCity = scanner.nextLine();
            double ownerIncome = Double.parseDouble(scanner.nextLine());
            double ownerExpenses = Double.parseDouble(scanner.nextLine());

            if (count % 5 == 0) {
                ownerIncome = ownerIncome - ownerIncome * 0.1;
            } else if (count % 3 == 0) {
                ownerExpenses = ownerExpenses + (ownerExpenses * 0.5);
            }



            double burgerBusEarned = ownerIncome - ownerExpenses;


            totalEarned += burgerBusEarned;

            System.out.printf("In %s Burger Bus earned %.2f leva.\n",nameOfCity,burgerBusEarned);


        }

        System.out.printf("Burger Bus total profit: %.2f leva.",totalEarned);




    }
}


