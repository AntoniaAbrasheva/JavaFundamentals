package midExams.midExam29022020_04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> productsList = Arrays.stream(scanner.nextLine().split("\\!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {

            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());


            String firstItem = commandLine.get(0);

            switch (firstItem) {
                case "Urgent":
                    String productToAdd = commandLine.get(1);
                    if (!productsList.contains(productToAdd)) {
                        productsList.add(0,productToAdd);

                    }
                    break;

                case "Unnecessary":
                    String removeProduct = commandLine.get(1);

                    productsList.remove(removeProduct);

                    break;

                case "Correct":
                    String oldEProduct = commandLine.get(1);
                    String newProduct = commandLine.get(2);
                    for (int i = 0; i < productsList.size() ; i++) {

                        if (productsList.get(i).equals(oldEProduct)) {
                            productsList.set(i,newProduct);
                        }
                    }
                    break;

                case "Rearrange":

                    String itemToRearrange = commandLine.get(1);

                    if (productsList.contains(itemToRearrange)) {
                        productsList.remove(itemToRearrange);
                        productsList.add(itemToRearrange);
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.print(String.join(", ",productsList));


    }
}



