import java.util.HashMap;
import java.util.Objects;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners =  new HashMap<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleRegistry that = (VehicleRegistry) o;
        return Objects.equals(owners, that.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owners);
    }

    public boolean add (LicensePlate licensePlate, String owner) {
        if ((owners.putIfAbsent(licensePlate, owner) == null)) {
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate, String owner) {
        if ((owners.containsKey(licensePlate))) {
            return owners.get(licensePlate);
        }
        return null;
    }

    public String get (LicensePlate licensePlate) {
        return this.owners.get(licensePlate);
    }

    public void printLicensePlates() {
        owners.forEach((licensePlate, owner) -> {
            System.out.println(licensePlate);
        });
    }

    public void printOwners() {
        ArrayList <String> ownersPrinted = new ArrayList<>();
        owners.forEach((licensePlate, owner) -> {
            if (!ownersPrinted.contains(owner)) {
                ownersPrinted.add(owner);
                System.out.println(owner);
            }
        });
    }

    @Override
    public String toString() {
        return "VehicleRegistry{" +
                "owners=" + owners +
                '}';
    }

    public boolean remove (LicensePlate licensePlate) {
        if ((owners.containsKey(licensePlate))) {
            owners.remove(licensePlate);
            return true;
        }
        return false;
    }


}
