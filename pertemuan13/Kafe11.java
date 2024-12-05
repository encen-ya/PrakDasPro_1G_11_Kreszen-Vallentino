import java.util.Scanner;

public class Kafe11 {
    public static void menu(String namaPelanggan, Boolean isMember, String KodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }
        if (KodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Diskon 50%");
        } else if (KodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Diskon 30%");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahakan Pilih Menu Yang Anda inginkan");
    }
    public static int hitungTotalHarga11( int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000,18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7;
        } else {
            System.out.println("tidak ada pengurangan total harga");
        }
        return hargaTotal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu("Andi", true, "DISKON50");

        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();
        int totalHarga = hitungTotalHarga11(pilihanMenu, banyakItem,kodePromo);
        
        System.out.println("Total harga untuk pesanan anda: Rp " + totalHarga);
    }
}