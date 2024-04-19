
import java.util.Scanner;
public class TP1_2_H071231088 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan nama judul \n>");
        String x = n.nextLine();
        ubahJudul(x);

    }
    public static void ubahJudul(String x){
        x = x.toLowerCase();
        String[] judul = x.split(" ");
        for (int i = 0; i < judul.length; i++){
            judul[i] = judul[i].substring(0,1).toUpperCase()+judul[i].substring(1) + " ";
        }
        for (String baru :judul){
            System.out.print(baru);
        }
    }
}