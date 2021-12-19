package arrays.lab;

import java.util.Scanner;

    public class dayOfWeek {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int currentDay = Integer.parseInt(scanner.nextLine());

            String[] dayOfWeek = {"Monday","Tuesday","Wednesday","Thursday",
                    "Friday","Saturday","Sunday"};

            if (currentDay >= 1 && currentDay <= 7) {
                System.out.println(dayOfWeek[currentDay - 1]);
            } else {
                System.out.println("Invalid day!");
            }
        }
    }


