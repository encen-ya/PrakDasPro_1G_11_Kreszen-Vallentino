public class ClassDosen11 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

public ClassDosen11() {

}
public ClassDosen11(String idDos, String nama, boolean statusAktif, int tahunMasuk, String bidang) {
    idDosen = idDos;
    this.nama = nama;
    this.statusAktif = statusAktif;
    tahunBergabung = tahunMasuk;
    bidangKeahlian = bidang;
}
    
    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif : " + statusAktif);
        if (statusAktif == true) {
            System.out.println("Dosen Aktif");
        } if (statusAktif == false) {
            System.out.println("Dosen Tidak Aktif");
        } 
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Masa kerja = " + hitungMasaKerja(2025));
    }
    
        void setStatusAktif(boolean status) {
           statusAktif = status;
            }

int hitungMasaKerja(int thnSkrg) {
    int masaKerja = thnSkrg -= tahunBergabung;
    return masaKerja;
}
void ubahKeahlian(String bidang) {
    bidangKeahlian = bidang;
}

}
