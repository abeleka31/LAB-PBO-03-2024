
public class Camera extends Product{
    int resolution;
    String lensType;

    public Camera(String brand, int serialNumber, double price, int resolution, String lensType) {
        super(brand, serialNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution : " + resolution);
        System.out.println("Lens Type : " + lensType);
    }

}
