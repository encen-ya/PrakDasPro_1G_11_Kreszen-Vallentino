import java.util.Scanner;
public class P9_Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Politeknik yang mendaftar: ");
        int poltek = sc.nextInt();
        String namaPoltek = "", namaAtletBad = "", namaAtletTen = "", namaAtletBas = "", namaAtletVol = "";
        sc.nextLine();
        
        for (int i = 0; i < poltek; i++) {
            System.out.print("Masukkan nama Politeknik " + (i + 1) + ": ");
            namaPoltek = sc.nextLine();

            String daftarAtletBad = "", daftarAtletTen = "", daftarAtletBas = "",daftarAtletVol = "";
            
            System.out.println("Masukkan 5 nama atlet cabor Badminton: ");
            for (int j = 0; j < 5; j++) {
                System.out.print("Nama atlet " + (j + 1) + ": ");
                namaAtletBad = sc.nextLine();
                daftarAtletBad += namaAtletBad + "\n";
            }

            System.out.println("Masukkan 5 nama atlet cabor Tenis meja: ");
            for (int k = 0; k < 5; k++) {
                System.out.print("Nama atlet " + (k + 1) + ": ");
                namaAtletTen = sc.nextLine();
                daftarAtletTen += namaAtletTen + "\n";
            }

            System.out.println("Masukkan 5 nama atlet cabor Basket: ");
            for (int l = 0; l < 5; l++) {
                System.out.print("Nama atlet " + (l + 1) + ": ");
                namaAtletBas = sc.nextLine();
                daftarAtletBas += namaAtletBas + "\n";
            }

            System.out.println("Masukkan 5 nama atlet cabor Bola Voly: ");
            for (int m = 0; m < 5; m++) {
                System.out.print("Nama atlet " + (m + 1) + ": ");
                namaAtletVol = sc.nextLine();
                daftarAtletVol += namaAtletVol + "\n";
            }

            System.out.println("=== daftar atlet ===");
            System.out.println("daftar atlet " + namaPoltek);
            System.out.println("daftar nama atlet Badminton: " + "\n" + daftarAtletBad);
            System.out.println("daftar nama atlet Tenis meja: " + "\n" + daftarAtletTen);
            System.out.println("daftar nama atlet Basket: " + "\n" +  daftarAtletBas);
            System.out.println("daftar nama atlet Bola voly" + "\n" + daftarAtletVol);
    }
    sc.close();
}
}
