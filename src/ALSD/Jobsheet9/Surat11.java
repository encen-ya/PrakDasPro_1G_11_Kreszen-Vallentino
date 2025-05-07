package ALSD.Jobsheet9;

public class Surat11 {
    public String idSurat;
    public String namaMahasiswa;
    public String kelas;
    public char jenisIzin;
    public int durasi;
    
public Surat11 () {

}

public Surat11(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

public void printSurat() {
        System.out.println("ID Surat\t\t: " + idSurat);
        System.out.println("Nama Mahasiswa\t: " + namaMahasiswa);
        System.out.println("Kelas\t\t\t: " + kelas);
        System.out.println("Jenis Izin\t\t: " + (jenisIzin == 'S' ? "Sakit" : "Izin Lain"));
        System.out.println("Durasi (hari)\t: " + durasi);
        System.out.println("-------------------------");
    }


}