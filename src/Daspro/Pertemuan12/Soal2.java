import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner echen = new Scanner(System.in);
        System.out.println("Masukkan Tinggi badan(dalam cm): ");
        double tb = echen.nextDouble();
        System.out.println("Masukkan berat badan: ");
        double bb = echen.nextDouble();
        double tbm = tb / 100;
        double imt = bb / (tbm * tbm);
        System.out.println(imt);
        if (imt < 17) {
            System.out.println("sangat kurus");}
        if (imt >= 17 && imt < 18.5 ) {
            System.out.println("kurus");}
        if (imt >= 18.5 && imt <= 25.0) {
            System.out.println("normal");}
        if (imt >= 25.0 && imt <= 27.0) {
            System.out.println("gemuk");}
        if (imt > 27.00) {
            System.out.println("obesitas");} 
    }
}
