

public class Main {

    public static void main(String[] args) {
        Warehouse amazon = new Warehouse();

        amazon.addProduct("Product 1", 300, 25);

        System.out.println(amazon.price("Product 2"));
    }
}
