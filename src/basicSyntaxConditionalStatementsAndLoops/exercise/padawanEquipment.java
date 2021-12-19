package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());



        double totalPrice = Math.ceil((studentsCount + 0.1 * studentsCount)) * lightPrice +
                (robesPrice * studentsCount)
                + (beltsPrice * (studentsCount - studentsCount / 6));


        if (totalPrice <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice - amountOfMoney);
        }



    }
}


