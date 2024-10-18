/**
 * TugasP7_No1
 */
import java.util.Scanner;
public class TugasP7_No1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk mengakhiri): ");
            int tiketDibeli = scanner.nextInt();

            if (tiketDibeli < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan ulang.");
                continue;
            } else if (tiketDibeli == 0) {
                break;
            }

            totalTiketTerjual += tiketDibeli;

            double diskon = 0.0;
            if (tiketDibeli > 10) {
                diskon = 0.15;
            } else if (tiketDibeli > 4) {
                diskon = 0.10;
            }

            double hargaSetelahDiskon = tiketDibeli * hargaTiket * ( 1 - diskon);
            totalPendapatan += hargaSetelahDiskon;

            System.out.println("Diskon yang diterima: " + (diskon * 100) + "%");
            System.out.println("Harga yang harus dibayar: Rp " + hargaSetelahDiskon);
        }

        System.out.println("Total tiket yang terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
    }
}