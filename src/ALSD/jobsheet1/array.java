import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================");
        System.out.print("Masukkan Jumlah Matkul: ");
        int mataKuliah = scanner.nextInt();
        scanner.nextLine();
        
        String[] matkul = new String[mataKuliah];
        double[] nilaiAngka = new double[mataKuliah];
        double[] bobotNilai = new double[mataKuliah];
        String[] nilaiHuruf = new String[mataKuliah];

        for (int i = 0; i < mataKuliah; i++) {
            System.out.print("Masukkan nama Matkul: " );
            matkul[i] = scanner.nextLine();
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            scanner.nextLine();

            if (nilaiAngka[i] >= 85) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] >= 75) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] >= 70) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            }
        }
        
        
        System.out.println("\n=================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("=================================");
        System.out.println("MK\t                 Nilai Angka     Nilai Huruf   Bobot Nilai");
        System.out.println("====================================================================================");
        
        double totalBobot = 0;
        int jumlahMK = mataKuliah;
        
        for (int i = 0; i < mataKuliah; i++) {
            totalBobot += bobotNilai[i];
            System.out.println(matkul[i] +"\t" + "\t    " + nilaiAngka[i] + "\t      " + nilaiHuruf[i] + "\t    " + bobotNilai[i]);
        }
        
        double ip = totalBobot / jumlahMK;
        System.out.println("=================================");
        System.out.println("IP : " + ip);
    }
}
