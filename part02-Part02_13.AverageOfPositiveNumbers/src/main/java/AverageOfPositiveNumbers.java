
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasPositive = false;
        int sum = 0;
        int count = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                hasPositive = true;
                sum += num;
                count++;
                continue;
            }
            if (num < 0) {
                continue;
            }
        }
        if (hasPositive) {
            System.out.println((double) sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
