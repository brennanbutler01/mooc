
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int ele : array) {
            String stars = "";
            for (int i = 0; i <ele ; i++) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }

}
