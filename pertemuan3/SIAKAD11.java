import java.util.Scanner;
public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        byte absen;
        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;

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

        System.out.println("Nama: " + nama + " Nim: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("nilaiAkhir: " + nilaiAkhir);

        
    }
    
}
