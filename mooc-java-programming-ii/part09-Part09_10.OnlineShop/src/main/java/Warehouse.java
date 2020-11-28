import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;

    public Warehouse() {
        this.priceMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.priceMap.put(product, price);
        this.stockMap.put(product, stock);
    }

    public int price(String product) {
        return this.priceMap.getOrDefault(product, -99);
    }

    public int stock (String product) {
        return this.stockMap.getOrDefault(product, 0);
    }

    public boolean take(String product) {
            if(this.stockMap.get(product) == null) {
                return false;
            }

        if (!this.stockMap.isEmpty()) {
            if (this.stockMap.get(product) > 0) {
                int stock = this.stockMap.get(product);
                int newStock = stock  - 1;
                this.stockMap.replace(product, stock, newStock);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Set<String> products(){
        Set<String> products = priceMap.keySet();
        return products;
    }
}
