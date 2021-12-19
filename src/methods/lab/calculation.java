package methods.lab;

import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String calculation = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());


        if (calculation.equals("add")) {
            add(calculation,a,b);
        } else if (calculation.equals("subtract")) {
            subtract(calculation,a,b);
        } else if (calculation.equals("multiply")) {
            multiply(calculation,a,b);
        } else if (calculation.equals("divide")) {
            divide(calculation,a,b);
        }



    }

    public static void add (String calculation, int a, int b) {

        System.out.println(a + b);
    }

    public static void subtract (String calculation, int a, int b) {

        System.out.println(a - b);
    }

    public static void multiply (String calculation, int a, int b) {

        System.out.println(a * b);
    }

    public static void divide (String calculation, int a, int b) {

        System.out.println(a / b);

    }
}


