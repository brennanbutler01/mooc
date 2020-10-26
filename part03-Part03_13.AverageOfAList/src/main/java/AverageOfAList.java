
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                int sum = 0;
                int count = list.size();
                for (Integer items: list) {
                    sum+=items;
                }
                System.out.println("Average: " + ((double) sum/count));
                break;
            }
            list.add(num);

        }

        
    }
}
