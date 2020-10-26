import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> points;

    public Grades() {
        this.points = new ArrayList<>();
    }

    public void addPoints(int point) {
        this.points.add(point);
    }

    public void printAll() {
        for (Integer grade : points) {
            System.out.println(grade);
        }
    }
}
