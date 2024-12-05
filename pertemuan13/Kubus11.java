import java.util.Scanner;

public class Kubus11 {
    static int hitungVolumeKubus (int sisi1, int sisi2, int sisi3) {
        int volume = sisi1 * sisi2 * sisi3;
        return volume;
    }
    static int hitungPermukaanKubus (int sisi1, int sisi2 ){
        int permukaan = 6 * sisi1 * sisi2;
        return permukaan;
    }
    public static void main(String[] args) {
        Scanner echen = new Scanner(System.in);
        int sisi, vol, p;
        System.out.print("Masukkan panjang sisi: ");
        sisi = echen.nextInt();

        vol = hitungVolumeKubus(sisi,sisi,sisi);
        System.out.println("Volume kubus adalah : " + vol);
        p = hitungPermukaanKubus(sisi, sisi);
        System.out.println("Luas Permukaan kubus adalah: " + p);



    }
}   
