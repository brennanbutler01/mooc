
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second +"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] array = input.split(" ");
            String command = array[0];
            int value = Integer.valueOf(array[1]);

            if (command.equals("add")) {
                if (value < 0) {
                    continue;
                }

                if (first + value < 100) {
                    first += value;
                }else {
                    first = 100;
                }
            }

            if (command.equals("move")) {
                if (first - value < 0) {
                    second += first;
                    first = 0;
                } else if (second + value > 100){
                    second = 100;
                    first -= value;
                } else {
                    second += value;
                    first -=value;
                }
            }

            if (command.equals("remove")) {
                if (second == 0) {
                    continue;
                } else if (second - value <= 0) {
                    second=0;
                } else {
                    second-=value;
                }
            }
            continue;

        }
    }

}
