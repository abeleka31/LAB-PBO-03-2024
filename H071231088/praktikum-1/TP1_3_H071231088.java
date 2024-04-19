import java.util.Scanner;
public class TP1_3_H071231088 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("");
        String tanggal = n.nextLine();
        String[] x = tanggal.split("-");
        String hari = x[0];
        String bulan = "";
        String tahun =x[2];
        

        String[] namabulan = {"januari", "february", "maret", "april", "mei", "juni", "juli", "agustus", "september", "oktober", "november", "desember"};
        int index = Integer.parseInt(x[1]);
        if (index >= 0 && index <= 11){
            bulan = namabulan[index -1 ];

        }
        int i = Integer.parseInt(x[2]);
        if (i >= 00 && i <= 30){
            String hasil = hari + " " + bulan + " 20" + tahun;
            System.out.print(hasil);
        }else{
            String hasil = hari + " " + bulan + " 19" + tahun;
            System.out.print(hasil);
        }
        

    }
}