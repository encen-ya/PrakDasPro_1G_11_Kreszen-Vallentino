package ALSD.Pertemuan12;

import java.util.Scanner;

public class SLIMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList11 sll = new SingleLinkedList11();

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            sll.print();
        }
    }
}
