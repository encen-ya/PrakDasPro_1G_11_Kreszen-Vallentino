import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    int baris, kolom;
                    while (true) {
                        System.out.print("Masukkan baris(1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom(1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        if (baris > 0 && baris <= 4 && kolom > 0 && kolom <= 2) {
                            if (penonton[baris-1][kolom-1] == null) {
                                penonton[baris-1][kolom-1] = nama;
                                System.out.println("Data penonton berhasil ditambahkan.");
                                break;
                            } else {
                                System.out.println("Kursi sudah terisi.");
                            } 
                        } else {
                            System.out.println("Posisi kursi tidak valid.");
                        }
                    }
                    
                    break;

                case 2:
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.println("Baris " + (i +  1) + " Kolom " + (j + 1) + ": " + 
                            (penonton[i][j] == null ? "***" : penonton[i][j]));
                    }
                }
                break;

                case 3:
                    System.out.println("Keluar dari program.");
                    return;

                default:
                    System.out.println("Silakan pilih menu yang tersedia.");
                    break;
            }
        }
    }
}
