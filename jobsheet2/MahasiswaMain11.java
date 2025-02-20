public class MahasiswaMain11 {String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("nim: " + ipk);
        System.out.println("nim: " + kelas);
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
        } else if (ipk < 0.0 && ipk > 4.0) {
            return "IPK tidak valid. Harus antara 0.0 dan 4.0 ";
        } else {
            return "Kinerja kurang";
        }
    }
    public static void main(String[] args) {
        MahasiswaMain11 mhsl = new MahasiswaMain11();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

    }
}