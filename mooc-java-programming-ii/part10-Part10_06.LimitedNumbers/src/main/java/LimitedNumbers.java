
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();

        while (scanner.hasNextLine()) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            values.add(input);
        }

        values.stream()
                .filter(value -> value >= 1 && value <= 5 )
                .forEach(value -> System.out.println(value));
    }
}
