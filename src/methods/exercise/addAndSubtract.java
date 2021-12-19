package methods.exercise;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        subtractSumNum1AndNum2FromNum3(num1,num2,num3);

    }



    private static void subtractSumNum1AndNum2FromNum3 (int num1, int num2,int num3) {

        System.out.println((num1 + num2) - num3);
    }
}


