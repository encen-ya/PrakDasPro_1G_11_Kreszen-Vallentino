package ALSD.Kuis1;

public class Bioskop11 {
    public String nmKasir;
    public int Loket;
    public int Teater;

    public String nmPelanggan;
    public String nmFilm;
    public String tglNonton;

    void datakasir() {
        System.out.println("Nama Kasir      : " + nmKasir);
        System.out.println("Loket           : " + Loket);
        System.out.println("Teater          : " + Teater);
        System.out.println("============================");
    }

    void dataPelanggan() {
        System.out.println("Nama Pelanggan  : " + nmPelanggan);
        System.out.println("Judul Film      : " + nmFilm);
        System.out.println("Tanggal Nonton  : " + tglNonton);
        System.out.println("============================");
    }
}
