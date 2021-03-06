package assosiativeArrays.lab;

import java.util.*;

public class oddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordArr = scanner.nextLine().split(" ");

        Map<String,Integer> countWordsMap = new LinkedHashMap<>();

        for (String word : wordArr) {
            String wordToLower = word.toLowerCase(Locale.ROOT);

            if (countWordsMap.containsKey(wordToLower)) {
                int currentCount = countWordsMap.get(wordToLower);
                countWordsMap.put(wordToLower,currentCount + 1);

            } else {
                countWordsMap.put(wordToLower,1);
            }
        }
        List<String> oddCountWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : countWordsMap.entrySet()) {
            int count = entry.getValue();
            if (count % 2 != 0) {
                oddCountWords.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",oddCountWords));


    }
}


