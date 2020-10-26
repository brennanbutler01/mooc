
public class StarSign {

    public static void main(String[] args) {
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        String stars = "";
        for (int i = 0 ; i < number ; i++) {
            stars += "*";
        }
        System.out.println(stars);
    }

    public static void printSquare(int size) {
        String row = "";
        for (int i = 0 ; i < size; i++) {
            row += "*";
        }
        for (int x = 0; x < size; x++) {
            System.out.println(row);
        }
    }

    public static void printRectangle(int width, int height) {
        String row = "";
        for (int i = 0 ; i < width; i++) {
            row += "*";
        }
        for (int x = 0; x < height; x++) {
            System.out.println(row);
        }
    }

    public static void printTriangle(int size) {
        String row = "";
        for (int i = 0 ; i < size; i++) {
            row += "*";
            System.out.println(row);
        }
    }
}
