import java.util.Scanner;
public class SiakadFor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lulus = 0, tidakLulus = 0;
        double nilai, tertinggi = 0, terendah = 100, batasKelulusan = 60;


        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;    
            }
            if (nilai < terendah) {
                terendah = nilai;
            } if (nilai >= batasKelulusan) {
                lulus++;
            } if (nilai < batasKelulusan) {
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
    }
}
