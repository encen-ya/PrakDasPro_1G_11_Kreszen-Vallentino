package ALSD.jobsheet2;

public class Mahasisswa11 {
        String nama;
        String nim;
        String kelas;
        double ipk;

public Mahasisswa11() {

}
public Mahasisswa11(String nm, String nim, double ipk, String kls) {
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    kelas = kls;
    
}

        void tampilkanInformasi() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("IPK : " + ipk);
            System.out.println("Kelas: " + kelas);
        }

        void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }

        void updateIpk(double ipkBaru) {
            ipk = ipkBaru;
        }

        String nilaiKinerja() {
            if (ipk >= 3.5) {
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0)   {
                return "Kinerja baik";
            } else if (ipk >= 2.0) {
                return "Kinerja cukup";
            } else if (ipk < 0.0 || ipk > 4.0) {
                return "IPK tidak valid. Harus antara 0.0 dan 4.0 ";
            } else {
                return "Kinerja kurang";
            }
        }
    }

