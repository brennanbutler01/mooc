
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }

        double average = list.stream().
                mapToInt(s -> Integer.valueOf(s)).
                average().
                getAsDouble();

        System.out.println("the average of the numbers: " + average);
    }
}
