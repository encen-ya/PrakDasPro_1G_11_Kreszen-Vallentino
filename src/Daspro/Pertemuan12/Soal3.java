import java.util.Random;
import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int angkaAcak = rd.nextInt(100);
        while (true) {
            System.out.print("Masukkan angka tebakan");
            int tebakan = sc.nextInt();
        if (tebakan < angkaAcak ) {
            System.out.println("tebakan terlalu kecil");
        } else if (tebakan > angkaAcak) {
            System.out.println("tebakan terlalu besar");
        } else {
            System.out.println("tebakan benar");
            break;
        }
    }
}
}
