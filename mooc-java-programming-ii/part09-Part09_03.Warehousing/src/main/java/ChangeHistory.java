import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double>  changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add (double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    public double maxValue() {
        double max = -1000.00;
        for (Double change : changeHistory) {
            if (change > max) {
                max = change;
            }
        }
        return max;
    }

    public double minValue() {
        double min = 100000.00;
        for (Double change : changeHistory) {
            if (change <= min) {
                min = change;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0.0;
        for (Double change : changeHistory) {
            sum+= change;
        }
        return sum/this.changeHistory.size();
    }

    @Override
    public String toString() {
        return changeHistory.toString();
    }
}
