import java.util.Map;
import java.util.HashMap;
public class Warehouse {
    private Map<String, Integer> map;

    public Warehouse() {
        this.map = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.map.put(product, price);
    }

    public int price(String product) {
        return this.map.getOrDefault(product, -99);
    }
}
