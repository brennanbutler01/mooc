
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value == 5000) {
            System.out.println("Tax: 100.0");
        } else if (value > 5000 && value < 25000) {
            int overage = value - 5000;
            double tax = 100 + ((double) overage * .08);
            System.out.println("Tax: " + tax);
        } else if (value < 55000 && value >= 25000) {
            int overage = value - 25000;
            double tax = 1700 + ((double) overage * .10);
            System.out.println("Tax: " + tax);
        } else if (value <= 200000 && value >= 55000) {
            int overage = value - 55000;
            double tax = 4700 + ((double) overage * .12);
            System.out.println("Tax: " + tax);
        } else if (value <= 1_000_000 && value >= 200_000) {
            int overage = value - 200_000;
            double tax = 22_100 + ((double) overage * .15);
            System.out.println("Tax: " + tax);
        } else {
            int overage = value - 1_000_000;
            double tax = 142_100 + ((double) overage * .17);
            System.out.println("Tax: " + tax);
        }
    }
}
