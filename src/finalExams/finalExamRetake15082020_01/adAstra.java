package finalExams.finalExamRetake15082020_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class adAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#|])(?<itemName>[A-Z]+[a-z]+[\\s]?[\\w]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1");

        Matcher matcher = pattern.matcher(input);

        List<String> products = new ArrayList<>();

        int totalCalories = 0;
        int days = 0;

        while (matcher.find()) {

            String itemName = matcher.group("itemName");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            products.add(String.format("Item: %s, Best before: %s, Nutrition: %s", itemName, date, calories));

            totalCalories += calories;

        }

        days = totalCalories / 2000;

        System.out.printf("You have food to last you for: %d days!\n",days);

        for (String product : products) {
            System.out.println(product);
        }








    }
}
