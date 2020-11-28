
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int value = 0;
        String command = "";

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            String[] inputArray = input.split(" ");
            if (inputArray.length == 2) {
                command = inputArray[0];
                value = Integer.valueOf(inputArray[1]);
            } else {
                command = inputArray[0];
            }

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("add")) {
                if (value <= 0) {
                    continue;
                }
                if (value + first >= 100) {
                    first = 100;
                    continue;
                }
                first +=value;
            }

            if (command.equals("move")) {
               if (value <= 0) {
                   continue;
               }
               if (first - value <=0) {
                   second += first;
                   first = 0;
                   continue;
               }
               if (second + value >=100) {
                   first -= value;
                   second = 100;
                   continue;
               }
               second += value;
               first -= value;

            }

            if (command.equals("remove")) {
                if (value <= 0) {
                    continue;
                }
                if (value >= second) {
                    second = 0;
                    continue;
                }
                second -= value;
                continue;
            }
        }
    }
}

