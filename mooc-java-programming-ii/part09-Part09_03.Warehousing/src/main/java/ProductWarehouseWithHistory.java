public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);

    }

    public String history() {
        return changeHistory.toString() ;
    }

    public void addToWarehouse (double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.changeHistory.toString());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }

}
