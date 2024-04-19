import java.util.Scanner;

public class TP2_2_H071231088 {
    private String id;
    private String nama;
    private int stok;
    private int harga;

    public void printInfo() {
        System.out.println("Berikut keterangan produk tersebut di toko kami:");
        System.out.println("ID produk: " + id);
        System.out.println("Nama produk: " + nama);
        System.out.print("Stok: ");
        stokStatus(stok);
        System.out.println("Harga: " + harga);
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void stokStatus(int stok) {
        if (stok < 1) {
            System.out.println("Produk habis");
        } else {
            System.out.println(stok);
        }
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        TP2_2_H071231088 produk = new TP2_2_H071231088();
        System.out.print("Masukkan id: ");
        produk.setID(x.nextLine());
        System.out.print("Masukkan nama produk: ");
        produk.setNama(x.nextLine());
        System.out.print("Masukkan jumlah stok: ");
        produk.setStok(x.nextInt());

        System.out.print("Masukkan harga: ");
        produk.setHarga(x.nextInt());
        x.nextLine(); 

        while (true) {
            System.out.print("Masukkan harga: ");
            String inputHarga = x.nextLine();
            if (inputHarga.matches("\\d+")) {
                produk.setHarga(Integer.parseInt(inputHarga));
                break;
            } else {
                System.out.println("Input tidak valid. Harap masukkan harga dalam bentuk angka.");
            }
        }

        produk.printInfo();
        x.close();
    }
}
