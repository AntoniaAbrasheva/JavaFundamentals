package objectAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {

    static class Song {
        String typeLIst;
        String name;
        String time;

        public void setTypeLIst(String typeLIst) {
            this.typeLIst = typeLIst;
        }

        public String getTypeLIst() {
            return typeLIst;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song currentSong = new Song();
            currentSong.setTypeLIst(type);
            currentSong.setName(name);
            currentSong.setTime(time);

            songList.add(currentSong);
        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song item : songList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songList) {
                if (item.getTypeLIst().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}


