import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    @Override
    public String toString() {
        String returnString = "";
        for (Movable organism : herd) {
            returnString += organism.toString() + "\n";
        }
        return returnString;
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move (int dx, int dy) {
        for (Movable organism : herd) {
            organism.move(dx, dy);
        }
    }
}
