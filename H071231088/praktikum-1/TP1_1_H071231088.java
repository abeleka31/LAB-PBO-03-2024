
import java.util.Scanner;

public class TP1_1_H071231088 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("");
        int jumlah = n.nextInt();
        int bulat = 0;
        int desimal = 0;
        System.out.print("");
        try{
            for (int i = 0; i < jumlah; i++){
                double angka = n.nextDouble();
                if (angka % 1 == 0){
                    bulat++;
                }else{
                    desimal++;
                }
            }
            System.out.println(bulat + " Bilangan bulat");
            System.out.println(desimal + " Bilangan Desimal");

        }catch(Exception e){
            System.out.print("inputan salah");
        }
    }
}