import java.util.Scanner;

public class P10_Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan : ");
        int jmlPesan = sc.nextInt();
        sc.nextLine();
        String[] namaMakanan = new String[jmlPesan];
        int[] harga = new int[jmlPesan];
        int totalHarga = 0;

        System.out.println("================================");

        for (int i = 0; i < jmlPesan; i++) {
            System.out.print("Masukkan nama makanan : ");
            namaMakanan[i] = sc.nextLine();
            System.out.print("Masukkan harga Makanan : ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            totalHarga += harga[i];
        }
        System.out.println("================================");
        System.out.println("daftar pesanan");
        for (int i = 0; i < jmlPesan; i++) {
            System.out.println("Pesanan " + (i + 1) + " : " +namaMakanan[i] + " - harga : " + harga[i]);
        }
        System.out.println("================================");
        System.out.println("Total harga pesanan : " + totalHarga);
    }
}
