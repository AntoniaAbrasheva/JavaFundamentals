package midExamRetake_09122021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] commandLine = input.split("[[a-z]+,\\s+]");
            String command = commandLine[0];
          switch (command) {
                case "add to start":
                    break;
                case "remove greater than":
                    break;
              case "replace":

                    break;
                case "remove at index":
                    break;
                case "find even":
                    break;
                case "find odd":
                    break;
            }



            input = scanner.nextLine();
        }
    }
}
