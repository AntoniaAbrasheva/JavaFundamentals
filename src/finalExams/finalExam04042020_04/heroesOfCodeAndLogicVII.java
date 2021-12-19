package finalExams.finalExam04042020_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class heroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> hitPointsMap = new HashMap<>();
        Map<String,Integer> manaPointsMap = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] heroesInfo = scanner.nextLine().split(" ");
            String heroName = heroesInfo[0];
            int hp = Integer.parseInt(heroesInfo[1]);
            int mp = Integer.parseInt(heroesInfo[2]);

            hitPointsMap.put(heroName,hp);
            manaPointsMap.put(heroName,mp);

        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandLine = input.split("-");
            String command = commandLine[0].trim();
            String heroName = commandLine[1].trim();

            switch (command) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandLine[2].trim());
                    String spellName = commandLine[3];

                    if (manaPointsMap.get(heroName) >= mpNeeded) {
                        int currentMana = manaPointsMap.get(heroName);
                        manaPointsMap.put(heroName,currentMana - mpNeeded);

                        System.out.printf("%s has successfully cast %s and now has %d MP!\n",
                                heroName,spellName,manaPointsMap.get(heroName));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n",heroName,spellName);
                    }

                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandLine[2].trim());
                    String attacker = commandLine[3].trim();

                    int currentHP = hitPointsMap.get(heroName);
                    int nextHP = currentHP - damage;

                    if (nextHP > 0) {
                        hitPointsMap.put(heroName,nextHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",
                                heroName,damage,attacker,nextHP);
                    } else {
                        hitPointsMap.remove(heroName);
                        manaPointsMap.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n",heroName,attacker);
                    }

                    break;
                case "Recharge":
                    int amountMP = Integer.parseInt(commandLine[2].trim());

                    int currentMPAmount = manaPointsMap.get(heroName);
                    int rechargedMP = currentMPAmount + amountMP;

                    if (rechargedMP > 200) {
                        manaPointsMap.put(heroName,200);
                        System.out.printf("%s recharged for %d MP!\n",heroName,200 - currentMPAmount);
                    } else {
                        manaPointsMap.put(heroName,rechargedMP);
                        System.out.printf("%s recharged for %d MP!\n",heroName,amountMP);
                    }


                    break;
                case "Heal":
                    int amountHP = Integer.parseInt(commandLine[2].trim());

                    int currentHPAmount = hitPointsMap.get(heroName);
                    int healHP = currentHPAmount + amountHP;

                    if (healHP > 100) {
                        hitPointsMap.put(heroName,100);
                        System.out.printf("%s healed for %d HP!\n",heroName,100 - currentHPAmount);
                    } else {
                        hitPointsMap.put(heroName,healHP);
                        System.out.printf("%s healed for %d HP!\n",heroName,amountHP);
                    }



                    break;
            }

            input = scanner.nextLine();
        }
        hitPointsMap.entrySet()
                .stream()
                .sorted((h1,h2) -> {
                    int result = h2.getValue() - h1.getValue();

                    if (result == 0) {
                        int res = (manaPointsMap.get(h2.getKey())) - manaPointsMap.get(h1.getKey());
                        return res;
                    }
                    return result;
                })
                .forEach(entry -> System.out.printf("%s\n  HP: %d\n  MP: %d\n",entry.getKey(),
                        entry.getValue(),
                        manaPointsMap.get(entry.getKey())));

    }
}
