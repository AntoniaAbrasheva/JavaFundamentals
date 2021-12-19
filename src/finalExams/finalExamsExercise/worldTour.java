package finalExams.finalExamsExercise;

import java.util.Scanner;

public class worldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] commandLine = input.split("\\:");
            String command = commandLine[0];


            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(commandLine[1]);
                    String string = commandLine[2];

                    if (index >= 0 && index <= stops.length() - 1) {
                        stops.insert(index,string);

                    }
                    System.out.println(stops.toString());
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandLine[1]);
                    int endIndex = Integer.parseInt(commandLine[2]);

                    if (startIndex >= 0 && endIndex <= stops.length() - 1) {
                        stops.delete(startIndex,endIndex + 1);

                    }
                    System.out.println(stops.toString());
                    break;
                case "Switch":
                    String oldString = commandLine[1];
                    String newString = commandLine[2];

                    if (stops.toString().contains(oldString)) {
                        String text = stops.toString().replaceAll(oldString,newString);
                        stops = new StringBuilder(text);

                    }
                        System.out.println(stops.toString());

                    break;
            }


            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",stops.toString());
    }
}
