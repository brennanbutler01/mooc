import java.util.HashMap;
import java.util.Objects;

public class IOU {
    private HashMap<String, Double> hashmap;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IOU iou = (IOU) o;
        return hashmap.equals(iou.hashmap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashmap);
    }

    public IOU(){
        this.hashmap = new HashMap<> ();
    }

    public void setSum(String toWhom, double amount) {
        this.hashmap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo (String toWhom) {
        return this.hashmap.getOrDefault(toWhom, 0.0);
    }
}
