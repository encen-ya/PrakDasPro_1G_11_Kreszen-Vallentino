import java.util.Scanner;
import java.util.scanner;
public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner sc = new scanner(system.in);
        String nama, nim;
        char kelas;
        byte Absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.println("Masukkan nama:  ");
        nama = sc.nextline("Kreszen Vallentino Arjuna Wijono");
        System.out.println("Masukkan NIM;  ");
        nim = sc.nextLine("244017020206");
        System.out.println("Masukkan kelas:  ");
        kelas = sc.nextLine("1G").charAt(0);
        System.out.println("Masukkan nomor absen:  ");
        absen = sc.nextByte("11");
        System.out.println("Masukkan nilai kelas;  ");
        nilaiKuis = sc.nextDouble("85");
        System.out.println("Masukkan nilai tugas:  ");
        nilaiTugas = sc.nextDouble("86");
        System.out.println("Masukkan nilai ujian:  ");
        nilaiUjian = sc.nextDouble("87");

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Nama:  " + nama + "NIM:  " + nim);
        System.out.println("Kelas:  " + kelas + "Absen:  " + absen);
        System.out.println("Nilai Akhir:  " + nilaiAkhir );
    }
    
}
