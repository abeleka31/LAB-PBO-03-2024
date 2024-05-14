package TP7_123_H071231088;

public class Karyawan {
    Keluarga keluarga = new Keluarga();
    String nama;
    int umur;
    String jabatan = "Karyawan";
    double gaji;
    String statusNikah;
   

    public Karyawan(String nama, int umur,  double gaji, String statusNikah) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
        this.statusNikah = statusNikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getStatusNikha() {
        return statusNikah;
    }

    public void setStatusNikah(String statusNikah) {
        this.statusNikah = statusNikah;
    }

    
    

    public void cetakInfo() {
        System.out.println("========================================");
        System.out.println("Nama :" + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Status: " + getStatusNikha());
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji :" + gaji);
    }

    

}
