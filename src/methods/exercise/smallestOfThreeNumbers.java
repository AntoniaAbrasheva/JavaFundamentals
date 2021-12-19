package methods.exercise;

import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());


        System.out.println(smallestNumber(firstNum,secondNum,thirdNum));
    }

    public static int smallestNumber(int firstNum, int secondNum, int thirdNum) {

        int minNum = 0;

        if (firstNum <= secondNum && firstNum <= thirdNum) {
            minNum = firstNum;
        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            minNum = secondNum;
        } else if (thirdNum <= firstNum && thirdNum <= secondNum) {
            minNum = thirdNum;
        }

        return minNum;
    }
}

