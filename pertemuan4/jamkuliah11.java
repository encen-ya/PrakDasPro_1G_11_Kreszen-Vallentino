import java.util.Scanner;

public class jamkuliah11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama  : Kreszen Vallentino Arjuna Wijono");
        System.out.println("Nim   : 244107020206");
        System.out.println("Absen : 11");
        System.out.println("========= PROGRAM MENGHITUNG JAM KULIAH =========");

        int jamSaatIni11, menitSaatIni11, jamMasukKuliah11, menitMasukKuliah11, jamkuliah11, sisaWaktuA11, sisaWaktuB11, durasi11;
        int jamA11, menitA11;
        System.out.print("masukkan jam saat ini: ");
        jamSaatIni11 = input.nextInt();
        System.out.print("masukkan menit saat ini: ");
        menitSaatIni11 = input.nextInt();

        System.out.println("jam saat ini : " + jamSaatIni11 + ":" + menitSaatIni11);

        System.out.print("masukkan jam kuliah: ");
        jamMasukKuliah11 = input.nextInt();
        System.out.print("menit masuk kuliah: ");
        menitMasukKuliah11 = input.nextInt();

        System.out.println("jam kuliah anda dimulai : " + jamMasukKuliah11 + ":" + menitMasukKuliah11);

        sisaWaktuA11 = (jamSaatIni11 * 3600) + (menitSaatIni11 * 60);
        sisaWaktuB11 = (jamMasukKuliah11 * 3600) + (menitMasukKuliah11 * 60);

        durasi11 = sisaWaktuB11 - sisaWaktuA11;

        jamA11 = durasi11 / 3600;
        menitA11 = durasi11 / 60;

        System.out.println("sisa waktu menuju jam kuliah: " + jamA11 + " jam " + menitA11 + " menit" );



        

    }
}
