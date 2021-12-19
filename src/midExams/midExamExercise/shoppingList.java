package midExams.midExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productList = Arrays.stream(scanner.nextLine().split("\\!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "Urgent":
                    String item = commandLine[1];

                    if (!productList.contains(item)) {
                        productList.add(0,item);
                    }
                    break;
                case "Unnecessary":
                    String itemToRemove = commandLine[1];

                    if (productList.contains(itemToRemove)) {
                        productList.remove(itemToRemove);
                    }
                    break;
                case "Correct":
                    String oldItem = commandLine[1];
                    String newItem = commandLine[2];

                    if (productList.contains(oldItem)) {
                        for (int i = 0; i < productList.size(); i++) {
                            String currentProduct = productList.get(i);

                            if (currentProduct.equals(oldItem)) {
                                productList.set(i,newItem);

                            }

                        }
                    }
                    break;
                case "Rearrange":
                    String rearrangeItem = commandLine[1];

                    if (productList.contains(rearrangeItem)) {
                        productList.remove(rearrangeItem);
                        productList.add(rearrangeItem);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.print(String.join(", ",productList));

    }
}
