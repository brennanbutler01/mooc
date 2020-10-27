import java.util.Scanner;
public class UI {
    private Scanner scanner;
    private Grades grade;


    public UI(Scanner scanner, Grades grade) {
        this.scanner = scanner;
        this.grade = grade;
    }

    public void printResults() {
        this.grade.printAll();
        System.out.println("Point average (all): " + grade.averagePoints());
        if (grade.averagePassingPoints() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + grade.averagePassingPoints());
        }
        System.out.println("Passing percentage: " + grade.passPercentage());
        this.grade.printGradeDistribution();

    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                this.printResults();
                break;
            }
            this.grade.addPoints(points);
        }
    }
}
