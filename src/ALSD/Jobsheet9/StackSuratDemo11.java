package ALSD.Jobsheet9;

import java.util.Scanner;

public class StackSuratDemo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); 
        StackSurat11 stackSurat = new StackSurat11(10);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin ");
            System.out.println("2. Proses Surat Izin ");
            System.out.println("3. Lihat Surat Izin Terakhir ");
            System.out.println("4. Cari Surat ");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scanner.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scanner.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Jenis Izin (S: Sakit, I: Izin Lain): ");
                    char jenisIzin = scanner.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scanner.nextInt();
                    scanner.nextLine(); 

                    Surat11 suratBaru = new Surat11(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stackSurat.push(suratBaru);
                    break;
                case 2:
                    Surat11 suratDiproses = stackSurat.pop();
                    if (suratDiproses != null) {
                        System.out.println("Surat izin berikut telah diproses:");
                        suratDiproses.printSurat();
                    }
                    break;
                case 3:
                    stackSurat.peek();
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = scanner.nextLine();
                    stackSurat.cariSurat(namaCari);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

    }
}