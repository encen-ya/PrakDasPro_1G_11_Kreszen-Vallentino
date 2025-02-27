import java.util.Scanner;

public class tugas_Flowcahrt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku, jumlahDiskon;

        System.out.print("Jenis buku yang di beli : ");
        jenisBuku = sc.nextLine();
        System.out.print("jumlah buku yang di beli : ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus") && jumlahBuku == 1 && jumlahBuku <= 2) {
            System.out.println("diskon 10%");
        } if (jenisBuku.equalsIgnoreCase("kamus") && jumlahBuku > 2) {
            System.out.println("diskon 12%");
        } if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku == 1 && jumlahBuku <= 3) {
            System.out.println("diskon 8%");
        } if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku > 3) {
            System.out.println("diskon 9%");
        }else if (jumlahBuku > 3) {
            System.out.println("diskon 5%");
        }


    }
}
