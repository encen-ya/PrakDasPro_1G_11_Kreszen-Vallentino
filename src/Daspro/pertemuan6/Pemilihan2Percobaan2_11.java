import java.util.Scanner;
public class Pemilihan2Percobaan2_11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        int pilihanMenu, harga, potonganQris=1000;
        String member, jenisPembayaran;
        double diskon = 0.0, totalBayar = 0.0;

        System.out.println("--------------------------");
        System.out.println("===== MENU KAFE JTI ======");
        System.out.println("--------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanMenu = input11.nextInt();
        input11.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input11.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("harga Ricebowl = " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("harga Ice Tea = " + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            totalBayar = harga - (harga * diskon);  
            System.out.println("Total bayar setelah diskon = " + totalBayar);
        }
    else if (member.equalsIgnoreCase("n")) {
        if (pilihanMenu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);
        } else if (pilihanMenu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
        } else if (pilihanMenu == 3) {
            harga = 15000;
            System.out.println("harga bundling = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }
        System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("member tidak vallid");
            return;
        }
        System.out.print("Apakah jenis pembayaran melalui QRIS (y/n)? = ");
        jenisPembayaran = input11.nextLine();

        if (jenisPembayaran.equalsIgnoreCase("y")) {
            totalBayar = totalBayar - potonganQris;
            System.out.println("Pembayaran melalui QRIS");
        } 

        System.out.println("Total bayar setelah potongan = " + totalBayar)  x   ;
        System.out.println("--------------------------------------");

    }
} 

