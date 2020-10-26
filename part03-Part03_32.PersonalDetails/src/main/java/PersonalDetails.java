
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int birthCount = 0;
        String name = "";

        while(true){
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] strings = input.split(",");
            count++;
            birthCount += Integer.valueOf(strings[1]);
            if (strings[0].length() > name.length()) {
                name = strings[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + ((double) birthCount)/count);

    }
}
