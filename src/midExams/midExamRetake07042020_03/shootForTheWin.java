package midExams.midExamRetake07042020_03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        int shotTargetsCount = 0;
        while (!input.equals("End")) {
            int index = Integer.parseInt(input);

            if (index >= 0 && index <= numList.size() - 1) {

                int currentTarget = numList.get(index);

                if (currentTarget != -1) {
                    numList.set(index, -1);
                    shotTargetsCount++;


                    for (int i = 0; i < numList.size(); i++) {
                        int currentNum = numList.get(i);


                        if (currentNum == -1) {
                            continue;
                        } else if (currentNum > currentTarget) {
                            numList.set(i, currentNum - currentTarget);

                        } else if (currentNum <= currentTarget) {
                            numList.set(i, currentNum + currentTarget);
                        }

                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ",shotTargetsCount);
        System.out.print(numList.toString().replaceAll("[\\[\\],]",""));

    }
}
