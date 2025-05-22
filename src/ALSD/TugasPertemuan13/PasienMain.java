package ALSD.TugasPertemuan13;

import java.util.Scanner;

public class PasienMain {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        QueuePasien antrian =  new QueuePasien();

        int menu;
        do {
            
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println();
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            menu = sc.nextInt();
            sc.nextLine();

            
            switch (menu) {
            case 1:
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("Nomor Antrian:");
                String nmr = sc.nextLine();
                System.out.println("Nama Penerima:");
                String nm = sc.nextLine();
                Pasien antri = new Pasien(nmr, nm);
                antrian.enqueue(antri);
                break;
            case 2:
                antrian.dequeue();
                break;
            case 3: 
                antrian.printQueue();
                break;
            case 4:
                    break;
            }
        } 
        
        while (menu != 0);
    }
}
