
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";

        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] strings = input.split(",");

            if (Integer.valueOf(strings[1]) > age) {
                age = Integer.valueOf(strings[1]);
                name = strings[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
