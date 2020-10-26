
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(25);
        numbers.add(55);
        numbers.add(35);
        numbers.add(15);
        numbers.add(65);
        numbers.add(3);
        numbers.add(225);
        numbers.add(255);

        printNumbersInRange(numbers, 25, 65);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer number: numbers) {
            if (number >= lowerLimit && number <=upperLimit) {
                System.out.println(number);
            }
        }
    }
    
}
