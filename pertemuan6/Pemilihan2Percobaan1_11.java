import java.util.Scanner;
/**
 * Pemilihan2Percobaan1_11
 */
public class Pemilihan2Percobaan1_11 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int tahun;
        System.out.print("masukkan tahun : ");
        tahun = i.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}