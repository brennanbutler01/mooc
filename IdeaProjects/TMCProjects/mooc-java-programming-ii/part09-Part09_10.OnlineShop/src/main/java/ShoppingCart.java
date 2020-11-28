import java.util.Map;
import java.util.HashMap;
public class ShoppingCart {
    private Map <String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        Item newItem = new Item(product, 1, price);
        cart.put(product, newItem);
    }

    public int price() {
        int total = 0;

        for (Item item : this.cart.values()) {
            total += item.price();
        }
        return total;
    }
}
