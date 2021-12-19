package midExams.midExamRetake12082020_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class theLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        List<Integer> liftSeatsList = Arrays.stream
                        (scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        for (int i = 0; i < liftSeatsList.size(); i++) {

            int wagonSeats = liftSeatsList.get(i);

            int freeSeats = 4 - wagonSeats;


            if (numPeople > 4) {

                liftSeatsList.set(i, freeSeats + liftSeatsList.get(i));
                numPeople -= freeSeats;
            } else {
                liftSeatsList.set(i, numPeople);
                numPeople -= numPeople;
            }


        }
        int sum = 0;
        int count = 0;

        for (int seats : liftSeatsList) {
            count++;
            sum += seats;
        }

        int fullLift = count * 4;

        if (numPeople < 1 && fullLift > sum) {
            System.out.println("The lift has empty spots!");

        }else {
            System.out.printf("There isn't enough space! %d people in a queue!\n",numPeople);

        }
        System.out.println(liftSeatsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
