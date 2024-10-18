import java.util.Scanner;

public class TugasP7_No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi = 0, total = 0;

        while (true) {
            System.out.print("masukkan jenis kendaraan: ");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.print("input durasi parkir: ");
            durasi = sc.nextInt();
        } else if (jenis == 0) {
            break;
        }
        
        if (durasi > 5) {
            total = 12500;
        } else if (jenis == 1) {
            total = durasi * 3000;
        } else if (jenis == 2) {
            total = durasi * 2000;    
        }
        System.out.println("total yang harus di bayar: " + total);
    }
    }
}

