
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1.0;
        }
        return (double) sumOfPoints() /  this.points.size();
    }

    public int sumOfPoints() {
        if (this.points.isEmpty()) {
            return 0;
        }
        int points = 0;

        for (int i=0; i <= this.points.size() - 1; i++) {
            points += this.points.get(i);
        }
        return points;
    }

    public int sumOfGrades() {
        if (grades.isEmpty()) {
            return 0;
        }
        int returnSum = 0;

        for (Integer grade: grades) {
            returnSum += grade;
        }
        return returnSum;
    }


    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1.0;
        }
        return (double) sumOfGrades() / this.grades.size();
    }

    public int numberOfGrades(int grade) {

        if (this.grades.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
