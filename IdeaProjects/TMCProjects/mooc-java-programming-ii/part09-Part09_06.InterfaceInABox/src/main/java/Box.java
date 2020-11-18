import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Double> box;

    public Box(double capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        if (this.box.isEmpty()) {
            return 0.0;
        }
        for (Double item : box) {
            weight +=item;
        }
        return weight;
    }

    public void add (Book book) {
        if (this.weight() + book.weight() <= this.capacity) {
            box.add(book.weight());
        }
    }

    public void add (CD cd) {
        if (this.weight() + cd.weight() <= this.capacity) {
            box.add(cd.weight());
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
}
