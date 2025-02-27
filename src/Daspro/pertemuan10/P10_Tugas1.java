import java.util.Scanner;

public class P10_Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak mahasiswa : ");
        int bykSiswa = sc.nextInt();

        int[] nilai = new int[bykSiswa];
        int total = 0;
        int rata = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai Mahasiwa ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }
        System.out.println("==========================================");
        rata = total / bykSiswa;
        System.out.println("rata-rata nilai mahasiswa adalah " + rata);
        int max = nilai[0];
        int min = nilai[0];
        
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        
        System.out.println("Nilai terbesar adalah " + max);
        System.out.println("Nilai terkecil adalah " + min);
        System.out.println("==========================================");

        System.out.println("Nilai mahasiswa serluruh mahasiswa ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }
    }
}
