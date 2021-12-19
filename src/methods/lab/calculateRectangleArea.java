package methods.lab;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int area = rectangleArea(scanner);

        System.out.println(area);


    }

    public static int rectangleArea(Scanner scanner) {

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        return width * length;

    }

}


