package ALSD.Kuis1;

import java.util.Scanner;

public class dataBioskop11 {
    public static void main(String[] args) {
        Scanner ec = new Scanner(System.in);
        Bioskop11[] arrBioskop = new Bioskop11[3];

        for (int i = 0; i < arrBioskop.length; i++) {
            arrBioskop[i] = new Bioskop11();

            System.out.println("Masukkan Data Kasir ke-" + (i + 1));
            System.out.print("Nama Kasir        : ");
            arrBioskop[i].nmKasir = ec.nextLine();
            System.out.print("Loket             : ");
            arrBioskop[i].Loket = ec.nextInt();
            System.out.print("Teater            : ");
            arrBioskop[i].Teater = ec.nextInt();
            ec.nextLine(); 

            System.out.println("Masukkan Data Pelanggan ke-" + (i + 1));
            System.out.print("Nama Pelanggan    : ");
            arrBioskop[i].nmPelanggan = ec.nextLine();
            System.out.print("Judul Film        : ");
            arrBioskop[i].nmFilm = ec.nextLine();
            System.out.print("Tanggal Nonton    : ");
            arrBioskop[i].tglNonton = ec.nextLine();

            System.out.println();
        }

        for (int i = 0; i < arrBioskop.length; i++) {
            System.out.println("Data Kasir Ke-" + (i + 1));
            arrBioskop[i].datakasir();
            arrBioskop[i].dataPelanggan();
        }
    }
}
