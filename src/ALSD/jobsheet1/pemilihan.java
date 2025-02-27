import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextInt();
        System.out.println("===================");
        System.out.println("===================");

        String nilaiHuruf;
        if (tugas < 0||tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0  || uas > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("================");
            System.out.println("================");
        } else {
             double nilaiAKhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
             System.out.println(nilaiAKhir);
             if (nilaiAKhir > 80 && nilaiAKhir <= 100) {
                 System.out.println("Nilai Huruf : A");
                 System.out.println("================");
                 System.out.println("================");
                 System.out.println("SELAMAT ANDA LULUS");
                } if (nilaiAKhir > 73 && nilaiAKhir <= 80) {
                    System.out.println("Nilai Huruf : B+"); 
                    System.out.println("================");
                    System.out.println("================");
                    System.out.println("SELAMAT ANDA LULUS");
                } if (nilaiAKhir > 65 && nilaiAKhir <= 73) {
                    System.out.println("Nilai Huruf : B");
                    System.out.println("================");
                    System.out.println("================");
                    System.out.println("SELAMAT ANDA LULUS");
                } if (nilaiAKhir > 60 && nilaiAKhir <= 65) {
                    System.out.println("Nilai Huruf : C+");
                    System.out.println("================");
                    System.out.println("================");
                    System.out.println("SELAMAT ANDA LULUS");
                } if (nilaiAKhir > 50 && nilaiAKhir <= 60) {
            System.out.println("Nilai Huruf : C");
            System.out.println("================");
            System.out.println("================");
            System.out.println("SELAMAT ANDA LULUS");
        } if (nilaiAKhir > 39 && nilaiAKhir <= 50) {
            System.out.println("Nilai Huruf : D");
            System.out.println("================");
            System.out.println("================");
            System.out.println("ANDA TIDAK LULUS");
        } if (nilaiAKhir < 39 ) {
            System.out.println("Nilai Huruf : E");
            System.out.println("================");
            System.out.println("================");
            System.out.println("ANDA TIDAK LULUS");
        }
            
        }
    }
}