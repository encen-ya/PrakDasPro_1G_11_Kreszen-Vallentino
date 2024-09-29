import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * PemilihanBilangan
 */
public class PemilihanBilangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan sebuah angka: ");
        angka = sc.nextInt();
        String hasil = (angka % 2 == 0) ? "angka " + angka + " termasuk bilangan genap" : "angka " + angka + " termasuk bilangan ganjil"; 
        System.out.println(hasil);
        
    }

}