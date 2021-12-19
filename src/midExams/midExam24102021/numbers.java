package midExams.midExam24102021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String[] commandLine = command.split(" ");
            String firstElement = commandLine[0];

            switch (firstElement) {
                case "Add":
                    int addValue = Integer.parseInt(commandLine[1]);
                    numList.add(addValue);
                    break;
                case "Remove":
                    int removeValue = Integer.parseInt(commandLine[1]);

                    for (int i = 0; i <= numList.size() - 1; i++) {
                        int currentValue = numList.get(i);

                        if (currentValue == removeValue) {
                            numList.remove(numList.get(i));
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int replaceValue = Integer.parseInt(commandLine[1]);
                    int replacement = Integer.parseInt(commandLine[2]);

                    for (int i = 0; i <= numList.size() - 1; i++) {
                        int currentItem = numList.get(i);


                        if (currentItem == replaceValue) {
                            numList.set(i, replacement);

                            break;
                        }

                    }
                    break;
                case "Collapse":
                    int collapseValue = Integer.parseInt(commandLine[1]);



                    for (int i = 0; i <= numList.size() - 1; i++) {


                        if (numList.get(i) < collapseValue) {
                            numList.remove(i);

                            i = -1;
                        }


                    }
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));

    }
}


