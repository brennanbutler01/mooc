
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("")) {
            String[] split = line.split(" ");
            System.out.println(split[0]);
            line = scanner.nextLine();
        }

    }
}
