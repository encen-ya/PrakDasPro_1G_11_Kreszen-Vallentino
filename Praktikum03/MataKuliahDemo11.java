import java.util.Scanner;

public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah11[] arrayOfMatakuliah = new MataKuliah11[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkann Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah11("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData(sc);
        }   

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
 }

