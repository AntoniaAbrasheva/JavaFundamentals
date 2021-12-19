package midExams.midExamExercise;

import java.util.*;
import java.util.stream.Collectors;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                          .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> greaterNumList = new ArrayList<>();

        double sum = 0;

        for (int i = 0; i < numList.size(); i++) {
            int currentNum = numList.get(i);
            sum += currentNum;

        }
        double average = sum / numList.size();

        for (int number : numList) {
            if (number > average) {
                greaterNumList.add(number);
            }

        }

        Collections.sort(greaterNumList);
        Collections.reverse(greaterNumList);

        if (greaterNumList.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(greaterNumList.get(i) + " ");

            }

        } else if (greaterNumList.isEmpty()) {
            System.out.println("No");
        } else {


            System.out.println(greaterNumList.toString().replaceAll("[\\[\\],]", ""));


        }
    }
}
