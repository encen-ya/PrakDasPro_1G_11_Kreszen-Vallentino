package ALSD.Pertemuan12;

public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa11(){

    }
    Mahasiswa11(String nm, String name, String kls, double ip) {
        this.nim= nm;
        this.nama=name;
        this.kelas= kls;
        this.ipk= ip;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk );
    }
}
