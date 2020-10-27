import java.util.Scanner;
public class UI {
    private Scanner scanner;
    private Grades grade;


    public UI(Scanner scanner, Grades grade) {
        this.scanner = scanner;
        this.grade = grade;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                this.grade.printAll();
                System.out.println("Point average (all): " + grade.averagePoints());
                break;
            }
            this.grade.addPoints(points);
        }
    }
}
