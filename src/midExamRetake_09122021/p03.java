package midExamRetake_09122021;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> textList = Arrays.stream(scanner.nextLine()
                .split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "Delete":
                    int index = Integer.parseInt(commandLine[1]);
                    if (index + 1 >= 0 && index + 1 <= textList.size() - 1) {
                        textList.remove(index + 1);
                    } else {
                        break;
                    }
                    break;
                case "Swap":
                    String firstWord = commandLine[1];
                    String secondWord = commandLine[2];

                    if (textList.contains(firstWord) && textList.contains(secondWord)) {
                        textList.set(textList.indexOf(firstWord),secondWord);
                        textList.set(textList.indexOf(secondWord),firstWord);
                    } else {
                        break;
                    }
                    break;
                case "Put":
                    String word = commandLine[1];
                    int putIndex = Integer.parseInt(commandLine[2]);

                    int currentIndex = putIndex - 1;
                    if (currentIndex >= 0 && currentIndex <= textList.size() - 1) {
                        textList.add(currentIndex,word);
                    } else if (currentIndex == textList.size() - 1) {
                        textList.add(word);
                    } else if (currentIndex < 0) {
                        break;
                    }
                break;
                case "Sort":
                    Collections.sort(textList);
                    Collections.reverse(textList);
                    break;
                case "Replace":
                    String word1 = commandLine[1];
                    String word2 = commandLine[2];

                    if (textList.contains(word2)) {
                        textList.set(textList.indexOf(word2),word1);
                    } else {
                        break;
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.print(String.join(" ",textList));


    }
}
