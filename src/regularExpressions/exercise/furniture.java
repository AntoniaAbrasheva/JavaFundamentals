package regularExpressions.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);


        List<String> furnitureList = new ArrayList<>();

        double totalSum = 0;

        while (!text.equals("Purchase")) {


            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                furnitureList.add(matcher.group("furniture"));

                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                totalSum += price * quantity;
            }


            text = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalSum);
    }
}


