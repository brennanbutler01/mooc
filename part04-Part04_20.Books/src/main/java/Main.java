import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<Book>();

        while(true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.equals("")){
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            Book newBook = new Book (title, pages, publicationYear);
            bookList.add(newBook);
        }

        System.out.println("What information");
        String informationChoice = scanner.nextLine();

        if (informationChoice.equals("everything")) {
            for (Book book: bookList) {
                System.out.println(book);
            }
        }
        else {
            for (Book book : bookList) {
                System.out.println(book.getTitle());
            }
        }
    }
}
