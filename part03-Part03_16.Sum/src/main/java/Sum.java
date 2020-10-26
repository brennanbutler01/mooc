
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        System.out.println(sum(numbers));
    }
    public static int sum (ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number:numbers) {
            sum += number;
        }
        return sum;
    }

}
