
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String[] strings = input.split(" ");
            System.out.println(strings[strings.length - 1]);
            input = scanner.nextLine();
        }

    }
}
