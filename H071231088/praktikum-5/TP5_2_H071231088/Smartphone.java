
public class Smartphone extends Product {
    double screnSize;
    int storageCapacity;

    public Smartphone(String brand, int serialNumber, double price, double screnSize, int storageCapacity) {
        super(brand, serialNumber, price);
        this.screnSize = screnSize;
        this.storageCapacity = storageCapacity;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size : " + screnSize);
        System.out.println("Storage Capacity : " + storageCapacity);
    }
    
}
