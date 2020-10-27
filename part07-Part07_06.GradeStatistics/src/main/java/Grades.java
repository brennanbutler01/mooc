import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> points;

    public Grades() {
        this.points = new ArrayList<>();
    }

    public void addPoints(int point) {
        if (point <= 100 && point >=0) {
            this.points.add(point);
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
}
