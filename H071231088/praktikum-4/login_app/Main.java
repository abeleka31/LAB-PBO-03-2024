
package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.Models.Profile;
import login_app.Models.User;
import login_app.utils.StringUtils;
import login_app.Main;

public class Main {
    private static ArrayList<User> ListUser = new ArrayList<>();
    private static ArrayList<Profile> ListUserProfil = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("--------------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("--------------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        
        String selecMenu = sc.nextLine();
        switch (selecMenu) {
            case "1":
            if (ListUser.isEmpty()) {
                    System.out.println("Belum ada USer yang terdaftar, Silahkan Register Terlebih dahulu");
                    showRegisterMenu();
                } else {
                    showLoginMenu();
                }
                break;
            case "2":
                showRegisterMenu();
                break;
            default:
                System.out.println("imputan salah silahkan pilih lagi: ");
                runApp();
            }        
        }
        
        
        private static void showLoginMenu() {
            System.out.println("---------------------------");
            System.out.println("Login");
            
            String username = "";
            while (username.isEmpty()) {
                System.out.println("Masukkan Username");
                System.out.print("> ");
                username = sc.nextLine();
                if (username.isEmpty()) {
                    System.out.println("inputan kosong, silakan masukkan Username");
                }    
            }
            
            int userIndex = -1;
            for (int i = 0; i < ListUser.size(); i++){
                while (ListUser.get(i).getUsername().equals(username)){
                    userIndex = i;
                    break;
                } 
            }
            
            if (userIndex != -1){
                System.out.println("Password");
                System.out.print("> ");
                String password = sc.nextLine();
                while(password.isEmpty()) {
                    System.out.println("Input kosong. Masukkan ulang \nPassword");
                    System.out.print("> ");
                    password = sc.nextLine();
                }
                boolean passwordCorrect = ListUser.get(userIndex).getPassword().equals(password);
                if (passwordCorrect) {
                    System.out.println("Berhasil Login");
                    showDetailUser(ListUserProfil.get(userIndex));
                    runApp();
                
                }
                else{
                    System.out.println("Password Salah");
                    System.out.print("> ");
                    showLoginMenu();
                }
            } else {
                System.out.println("Username tidak di temukan");
                showLoginMenu();
            }
    }
        
    

    private static void showRegisterMenu() {
        System.out.println("--------------------------");
        System.out.println("REGISTER");
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        while(username.isEmpty()) {
            System.out.println("Username tidak boleh kosong!!\nUsername");
            System.out.print("> ");
            username = sc.nextLine();
        }
        for (User user : ListUser) {
            while(user.getUsername().equals(username)) {
                System.out.println("Username sudah digunakan. Silahkan input ulang!!\nUsername");
                System.out.print("> ");
                username = sc.nextLine();
            }
        }
        
        System.out.println("Password (minimal 8 karakter)");
        System.out.print("> ");
        String password;
        while (true) {
            String sandi = sc.nextLine();
            int panjang = sandi.length();
            if (panjang == 0) {
                System.out.println("Inputan kosong, Masukkan ulang!!\nPassword");
                System.out.print("> ");
            } else if (panjang < 8) {
                System.out.println("Password harus minimal 8 karakter\nPassword");
                System.out.print("> ");
            } else {
                password = sandi;
                break;
            }
        }
    
        
        
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        while(fullName.isEmpty()) {
            System.out.println("Nama Lengkap tidak boleh kosong!!\nNama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine();
        }
        
        System.out.println("Umur");
        System.out.print("> ");
        int age = 0;
        while (true) {
            String n = sc.nextLine();
            int panjang = n.length();
            if (panjang != 0) {
                try {
                    age = Integer.parseInt(n);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Inputan salah. Harap masukkan angka.");
                    System.out.println("Umur");
                    System.out.print("> ");
                }
            } else {
                System.out.println("Inputan kosong, Masukkan Ulang!!\nUmur");
                System.out.print("> ");
            }
        }
        
        
        
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        while (hobby.isEmpty()) {
            System.out.println("Inputan kosong, Input ulang!!\nHobby");
            System.out.print("> ");
            hobby = sc.nextLine();
        }
        
        User user = new User(username, password);
        ListUser.add(user);
        
        Profile profile = new Profile();
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        
        // Generate Nickname
        String nickname = StringUtils.buatNicname(fullName);
        profile.setNickName(nickname);

        ListUserProfil.add(profile);

        System.out.println("--------------------------");
        System.out.println("berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("--------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("--------------------------");
        System.out.println("Nama Lengkap   : " + profile.getFullName());
        System.out.println("Nama Panggilan : " + profile.getNickName());
        System.out.println("Umur           : " + profile.getAge());
        System.out.println("Hobby          : " + profile.getHobby());
    }
}
