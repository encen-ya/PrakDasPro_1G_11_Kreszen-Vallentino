public class MataKuliah11 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

public MataKuliah11() {

}
public MataKuliah11(String kodeMatkul, String nama, int sks, int jmlJam) {
    kodeMK = kodeMatkul;
    this.nama = nama;
    this.sks = sks;
    jumlahJam = jmlJam;

}

    void tampilkanInformasi(){
        System.out.println();
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah di ubah");
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan");
        } else {
            jumlahJam -= jam;
        }
    }
}
