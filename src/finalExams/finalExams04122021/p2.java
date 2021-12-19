package finalExams.finalExams04122021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

String regex = "(#|\\|)(?<itemName>[A-Za-z]+\\s?[A-Za-z]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);



        List<String> productList = new ArrayList<>();
        int totalCalories = 0;
        int countDays = 0;

        while (matcher.find()) {
            String productName = matcher.group("itemName");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            productList.add(String.format("Item: %s, Best before: %s, Nutrition: %d\n",
                    productName,date,calories));

            totalCalories += calories;
        }
        countDays = totalCalories / 2000;

        System.out.printf("You have food to last you for: %d days!\n",countDays);

        for (String product : productList) {
            System.out.println(product);
        }


        }

    }

