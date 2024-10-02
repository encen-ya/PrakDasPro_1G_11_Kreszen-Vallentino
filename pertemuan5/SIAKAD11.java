import java.util.Scanner;
public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas, nilaiAkhirHuruf, kualifikasi;
        byte absen;
        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;
        int a = 90;

        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Nim: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir= (nilaiKuis*0.2 + nilaiTugas*0.15 + nilaiUTS*0.30 + nilaiUAS*0.35);

        if (80 < nilaiAkhir && nilaiAkhir < 100 ) {
            nilaiAkhirHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (73 < nilaiAkhir && nilaiAkhir <= 80) {
            nilaiAkhirHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (65 < nilaiAkhir && nilaiAkhir <= 73) {
            nilaiAkhirHuruf = "B";
            kualifikasi = "Baik";
        } else if (60 < nilaiAkhir && nilaiAkhir <= 65) {
            nilaiAkhirHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (50 < nilaiAkhir && nilaiAkhir <= 60) {
            nilaiAkhirHuruf = "C";
            kualifikasi = "Cukup";
        } else if (39 < nilaiAkhir && nilaiAkhir <= 50 ) {
            nilaiAkhirHuruf = "D";
            kualifikasi = "Kurang";
        } else  {
            nilaiAkhirHuruf = "E";
            kualifikasi = "Gagal";
        }

        
            System.out.println("Nama: " + nama + " Nim: " + nim);
            System.out.println("Kelas: " + kelas + " Absen: " + absen);
            System.out.println("nilaiAkhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf :" + nilaiAkhirHuruf);
            System.out.print("kualifikasi: " + kualifikasi );
        
    }
    
}
