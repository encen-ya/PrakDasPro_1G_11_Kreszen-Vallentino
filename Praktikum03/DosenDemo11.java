import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen11[] arrDosen11 = new Dosen11[3];  

        for (int i = 0; i < arrDosen11.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                     : ");
            String kode = sc.nextLine();
            System.out.print("Nama                     : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin            : ");
            String jnsKelamin = sc.nextLine();

            
            boolean jenisKelamin = jnsKelamin.equalsIgnoreCase("pria");

            System.out.print("Usia                     : ");
            int usia = sc.nextInt();
            sc.nextLine();  
            System.out.println("----------------------------------");

            arrDosen11[i] = new Dosen11(kode, nama, jenisKelamin, usia);
        }

        int i = 1;
        for (Dosen11 dosen : arrDosen11) {
            System.out.println("Data dosen ke-" + i);
            System.out.println("Kode                     : " + dosen.kode);
            System.out.println("Nama                     : " + dosen.nama);
            System.out.println("Jenis Kelamin            : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia                     : " + dosen.usia);
            System.out.println("----------------------------------");
            i++;
        }

    }
}
