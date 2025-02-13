import java.util.Scanner;

public class tugas2 {
    static int hitungVolumeKubus (int sisi1, int sisi2, int sisi3) {
        int volume = sisi1 * sisi2 * sisi3;
        return volume;
    }
    static int hitungPermukaanKubus (int sisi1, int sisi2 ){
        int permukaan = 6 * sisi1 * sisi2;
        return permukaan;
    }
    static int hitungKelilingKubus (int sisi1, int sisi2 ){
        int permukaan = 12 * sisi1;
        return permukaan;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi, vol, p, kel;
        System.out.print("Masukkan panjang sisi: ");
        sisi = sc.nextInt();
        do {
            System.out.println("\n===Menu===");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.println("Masukkan Menu : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                vol = hitungVolumeKubus(sisi,sisi,sisi);
                System.out.println("Volume kubus adalah : " + vol);
                    
                    break;
                case 2:
                p = hitungPermukaanKubus(sisi, sisi);
                System.out.println("Luas Permukaan kubus adalah: " + p);
                break;
                case 3:
                kel = hitungKelilingKubus(sisi, sisi);
                System.out.println("Keliling Kubus adalah: " + kel);
                default:
                    break;
            }
        } while (true);


    }
}   
