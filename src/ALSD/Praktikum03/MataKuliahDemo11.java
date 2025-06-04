package ALSD.Praktikum03;
import java.util.Scanner;

public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pnjgElemen;
        System.out.print("Masukkan panjang elemen : ");
        pnjgElemen =  sc.nextInt();
        sc.nextLine();
        MataKuliah11[] arrayOfMatakuliah = new MataKuliah11[pnjgElemen];
        for (int i = 0; i < pnjgElemen; i++) {
            System.out.println("Masukkann Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah11("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData(sc);
        }   

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
 }

