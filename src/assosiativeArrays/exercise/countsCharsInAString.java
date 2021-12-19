package assosiativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countsCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character,Integer> symbols = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (symbol == ' ') {
                continue;
            }

            if (symbols.containsKey(symbol)) {
                int currentValue = symbols.get(symbol);
                symbols.put(symbol,currentValue + 1);
            } else {
                symbols.put(symbol,1);

            }
        }
        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%c -> %d\n",entry.getKey(),entry.getValue());
        }

    }
}


