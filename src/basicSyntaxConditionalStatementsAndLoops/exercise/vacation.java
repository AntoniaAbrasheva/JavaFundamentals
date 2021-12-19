package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int groupOfPeople = Integer.parseInt(scanner.nextLine());
            String typeOfGroup = scanner.nextLine();
            String dayOfWeek = scanner.nextLine();

            double price = 0;

            switch (dayOfWeek) {
                case "Friday":
                    if (typeOfGroup.equals("Students")) {
                        price = 8.45;
                    } else if (typeOfGroup.equals("Business")) {
                        price = 10.90;
                    } else if (typeOfGroup.equals("Regular")) {
                        price = 15;
                    }
                    break;
                case "Saturday":
                    if (typeOfGroup.equals("Students")) {
                        price = 9.80;
                    } else if (typeOfGroup.equals("Business")) {
                        price = 15.60;
                    } else if (typeOfGroup.equals("Regular")) {
                        price = 20;
                    }
                    break;
                case "Sunday":
                    if (typeOfGroup.equals("Students")) {
                        price = 10.46;
                    } else if (typeOfGroup.equals("Business")) {
                        price = 16;
                    } else if (typeOfGroup.equals("Regular")) {
                        price = 22.50;
                    }
                    break;
            }
            double totalPrice = price * groupOfPeople;

            if (typeOfGroup.equals("Students") && groupOfPeople >= 30) {
                totalPrice *= 0.85;
            } else if (typeOfGroup.equals("Business") && groupOfPeople >=100) {
                totalPrice = (groupOfPeople - 10) * price;
            } else if (typeOfGroup.equals("Regular") && groupOfPeople >= 10
                    && groupOfPeople <= 20) {
                totalPrice *= 0.95;

            }
            System.out.printf("Total price: %.2f",totalPrice);
        }
    }
