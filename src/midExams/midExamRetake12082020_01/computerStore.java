package midExams.midExamRetake12082020_01;

import java.util.Scanner;

public class computerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();

        double sumWithoutTax = 0;

        while (!command.equals("special") && !command.equals("regular")) {

            double currentPrice = Double.parseDouble(command);
            if (currentPrice > 0) {
                sumWithoutTax += currentPrice;
            } else if (currentPrice < 0) {
                System.out.println("Invalid price!");

            }


            command = scanner.nextLine();
        }
        double taxes = sumWithoutTax * 0.2;
        double totalPrice = sumWithoutTax + taxes;

        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        }

        if (command.equals("special")) {
            totalPrice *= 0.9;
        }

        if (totalPrice > 0) {

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", sumWithoutTax);
            System.out.printf("Taxes: %.2f$\n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$\n", totalPrice);
        }
    }
}


