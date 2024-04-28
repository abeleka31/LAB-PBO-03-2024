
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static ArrayList<Product> produk = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do{
            Menu();
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    showAllProduct();
                    break;
                case 3:
                    buyProduct(sc);
                    break;
                case 4:
                    System.out.println("Terimakasih telah menggunakan layanan kami. sampai jumpa lagi");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 4);
        sc.close();

        

    }

    public static void Menu() {
        System.out.println("Menu : ");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Semua Produk ");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");
        System.out.print("pilih menu (1-4): ");
    }

    public static void addProduct(Scanner sc) {
        sc.nextLine();
        System.out.print("Masukkan nama Produk :  ");
        String brand = sc.nextLine();
        System.out.print("Masukkan nomor seri : ");
        int serialNumber = sc.nextInt();
        System.out.print("Masukkan harga : ");
        double price = sc.nextDouble();

        System.out.println("Pilih tipe produk : ");
        System.out.println("1. Smartphone ");
        System.out.println("2. laptop ");
        System.out.println("3. Camera "); 
        System.out.println("pilih tipe produk (1-3) : ");
        
        int tipe = sc.nextInt();
        switch(tipe) {
            case 1:
                System.out.print("Masukkan Ukuran Layar (inci) : ");
                double screenSize = sc.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int storageCapacity = sc.nextInt();
                produk.add(new Smartphone(brand, serialNumber, price, screenSize, storageCapacity));
                break;
            case 2:
                System.out.print("Masukkan Resolusi : ");
                int resolution = sc.nextInt();
                System.out.print("Masukkan Type : ");
                String lensType = sc.next();
                produk.add(new Camera(brand, serialNumber, price, resolution, lensType));
                break;
            case 3:
                System.out.print("Masukkan Ukuran RAM (GB): ");
                int ramSize = sc.nextInt();
                System.out.print("Masukkan Tipe Processor : ");
                String processorType = sc.nextLine();
                produk.add(new Laptop(brand, serialNumber, price, ramSize, processorType));
                break;
            default:
                System.out.println("Tipe produk tidak valid");
                addProduct(sc);
        }
        System.out.println("Produk berhasil Ditambahkan");

    }

    private static void showAllProduct() {
        if (produk.isEmpty()) {
            System.out.println("Produk masih kosong");
            return;
        }
        System.out.println("daftar produk : ");
        for (Product daftar : produk) {
            daftar.displayInfo();
            System.out.println();
        }
    }

    private static void buyProduct(Scanner sc) {
        if (produk.isEmpty()) {
            System.out.println("Produk masih kosong");
            return;
        }
        System.out.println("Masukkan nomor seri :");
        int serialNumber = sc.nextInt();
        boolean cari = false;
        for (Product a : produk) {
            if (a.serialNumber == serialNumber) {
                cari = true;
                System.out.println("Anda telah berhasil membeli produk");
                a.displayInfo();
                produk.remove(a);
                break;
            }
        }
        if (!cari) {
            System.out.println("produk tidak di temukan");
        }
    }
}
