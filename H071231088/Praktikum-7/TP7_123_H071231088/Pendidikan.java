package TP7_123_H071231088;

public class Pendidikan {
    private String[] pendidikanTerakhir = { "SD", "SMP", "SMA", "SMK", "S1", "S2", "S3" };
    private String pendidikan;
    private int pilihanPendidikan; // Ganti tipe data dari int ke String

    public void prosesPendidikan(String pilihan) {   

        for (int i = 0; i < pendidikanTerakhir.length; i++) {
            if (pendidikanTerakhir[i].equalsIgnoreCase(pilihan)) {
                pendidikan = pendidikanTerakhir[i];
                pilihanPendidikan = i; 
                return;
            }
        }
        pendidikan = "Tidak valid";
        pilihanPendidikan = -1; 
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public int getPilihanPendidikan() {
        return pilihanPendidikan + 1;
    }
}
