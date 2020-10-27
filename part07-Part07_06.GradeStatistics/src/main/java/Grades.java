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

        return (double) sum/count;
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

        return 100 * (count/points.size());
    }
}
