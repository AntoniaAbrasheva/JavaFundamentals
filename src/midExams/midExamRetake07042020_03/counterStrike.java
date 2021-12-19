package midExams.midExamRetake07042020_03;

import java.util.Scanner;

public class counterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int wonBattle = 0;
        boolean isWon = true;


        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

          if (initialEnergy >= distance) {
              initialEnergy -= distance;
              wonBattle++;

              if (wonBattle % 3 == 0) {
                  initialEnergy += wonBattle;
              }
          } else {
              System.out.printf("Not enough energy! Game ends with %d won battles and %d energy\n",
                      wonBattle,initialEnergy);
              isWon = false;
              break;
          }

          input = scanner.nextLine();
        }
        if (isWon) {
            System.out.printf("Won battles: %d. Energy left: %d", wonBattle, initialEnergy);
        }


    }
}
