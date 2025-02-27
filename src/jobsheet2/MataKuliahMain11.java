public class MataKuliahMain11 {
    public static void main(String[] args) {
       MattaKuliah11 matkul = new MattaKuliah11();
        matkul.kodeMK = "BD_TI";
        matkul.nama = "Basis Data";
        matkul.jumlahJam = 4;
        matkul.sks = 22;

        matkul.tampilkanInformasi();
        matkul.ubahSKS(24);
        matkul.tambahJam(4);
        matkul.kurangiJam(9);
        matkul.tampilkanInformasi();;

        MattaKuliah11 matkul2 = new MattaKuliah11("SISOP_TI", "Sistem Operasi", 6, 24);
        matkul2.tampilkanInformasi();
    }
}
