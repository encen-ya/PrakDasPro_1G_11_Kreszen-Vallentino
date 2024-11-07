import java.util.Scanner;

public class P10_Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.print("Masukkan nama makanan/minuman yang ingin dicari : ");
        String namaMakanan = sc.nextLine();
        int cari = -1;

        for (int i = 0; i < menu.length; i++) {
            if (namaMakanan.equalsIgnoreCase(menu[i])) {
                cari = i;
                break;
            }
        }
        if (cari != -1) {
            System.out.println("Makanan Tersedia");
        } else {
            System.out.println("Makanan tidak tersedia di menu");
        }
        sc.close();
    }
}