package TP7_123_H071231088;
public class Pengalaman extends Kehidupan {
    String[] daftarPengalaman = { "Freelancer", "Magang", "Pekerja tetap", "Tidak ada" };
    String pengalaman;
    int inputPengalaman;
    String organisasi;
    
    @Override
    public void prosesKehidupan(String n) {
        int input = Integer.parseInt(n);
        switch (input) {
            case 1:
            case 2:
            case 3:
            case 4:
                pengalaman = daftarPengalaman[input - 1];
                inputPengalaman = input;               
                break;
            default:
                System.out.println("Invalid input. Masukkan lagi");
                prosesKehidupan(n);
                break;
        }
        
        
    }

    @Override
    public void prosesOrganisasi(String org) {
        organisasi = org;

    }
    
    public String getPengalaman() {
        return pengalaman;
    }

    public int getinputPengalaman() {
        return inputPengalaman;
    }

    public String getOrganisasi() {
        return organisasi;
    }
}
