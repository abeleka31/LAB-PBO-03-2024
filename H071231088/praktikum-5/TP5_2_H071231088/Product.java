
public class Product {
    String brand;
    int serialNumber;
    double price;

    public Product(String brand, int serialNumber, double price) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Merek : " + brand);
        System.out.println("Nomor Seri : " + serialNumber);
        System.out.println("Harga : " + price);
    }
}
