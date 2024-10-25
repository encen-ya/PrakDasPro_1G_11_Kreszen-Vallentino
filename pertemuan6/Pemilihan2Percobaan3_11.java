import java.util.Scanner;
public class Pemilihan2Percobaan3_11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan kategori : ");
        kategori = input11.nextLine();
        System.out.print("Masukkan besarnya penghasilan : ");
        penghasilan = input11.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2_000_000) {
                pajak = 0.1;}
            else if (penghasilan <= 3_000_000) {
                pajak = 0.15;}
            else 
                pajak = 0.2;
                gajiBersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.println( "Penghasil bersih : " + gajiBersih);
            } else if (kategori.equals("pebisnis")) {
                if (penghasilan <= 2_500_000) {
                    pajak = 0.15;}
                else if (penghasilan <= 3_500_000) {
                    pajak = 0.2;}
                else 
                    pajak = 0.25;
                gajiBersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.print("Penghasil bersih : " + gajiBersih);
            } else  
                System.out.println("Masukan Kategori salah");
                }
        }