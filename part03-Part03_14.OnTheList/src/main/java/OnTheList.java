
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("Search for?");
                String search = scanner.nextLine();

                boolean containsSearch = false;
                for (String items: list) {
                    if (items.equals(search)) {
                        containsSearch = true;
                    }
                }
                if (containsSearch) {
                    System.out.println(search + " was found!");
                } else {
                    System.out.println(search+ " was not found!");
                }
                break;
            }

            list.add(input);
        }

    }
}
