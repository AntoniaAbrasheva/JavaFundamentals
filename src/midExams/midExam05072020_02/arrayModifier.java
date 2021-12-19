package midExams.midExam05072020_02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();



        while(!command.equals("end")) {

            String [] commandLine = command.split(" ");
            String firstElement = commandLine[0];

            switch (firstElement) {
                case "swap":
                    int swapIndex1 = Integer.parseInt(commandLine[1]);
                    int swapIndex2 = Integer.parseInt(commandLine[2]);

                    int firstItem = numList.get(swapIndex1);
                    int secondItem = numList.get(swapIndex2);
                    numList.set(swapIndex1, secondItem);
                    numList.set(swapIndex2,firstItem);


                    break;
                case "multiply":
                    int multiplyIndex1 = Integer.parseInt(commandLine[1]);
                    int multiplyIndex2 = Integer.parseInt(commandLine[2]);
                    int result = numList.get(multiplyIndex1) * numList.get(multiplyIndex2);

                    numList.set(multiplyIndex1,result);
                    break;

                case "decrease":
                    for (int i = 0; i < numList.size(); i++) {

                        int currentItem = numList.get(i);
                        currentItem -= 1;
                        numList.set(i,currentItem);

                    }

                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println(numList.toString()
                .replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll("\\s+", " "));
    }
}


