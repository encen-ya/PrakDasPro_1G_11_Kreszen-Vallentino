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

        DataDosen11 dataDosen = new DataDosen11(arrDosen11);

        dataDosen.dataSemuaDosen(arrDosen11);

        dataDosen.jumlahDosenPerJenisKelamin(arrDosen11);

        dataDosen.rerataUsiaPerJenisKelamin(arrDosen11);

        dataDosen.dosenTermuda(arrDosen11);
        
        dataDosen.dosenTertua(arrDosen11);

    }
}
