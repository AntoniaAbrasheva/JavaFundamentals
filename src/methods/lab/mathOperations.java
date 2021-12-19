package methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println(df.format(calculateFirstNumAndSecondNum(firstNum,operator,secondNum)));
    }






    public static double calculateFirstNumAndSecondNum (int firstNum, String operator, int secondNum) {

        int result = 0;

        switch (operator) {

            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;

        }

        return result;
    }
}








