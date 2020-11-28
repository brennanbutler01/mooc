import java.util.HashMap;
import java.util.ArrayList;
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> items = this.storageFacility.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents (String unit) {
        return this.storageFacility.getOrDefault(unit, new ArrayList<String>());
    }

    public void remove(String unit, String item) {
        this.storageFacility.get(unit).remove(item);

        if (this.storageFacility.get(unit).isEmpty()) {
            this.storageFacility.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList <String> storageUnits = new ArrayList<>();
        this.storageFacility.forEach((unit, inventory) -> {
            if (!this.storageFacility.get(unit).isEmpty()) {
                storageUnits.add(unit);
            }
        });
        return storageUnits;
    }
}
