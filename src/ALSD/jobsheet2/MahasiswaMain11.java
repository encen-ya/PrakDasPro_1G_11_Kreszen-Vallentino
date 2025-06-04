package ALSD.jobsheet2;

public class MahasiswaMain11 {
    public static void main(String[] args) {
        Mahasisswa11 mhsl = new Mahasisswa11();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

        Mahasisswa11 mhs2 = new Mahasisswa11("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasisswa11 mhsKreszen = new Mahasisswa11("Kreszen Vallentino", "244107020205", 3.39, "TI 1G");
        mhsKreszen.tampilkanInformasi();

    }
}