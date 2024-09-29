import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

/**
 * PemilihanSwitch11
 */
public class PemilihanSwitch11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
        char operator;

            System.out.print("Masukkan angka 1: ");
            angka1 = sc.nextInt();
            System.out.print("Masukkan angka 2 : ");
            angka2 = sc.nextInt();
            System.out.print("Masukkan Operator(+ - * :)");
            operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    hasil = angka1 / angka2;
                    break;
            }
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
        
    }
}