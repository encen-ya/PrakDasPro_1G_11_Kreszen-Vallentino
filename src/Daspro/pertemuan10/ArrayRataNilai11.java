import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int [jumlahMhs];
        double total = 0, totaltdk = 0;
        double rata2, rata2tdk;
        int lulus = 0, tdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                total += nilaiMhs[i];
                lulus++;
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] < 70) {
                totaltdk += nilaiMhs[i];
                tdkLulus++;        
            }
        }
        rata2 = total / lulus;
        rata2tdk = totaltdk / tdkLulus;
        System.out.println("Rata-rata nilai mahasiswa lulus = " + rata2);
        System.out.println("Rata-rata nilai mahasiswa tidak lulus = " + rata2tdk);
    }
}
