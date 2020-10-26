
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while(true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }


            String[] array = input.split(" ");
            String command = array[0];
            if (array.length == 1) {
                continue;
            }
            int value = Integer.valueOf(array[1]);


            if (command.equals("add")) {
                first.add(value);
                continue;
            }

            if (command.equals("move")) {
                int firstContains = first.contains();
                int secondContains = second.contains();

                if (firstContains - value < 0) {
                    first.remove(value);
                    second.add(firstContains);
                    continue;
                }
                first.remove(value);
                second.add(value);
                continue;
            }

            if (command.equals("remove")) {
                second.remove(value);
                continue;
            }
        }

    }

}
