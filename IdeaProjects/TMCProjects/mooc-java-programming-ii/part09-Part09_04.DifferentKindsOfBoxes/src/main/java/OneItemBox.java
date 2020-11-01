import java.util.ArrayList;

public class OneItemBox extends Box {
    private int capacity;
    private ArrayList<Item> list;

    public OneItemBox() {
        this.capacity = 1;
        this.list = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        if (this.list.isEmpty()) {
            this.list.add(item);
        }
    }
    @Override
    public boolean isInBox(Item item){
        if (this.list.isEmpty()) {
            return false;
        }
        if (this.list.get(0).equals(item)) {
            return true;
        }
        return false;
    }


}
