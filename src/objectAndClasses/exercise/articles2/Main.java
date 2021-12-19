package objectAndClasses.exercise.articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articlesList = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            String[] articlesArr = scanner.nextLine().split(", ");
            String title = articlesArr[0];
            String content = articlesArr[1];
            String author = articlesArr[2];

            Article article = new Article(title,content,author);
            articlesList.add(article);

        }

        String type = scanner.nextLine();

        switch (type) {
            case "title":
                articlesList.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articlesList.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articlesList.sort(Comparator.comparing(Article::getAuthor));
                break;
        }

        articlesList.forEach(System.out::println);

    }
}


