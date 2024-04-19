
import java.util.Scanner;
public class TP1_4_H071231088 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        try{
            Double r = n.nextDouble();
            Double luas = 3.1415 * r * r;
            System.out.printf("%.2f", luas);

        }catch(Exception e){
            System.out.print("bukan angka");
        }
        n.close();

    }
}