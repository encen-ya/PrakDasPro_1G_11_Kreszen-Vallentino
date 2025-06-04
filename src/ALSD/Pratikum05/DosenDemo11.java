package ALSD.Pratikum05;

import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        DataDosen11 list = new DataDosen11();
        Scanner sc = new Scanner(System.in);
        int jumDsn = 5;

        for (int i = 0; i < jumDsn; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode Dosen: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            String jnsKelamin = sc.nextLine();
            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();  
            boolean jenisKelamin = jnsKelamin.equalsIgnoreCase("L");

            list.tambah(new Dosen11(kode, nama, jenisKelamin, usia));
        }

        list.tampil();

        System.out.println("--------------------------------------------------");
        System.out.print("Masukkan nama dosen yang dicari: ");
        String cariNama = sc.nextLine();
        list.sequentialSearching(cariNama); 

        System.out.println("--------------------------------------------------");
        System.out.print("Masukkan usia dosen yang dicari: ");
        int cariUsia = sc.nextInt();
        list.binarySearchUsia(cariUsia);
        
        
    }
}
