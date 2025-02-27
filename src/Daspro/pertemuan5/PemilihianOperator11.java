/**
 * PemilihianOperator11
 */
import java.util.Scanner;
public class PemilihianOperator11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil=0;
        char operator;

        System.out.print("Masukkan angka1: ");
        angka1 = sc.nextDouble();
        System.out.print("masukkan angka2: ");
        angka2 = sc.nextDouble();
        System.out.print("operator(+-*/): ");
        operator = sc.next().charAt(0);
        
        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            hasil = angka1 / angka2;
        } else {
            System.out.println("operator yang dipilih tidak sesuai");
            return;
        }
        
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}