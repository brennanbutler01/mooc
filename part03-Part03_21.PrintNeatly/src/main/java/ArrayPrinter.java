
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int count = 0;
        int length = array.length - 1;
        for (int ele : array) {
            if (count < length) {
                count++;
                System.out.print(ele + ", ");
            } else {
                System.out.print(ele);
            }
        }
    }
}
