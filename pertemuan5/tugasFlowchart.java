import java.util.Scanner;

public class tugasFlowchart {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        String namaMakanan;
        double hargaNasgor, hargaMie, hargaFuyung, totalBelanja, totalB;
        double diskon1, diskon2, diskon3;
        int jumlahNasgor, jumlahMie, jumlahFuy;

        System.out.print("nama makanan: ");
        namaMakanan = n.nextLine();
        System.out.print("harga nasi goreng: ");
        hargaNasgor = n.nextDouble();
        System.out.print("harga mie rebus: ");
        hargaMie = n.nextDouble(); 
        System.out.print("harga fuyung hai: ");
        hargaFuyung = n.nextDouble();
        System.out.print("jumlah nasi goreng: ");
        jumlahNasgor = n.nextInt();
        System.out.print("jumlah mie rebus: ");
        jumlahMie = n.nextInt();
        System.out.print("jumlah fuyung hai: ");
        jumlahFuy = n.nextInt();

        totalBelanja = (hargaNasgor * jumlahNasgor) + (hargaMie * jumlahMie) + (jumlahFuy * hargaFuyung);

        //totalBelanja = hargaMakanan * jumlahMakanan;
        System.out.println("total belanja: " + totalBelanja);


        diskon1 = totalBelanja - (totalBelanja * 0.02) ;
        diskon2 = totalBelanja - (totalBelanja * 0.05) ;
        diskon3 = totalBelanja - (totalBelanja * 0.1);

        if (  totalBelanja > 100000 && totalBelanja <= 200000) {
            System.out.print("total belanja setelah diskon: " + diskon1);
        } else if (totalBelanja > 200000 && totalBelanja <= 500000) {
            System.out.println("total belanja setelah diskon: " + diskon2);
        } else if (totalBelanja > 500000) {
            System.out.println("total belanja setelah diskon: " + diskon3);
        } else {
            totalB = totalBelanja;
        }
        
    }
}
