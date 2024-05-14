package TP7_123_H071231088;


import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    private static ArrayList<Karyawan> dataKaryawan = new ArrayList<>(); 
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        garis();
        System.out.println("========= Data karyawan =========");
        System.out.println("a. Tambah data karyawan");
        System.out.println("b. Tampilkan detail karyawan");
        System.out.println("c. Keluar");
        System.out.print("Pilih opsi (a-c): ");
        String pilihan = sc.nextLine();
        garis();
        switch (pilihan) {
            case "a":
                tambahKaryawan();
                break; 
            case "b":
                tampilkanKaryawan();
                break;
            case "c":
                System.out.println("Program selesai");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                menu();
                break;
        }

        sc.close();
    }

    public static void tambahKaryawan() {
        Kehidupan kehidupan = new Pengalaman();
        Pendidikan pendidikan = new Pendidikan();
        Project project = new Project();

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        while (nama.isEmpty()) {
            System.out.print("Inputan kosong, Nama: ");
            nama = sc.nextLine();
        }

        int umur;
        while (true) {
            System.out.print("Masukkan umur: ");
            String input = sc.nextLine();
            if (!input.isEmpty() && input.matches("\\d+")) {
                umur = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Input harus berupa bilangan bulat.");
            }
        }
        
        //keluarga
        isiKeluarga();
        // Kehidupan
        isiKehidupan();
        System.out.print("Pengalaman organisasi: ");
        kehidupan.prosesOrganisasi(sc.nextLine());
        
        
        double gaji;
        while (true) {
            System.out.print("Gaji sebelumnya: ");
            String stringGaji = sc.nextLine();
            if (!stringGaji.isEmpty() && stringGaji.matches("\\d+(\\.\\d+)?")) {
                gaji = Double.parseDouble(stringGaji);
                break; 
            } else {
                System.out.println("Invalid input");
            }
        }

        // pendidikan
        isiPendidikan();


        // projek
        isiProjek();

        
        if ((pendidikan.getPilihanPendidikan() >=  1 || project.getInputProject() > 2 || umur > 18
                || kehidupan.getinputPengalaman() != 4 || !kehidupan.getOrganisasi().isEmpty())) {
                    System.out.println("Pengalaman sedang di proses");
                    System.out.println("Pendidikan terakhir: " + pendidikan.getPendidikan());
                    System.out.println("Jumlah projek IT: " + project.getProject());
                    garis();
                    System.out.println("Selamat, Karyawan Diterima");
                    Sound.playSound("Accept.wav");
                    Keluarga keluarga = new Keluarga();
                    Karyawan karyawan = new Karyawan(nama, umur, gaji, keluarga.statusNikah());
                    dataKaryawan.add(karyawan);
                    menu();

            
        } else {
            System.out.println("Karyawan tidak memenuhi syarat");
            Sound.playSound("soundKedua.wav");
            menu();
        }
    }
    
    public static void tampilkanKaryawan() {
        if (dataKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan");
            menu();
            garis();
        } else {
            garis();
            System.out.println("Detail Karyawan yang Diterima: ");
            for (Karyawan karyawan : dataKaryawan) {
                karyawan.cetakInfo();
            }
            menu();
        }
        sc.close();
    }
    

    public static void isiKehidupan() {
        Kehidupan kehidupan = new Pengalaman();
        while (true) {
            System.out.print("Pengalaman sebelumnya: \n1. Freelancer \n2. Magang \n3. Pekerja tetap \n4. Tidak ada \nInput: ");
            String n = sc.nextLine();
            if (!n.isEmpty() && n.matches("[1-4]")) {
                kehidupan.prosesKehidupan(n);
                break; 
            } else {
                System.out.println("Invalid input");
            }
        }
    }
    

    public static void isiKeluarga() {
        Keluarga keluarga = new Keluarga();
        System.out.print("Apakah sudah menikah? (y/t): ");
        String nikah = sc.nextLine();
        while (nikah.isEmpty()) {
            System.out.println("Inputan invalid");
            System.out.print("Apakah sudah menikah? (y/t): ");
            nikah = sc.nextLine();
        }
        switch (nikah) {
            case "y":
                nikah = "y";
                break;
            case "t":
                nikah = "t";
                break;
            default:
                System.out.println("Inputan tidak valid ");
                isiKeluarga();
        }
        keluarga.SetNikah(nikah);
    }

    public static void isiPendidikan() {
        Pendidikan pendidikan = new Pendidikan();
        System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
        String pilihan = sc.nextLine().toUpperCase();
        while (pilihan.isEmpty() || !pilihan.matches("SD|SMP|SMA|SMK|S1|S2|S3")) {
            System.out.println("Invalid input");
            System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
            pilihan = sc.nextLine();
        }
        pendidikan.prosesPendidikan(pilihan);
    }


    public static void isiProjek() {
        Project project = new Project();
        System.out.println("Projek IT: \n1. Minimal 4 \n2. Minimal 8 \n3. Minimal 12 \n4. Lebih dari 15");
        System.out.print("Input: ");
        String proj = sc.nextLine();
        while (proj.isEmpty() || !(proj.equals("1") || proj.equals("2") || proj.equals("3") || proj.equals("4"))) {
            System.out.println("Invalid input");
            System.out.println("Projek IT: \n1. Minimal 4 \n2. Minimal 8 \n3. Minimal 12 \n4. Lebih dari 15");
            System.out.print("Input: ");
            proj = sc.nextLine();
        }        
        project.prosesProjek(proj);

    }
    

    public static void garis() {
        System.out.println("=========================================");
    }
}
