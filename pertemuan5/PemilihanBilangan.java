import java.util.Scanner;

/**
 * PemilihanBilangan
 */
public class PemilihanBilangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan sebuah angka: ");
        angka = sc.nextInt();
        if (angka % 2 == 0) 
        {
            System.out.println("angka " + angka + " termasuk bilangan genap");   
        }
        else {
            System.out.println("angka" + angka + " termasuk bilangan ganjil");
        }
    }

}