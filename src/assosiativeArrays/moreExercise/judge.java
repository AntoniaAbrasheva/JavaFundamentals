package assosiativeArrays.moreExercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usersArr = scanner.nextLine().split(" -> ");

        Map<String,String> usersContestsMap = new HashMap<>();
        Map<String,Integer> usersPointsMap = new HashMap<>();

        String userName = usersArr[0];
        String contestName = usersArr[1];
        int points = Integer.parseInt(usersArr[2]);

        usersContestsMap.putIfAbsent(contestName,userName);

        
    }
}
