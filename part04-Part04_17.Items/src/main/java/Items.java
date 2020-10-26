
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            } else {
                Item newItem = new Item(name);
                items.add(newItem);
            }
        }

        for (Item item : items) {
            System.out.println(item);
        }

    }
}
