import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        if (this.items.isEmpty()) {
            return 0.0;
        }
        for (Packable item : items) {
            weight +=item.weight();
        }
        return weight;
    }

    public void add (Packable item) {
        if (this.weight() + item.weight() <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
