import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Grades() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(int point) {
        if (point <= 100 && point >= 0) {
            this.points.add(point);
            this.addGrade(point);
        }
    }

    public void printAll() {
        for (Integer grade : points) {
            System.out.println(grade);
        }
    }

    public double averagePoints() {
        int sum = 0;

        for (Integer point : points) {
            sum += point;
        }
        return (double) sum / points.size();
    }

    public double averagePassingPoints() {
        int sum = 0;
        int count = 0;

        for (Integer point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }

        if (count == 0) {
            return -1;
        }

        return (double) sum / count;
    }

    public double passPercentage() {
        int count = 0;


        for (Integer point : points) {
            if (point >= 50) {
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        }
        return 100 * (count / (double) points.size());
    }

    public void addGrade(int point) {
        if (point >= 90) {
            this.grades.add(5);
        } else if (point < 90 && point >= 80) {
            this.grades.add(4);
        } else if (point < 80 && point >= 70) {
            this.grades.add(3);
        } else if (point < 70 && point >= 60) {
            this.grades.add(2);
        } else if (point < 60 && point >= 50) {
            this.grades.add(1);
        } else {
            this.grades.add(0);
        }
    }

    public void printGradeDistribution() {

        for (int i = 5; i >= 0; i--) {
            String stars = "";
            for (Integer grade : grades) {
                if (grade == i) {
                    stars += "*";
                }
            }
            System.out.println(i + ": " + stars);
        }
    }
}