import java.util.Scanner;

public class TP1_5_H071231088 {
    public static void main(String[] args) {
        int[][] _2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {0} };
        System.out.print("Masukkan angka: ");
        Scanner n = new Scanner(System.in);
        int found = 0;

        try {
            found = n.nextInt();
            boolean isFound = false;
            for (int i = 0; i < _2d.length; i++) {
                for (int j = 0; j < _2d[i].length; j++) {
                    if (_2d[i][j] == found) {
                        System.out.println("Found " + found + " at [" + i + "][" + j + "]");
                        isFound = true;
                        break;
                    }
                }
                if (isFound) {
                    break;
                }
            }
            if (!isFound) {
                System.out.println("angka tidak ditemukan");
            }
        } catch (Exception e) {
            System.out.println("Bukan angka.");
        }
    }
}
