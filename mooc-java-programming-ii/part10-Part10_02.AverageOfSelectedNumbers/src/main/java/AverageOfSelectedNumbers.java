
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();

        if (input.equals("p")) {
            double average = list.stream().mapToInt(s -> Integer.valueOf(s)).filter(x -> x >= 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        } else {
            double average = list.stream().mapToInt(s -> Integer.valueOf(s)).filter(x -> x < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
    }
}
