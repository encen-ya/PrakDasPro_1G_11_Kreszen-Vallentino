import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        int jumlahPenggunaanListrik, totalTarifListrik;
        boolean melebihi500;    
        
        System.out.print("Jumlah penggunaan listrik(kWh): ");
        jumlahPenggunaanListrik = n.nextInt();
        System.out.print("Melebihi 500 (true/false) : ");
        melebihi500 = n.nextBoolean();
        
        totalTarifListrik = jumlahPenggunaanListrik * 1500;

        System.out.println("penggunaan listrik melebihi 500 kWh: " + melebihi500);
        System.out.println("Total Tarif listrik: " + totalTarifListrik);



    }
}
