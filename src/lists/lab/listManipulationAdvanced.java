package lists.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNum = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String command = commandLine.get(0);

            switch (command) {
                case "Contains":
                    int containsNum = Integer.parseInt(commandLine.get(1));

                    if (listNum.contains(containsNum)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":

                    String evenNum = commandLine.get(1);
                    if (evenNum.equals("even")) {

                        for (Integer item : listNum) {
                            if (item % 2 == 0) {
                                System.out.print(item + " ");
                            }

                        }
                        System.out.println();
                    } else {
                        for (Integer item : listNum) {
                            if (item % 2 != 0) {
                                System.out.print(item + " ");
                            }

                        }
                        System.out.println();
                    }


                    break;

                case "Get":
                    String getSum = commandLine.get(1);
                    int sum = 0;

                    for (Integer item : listNum) {

                        sum += item;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandLine.get(1);
                    int filterNum = Integer.parseInt(commandLine.get(2));

                    System.out.println(joinElementsByDelimiter(getConditionalNumbers(listNum,condition,filterNum), " "));



                    break;
            }
            input = scanner.nextLine();
        }



    }
    public static List<Integer> getConditionalNumbers(List<Integer> initList,String condition,int number) {

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < initList.size(); i++) {

            int currentNum = initList.get(i);

            if (condition.equals("<")) {

                if (currentNum < number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">")) {

                if (currentNum > number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">=")) {

                if (currentNum >= number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals("<=")) {

                if (currentNum <= number) {
                    resultList.add(currentNum);
                }
            }

        }
        return resultList;
    }
    public static String joinElementsByDelimiter(List<Integer> itemList,String delimiter) {

        String output = "";

        for (Integer item : itemList) {

            DecimalFormat df = new DecimalFormat("0.#");
            String numDf = df.format(item) + delimiter;
            output += numDf;

        }
        return output;
    }
}



