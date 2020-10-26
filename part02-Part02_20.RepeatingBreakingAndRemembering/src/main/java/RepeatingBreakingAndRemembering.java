
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int oddCount = 0;
        int evenCount = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num != -1) {
                sum +=num;
                count++;
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                continue;
            }
            if (num == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                if (count > 0) {
                    System.out.println("Average: " + ((double) sum / count));
                } else {
                    System.out.println("Average: " + sum);
                }
                System.out.println("Even: " + evenCount);
                System.out.println("Odd: " + oddCount);
                break;
            }
        }
    }
}
