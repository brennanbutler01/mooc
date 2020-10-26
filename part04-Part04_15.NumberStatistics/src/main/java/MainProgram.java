
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics evens = new Statistics();
        Statistics odds = new Statistics();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int input = Integer.valueOf(scanner.nextLine());
        while(true){
            if (input == -1) {
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + evens.sum());
                System.out.println("Sum of odd numbers: " + odds.sum());
                break;
            }
            statistics.addNumber(input);
            if (input % 2 == 0) {
                evens.addNumber(input);
            } else {
                odds.addNumber(input);
            }
            input = Integer.valueOf(scanner.nextLine());
        }
    }
}
