
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while(!line.isEmpty()) {
            String[] array = line.split(" ");
            for (String lines: array) {
                if (lines.contains("av")) {
                    System.out.println(lines);
                }
            }
            line = scanner.nextLine();
        }

    }
}
