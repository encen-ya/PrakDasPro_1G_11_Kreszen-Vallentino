import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int jamKerja, upahPerJam;
        double gajiKaryawan, bonusGaji, gajiSebelumPajak, pajak, gajiBersih;

        System.out.print("jam kerja : ");
        jamKerja = n.nextInt();
        System.out.print("upah perjam : " );
        upahPerJam = n.nextInt();
        gajiKaryawan = jamKerja * upahPerJam;
        System.out.println("gaji karyawan : " + gajiKaryawan);
       
       
//      bonus gaji :  10%  
        bonusGaji = gajiKaryawan * 0.1;
        System.out.println("Bonus gaji : " + bonusGaji);
        
        gajiSebelumPajak = bonusGaji + gajiKaryawan;
        System.out.println("Gaji sebelum pajak : " + gajiSebelumPajak);
        pajak = gajiSebelumPajak * 0.05;
        System.out.println("pajak : " + pajak);
        gajiBersih = gajiSebelumPajak - pajak;
        System.out.println("Gaji bersih  : " + gajiBersih);


    }
}
