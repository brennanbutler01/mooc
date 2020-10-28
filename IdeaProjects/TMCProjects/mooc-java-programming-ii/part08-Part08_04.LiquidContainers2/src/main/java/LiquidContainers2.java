
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();
        Scanner scanner = new Scanner (System.in);

        while (true) {
            int value = 0;
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            if (inputArray.length == 2) {
                value = Integer.valueOf(inputArray[1]);
            }

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("add")) {
                first.add(value);
            }

            if (command.equals("remove")) {
                second.remove(value);
            }

            if (command.equals("move")) {
                if (first.contains() >= value) {
                    first.remove(value);
                    second.add(value);
                } else {
                    second.add(first.contains());
                    first.remove(value);
                }
            }

        }
    }
}
