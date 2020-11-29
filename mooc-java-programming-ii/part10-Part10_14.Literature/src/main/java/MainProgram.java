import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String book = scanner.nextLine();
            if (book.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation:");
            String ageRecommendation = scanner.nextLine();

            books.add(book + "," + ageRecommendation);
        }
        System.out.println(books.size() + " books in total.");
        books.stream().sorted((o1, o2) -> {
            int age1 = Integer.valueOf(o1.split(",")[1]);
            int age2 = Integer.valueOf(o2.split(",")[1]);

            if (age1 < age2) {
                return -1;
            } else if (age1 >age2) {
                return 1;
            } else {
                String name1 = o1.split(",")[0];
                String name2 = o2.split(",")[0];

                return name1.compareTo(name2);
            }
        }).forEach(s -> {
            System.out.println(s.split(",")[0] + " (recommended for " + s.split(",")[1] +
                    " year-olds or older)");
        });

    }

}
