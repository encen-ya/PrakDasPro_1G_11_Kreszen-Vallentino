package ALSD.TugasPertemuan13;

public class Pasien {
    public String nomor;
    public String nama;

    public Pasien(String nomor, String nama) {
        this.nomor = nomor;
        this.nama = nama;
    }

    public void print() {
        System.out.println(nomor + "\t" + nama + "\t|");
    }
}
