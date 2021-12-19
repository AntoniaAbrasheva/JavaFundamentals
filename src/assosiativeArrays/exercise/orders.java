package assosiativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,Integer> productInfo = new LinkedHashMap<>();
        Map<String,Double> productPrice = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] products = input.split(" ");
            String productName = products[0];
            double price = Double.parseDouble(products[1]);
            int quantity = Integer.parseInt(products[2]);

            productPrice.put(productName,price);

            if (!productInfo.containsKey(productName)) {
                productInfo.put(productName,quantity);

            } else {
                int currentQuantity = productInfo.get(productName);
                productInfo.put(productName,currentQuantity + quantity);

            }


            input =scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            String productName = entry.getKey();
            double totalPrice = entry.getValue() * productInfo.get(productName);
            System.out.printf("%s -> %.2f\n",productName,totalPrice);
        }


    }
}


