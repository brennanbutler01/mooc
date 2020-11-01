import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item newItem) {
        this.items.add(newItem);
    }

    @Override
    public boolean isInBox(Item newItem) {
        for (Item item: items) {
            if (item.equals(newItem)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String string = "";
        for (Item item: items) {
            string += item.getName() + item.getWeight() + "\n";
        }
        return "OUTPUT" + string;
    }
}
