
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.isEmpty()) {
            String[] pieces = str.split(" ");
            for (int i =0; i<pieces.length; i++) {
                System.out.println(pieces[i]);
            }
            str = scanner.nextLine();
        }


    }
}
 