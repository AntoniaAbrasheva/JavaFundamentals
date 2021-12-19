package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distance= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (distance.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= distance.size() - 1) {
                int removedElement = distance.get(index);
                sum += removedElement;
                distance.remove(index);
                changeElements(distance, removedElement);
            } else if (index < 0) {
                int removedElementFirst = distance.get(0);
                sum += removedElementFirst;
                int lastElement = distance.get(distance.size() - 1); //последния  елемент
                distance.set(0, lastElement);
                changeElements(distance, removedElementFirst);
            } else if (index > distance.size() - 1) {
                int removedElementLast = distance.get(distance.size() - 1);
                sum += removedElementLast;
                int firstElement = distance.get(0);
                distance.set(distance.size() - 1, firstElement);
                changeElements(distance, removedElementLast);
            }
        }
        System.out.println(sum);
    }

    private static void changeElements(List<Integer> distancePokemons, int removedElement) {
        for (int listIndex = 0; listIndex <= distancePokemons.size() - 1; listIndex++) {
            int currentNumber = distancePokemons.get(listIndex);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            distancePokemons.set(listIndex, currentNumber);
        }
    }
}


