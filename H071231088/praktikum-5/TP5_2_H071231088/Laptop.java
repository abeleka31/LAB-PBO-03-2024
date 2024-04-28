
public class Laptop extends Product {
    int ramsize;
    String processorType;

    public Laptop(String brand, int serialNumber, double price, int ramsize, String processorType) {
        super(brand, serialNumber, price);
        this.ramsize = ramsize;
        this.processorType = processorType;
    }
    
    void displayInfo() {
        super.displayInfo();
        System.out.println("RAM Size : " + ramsize);
        System.out.println("Processor Type : " + processorType);
    }


}
