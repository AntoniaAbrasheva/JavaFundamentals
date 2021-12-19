package midExams.midExam05072020_02;

import java.util.*;
import java.util.stream.Collectors;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        double sum = 0;

        List<Integer> currentList = new ArrayList<>();


        for (int i = 0; i < numList.size(); i++) {

            int currentNum = numList.get(i);
            sum += currentNum;
        }
        double averageSum = sum / numList.size();


        for (int i = 0; i < numList.size(); i++) {

            int number = numList.get(i);

            if (number > averageSum) {
                currentList.add(number);


            }

        }
        Collections.sort(currentList);
        Collections.reverse(currentList);

        if (currentList.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(currentList.get(i) + " ");

            }

        } else if (currentList.isEmpty()) {
            System.out.println("No");
        } else {


            System.out.println(currentList.toString().replaceAll("[\\[\\],]", ""));


        }
    }
}


