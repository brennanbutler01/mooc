
public class AdvancedAstrology {

    public static void printStars(int number) {
        String stars = "";
        for (int i = 0 ; i<number; i++) {
            stars +="*";
        }
        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        String spaces = "";
        for (int i = 0; i < number ; i++) {
            spaces += " ";
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        int spaceCount = size;
        for (int i = 1; i <= size; i++) {
            spaceCount--;
            printSpaces(spaceCount);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int baseSpaces = (height - 2);
        int stars = 1;
        for (int i = 1 ; i <=height; i++) {
            if (stars == 1) {
                printSpaces(height - 1);
                printStars(stars);
            } else if (stars >= 3) {
                printSpaces(height - i);
                printStars(stars);
            }
            stars+=2;
        }

        printSpaces(baseSpaces);
        printStars(3);
        printSpaces(baseSpaces);
        printStars(3);
    }

    public static void main(String[] args) {
        printStars(3);
        printTriangle(3);
        System.out.println("---");
        christmasTree(10);
        System.out.println("---");
    }
}
