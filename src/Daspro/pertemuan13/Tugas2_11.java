import java.util.Scanner;

public class Tugas2_11 {
    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 10, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}
    };

    static String[] menu = {"Kopi\t", "Teh\t", "Es Degan", "Roti Bakar", "Gorengan"};
    static String [] hari ={"Hari ke 1", "Hari ke 2", "Hari ke 3", "Hari ke 4", "Hari ke 5", "Hari ke 6", "Hari ke 7"};
    
    public static void editPenjualan(String namaMenu, int hari, int jumlahEdit) {
        int editMenu = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(namaMenu)) {
                editMenu = i;
                break;
            }
        }
        if (editMenu != -1 && hari >= 1 && hari <= 7) {
            penjualan[editMenu][hari - 1] = jumlahEdit;
            System.out.println("\nData penjualan " + namaMenu + " pada hari ke-" + hari + " berhasil diubah menjadi " + jumlahEdit);
        } else {
            System.out.println("\nMenu atau hari tidak valid.");
        }
    }
    public static void tampilkanSeluruhData() {
        System.out.println("\nData Penjualan:");

        System.out.print("\t");
            for (int i = 0; i < hari.length; i++) {
        System.out.print("\t     " + hari[i]);
    }
        System.out.println();

            for (int i = 0; i < menu.length; i++) {
                System.out.print(menu[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
            System.out.print("\t" + penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void menuTertinggi() {
        int banyakPenjualan = 0;
        String menuLaku = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;  
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > banyakPenjualan) {
                banyakPenjualan = total;
                menuLaku = menu[i];
            }
        }
        System.out.println("\nMenu yang memiliki penjualan tertinggi adalah " + menuLaku + " dengan total " + banyakPenjualan + " penjualan");
    }
    
    public static void rataRataPenjualan() {
        System.out.println("\nRata-rata penjualan tiap menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata =  total / (double) penjualan[i].length;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
    
            System.out.println("\n=== Menu  ===");
            System.out.println("1. Edit data penjualan");
            System.out.println("2. Tampilkan Seluruh Data Penjualan");
            System.out.println("3. Tampilkan Menu dengan Penjualan Tertinggi");
            System.out.println("4. Tampilkan rata - rata penjualan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                System.out.println("\nPilih menu untuk diedit:");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println((i + 1) + ". " + menu[i]);
                }
                System.out.print("Masukkan nomor menu: ");
                int menuPilihan = scanner.nextInt();
               
                String namaMenu = menu[menuPilihan - 1];
                System.out.print("Masukkan hari (1-7): ");
                int hari = scanner.nextInt();
                System.out.print("Masukkan jumlahEdit penjualan yang baru: ");
                int jumlahEdit = scanner.nextInt();
                editPenjualan(namaMenu, hari, jumlahEdit);
                break;

                case 2:
                    tampilkanSeluruhData();
                    break;

                case 3:
                    menuTertinggi();
                    break;

                case 4:
                  rataRataPenjualan();
                  break;

                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 5);
    }
}
