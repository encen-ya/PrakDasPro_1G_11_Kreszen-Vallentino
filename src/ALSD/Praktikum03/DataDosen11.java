package ALSD.Praktikum03;
public class DataDosen11 {
    public DataDosen11(Dosen11[] arraytOfDosen){
    }
    void dataSemuaDosen(Dosen11[] arrayOfDosen11) {
        int i = 1;
        for (Dosen11 dosen : arrayOfDosen11) {
            System.out.println("Data dosen ke-" + i);
            System.out.println("Kode                     : " + dosen.kode);
            System.out.println("Nama                     : " + dosen.nama);
            System.out.println("Jenis Kelamin            : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia                     : " + dosen.usia);
            System.out.println("----------------------------------------------");
            i++;
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen11) {
        int pr = 0, wn = 0;
        for (Dosen11 dosen : arrayOfDosen11) {
            if (dosen.jenisKelamin) {
                pr++;
            } else {
                wn++;
            }
        } 
        System.out.println("Jumlah Dosen per Jenis Kelamin");
        System.out.println("Jumlah Dosen Pria : " + pr);
        System.out.println("Jumlah Dosen Wanita : " + wn);  
        System.out.println("----------------------------------------------");
    }
    void rerataUsiaPerJenisKelamin(Dosen11[] arrayOfDosen11) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int Pria = 0, Wanita = 0;

        for (Dosen11 dosen : arrayOfDosen11) {
            if (dosen.jenisKelamin) { 
                totalUsiaPria += dosen.usia;
                Pria++;
            } else { 
                totalUsiaWanita += dosen.usia;
                Wanita++;
            }
        }
        System.out.println("Rata-rata Usia Dosen per Jenis Kelamin:");
            System.out.println("Rata-rata usia dosen pria   : " + (totalUsiaPria / Pria));
            System.out.println("Rata-rata usia dosen wanita : " + (totalUsiaWanita / Wanita));
            System.out.println("----------------------------------------------");
       
        }
        void dosenTermuda(Dosen11[] arrayOfDosen11) {
            Dosen11 termuda = arrayOfDosen11[0];
    
            for (Dosen11 dosen : arrayOfDosen11) {
                if (dosen.usia < termuda.usia) {
                    termuda = dosen;
                }
            }
            System.out.println("Dosen Termuda:");
            System.out.println("Kode                     : " + termuda.kode);
            System.out.println("Nama                     : " + termuda.nama);
            System.out.println("Jenis Kelamin            : " + (termuda.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia                     : " + termuda.usia);
            System.out.println("----------------------------------------------");
        }
        void dosenTertua(Dosen11[] arrayOfDosen11) {
             Dosen11 tertua = arrayOfDosen11[0];
    
            for (Dosen11 dosen : arrayOfDosen11) {
                if (dosen.usia > tertua.usia) {
                    tertua = dosen;
                }
            }
            System.out.println("Dosen Tertua:");
            System.out.println("Kode                     : " + tertua.kode);
            System.out.println("Nama                     : " + tertua.nama);
            System.out.println("Jenis Kelamin            : " + (tertua.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia                     : " + tertua.usia);
            System.out.println("----------------------------------------------");
        }
}
