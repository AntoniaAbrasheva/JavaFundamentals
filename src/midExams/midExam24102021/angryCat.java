package midExams.midExam24102021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class angryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItem = scanner.nextLine();

        int leftSum = 0;
        int rightSum = 0;

        int catPositionDamage = list.get(entryPoint);


        if (typeOfItem.equals("cheap")) {
            if (entryPoint > 0) {
                for (int i = list.size() - 1; i > 0; i--) {
                    if (list.get(i) < catPositionDamage) {
                        leftSum += list.get(i);
                    }


                }
            }
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i) < catPositionDamage) {
                    rightSum += list.get(i);
                }

            }

        }






    }
}
