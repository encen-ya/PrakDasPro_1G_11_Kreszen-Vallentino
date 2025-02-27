import java.util.Scanner;

public class tugas_Flowchart3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kodeSepatu;

        System.out.println("Pilih Kode Sepatu (1-3): ");
        System.out.println("1. Converse");
        System.out.println("2. Sketcher");
        System.out.println("3. Nike");

        System.out.print("Masukkan kode sepatu: ");
        kodeSepatu = input.nextInt();

        switch (kodeSepatu) {
            case 1:
                System.out.println("Merk: Converse");
                System.out.println("Kategori: Slip On / High Top");
                System.out.println("Ukuran: 36-40 / 40-44");
                System.out.println("Harga: 800.000 / 1.200.000");
                break;
            case 2:
                System.out.println("Merk: Sketcher");
                System.out.println("Kategori: Woman / Man");
                System.out.println("Ukuran: 36-41 / 41-44");
                System.out.println("Harga: 1.000.000 / 1.800.000");
                break;
            case 3:
                System.out.println("Merk: Nike");
                System.out.println("Kategori: Kids / Adult");
                System.out.println("Ukuran: 36-40 / 40-44");
                System.out.println("Harga: 750.000 / 1.500.000");
                break;
            default:
                System.out.println("Kode sepatu tidak valid!");
                break;
        }

    }
}
