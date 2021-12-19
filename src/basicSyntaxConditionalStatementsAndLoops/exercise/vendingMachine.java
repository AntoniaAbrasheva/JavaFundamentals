package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        double allCoins = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);


            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                allCoins += coins;
            } else {

                System.out.printf("Cannot accept %.2f\n", coins);

            }

            input = scanner.nextLine();
        }


        String order = scanner.nextLine();

        while (!order.equals("End")) {
            String product = input;


            switch (order) {
                case "Nuts": {
                    if (allCoins >= 2.00) {
                        allCoins -= 2.00;
                        System.out.println("Purchased " + order);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                }
                case "Water": {
                    if (allCoins >= 0.70) {
                        allCoins -= 0.70;
                        System.out.println("Purchased " + order);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                }
                case "Crisps": {
                    if (allCoins >= 1.50) {
                        allCoins -= 1.50;
                        System.out.println("Purchased " + order);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                }
                case "Soda": {
                    if (allCoins >= 0.80) {
                        allCoins -= 0.80;
                        System.out.println("Purchased " + order);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                }
                case "Coke": {
                    if (allCoins >= 1.00) {
                        allCoins -= 1.00;
                        System.out.println("Purchased " + order);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                }
                default:
                    System.out.println("Invalid product");
            }


            order = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", allCoins);


    }
}


