package basicSyntaxConditionalStatementsAndLoops.moreExercise;

import java.util.Scanner;

public class gamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double price = 0;
        double moneySpent = 0;


        while (!input.equals("Game Time")) {
            String game = input;


            if (balance == 0) {
                System.out.println("Out of money!");
                break;
            }


            switch (game) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }


            if (balance >= price && price > 0) {

                balance -= price;
                moneySpent += price;
                System.out.printf("Bought %s\n", game);
            } else if (balance < price && price > 0) {
                System.out.println("Too Expensive");
            }

            input = scanner.nextLine();
        }

        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneySpent, balance);

        }
    }
}


