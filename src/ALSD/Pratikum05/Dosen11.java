package ALSD.Pratikum05;

public class Dosen11 {
        String kode;
        String nama;
        boolean jnsKelamin;
        int usia;
    
        Dosen11() {
        }
    
        Dosen11(String kode, String nama, boolean jnsKelamin, int usia) {
            this.kode = kode;
            this.nama = nama;
            this.jnsKelamin = jnsKelamin;
            this.usia = usia;
        }
    
        void tampilInformasi() {
            System.out.println("Kode: " + kode);
            System.out.println("Nama: " + nama);
            System.out.println("jenis kelamin : "+(jnsKelamin?"laki laki":"Perempuan"));
            System.out.println("Usia: " + usia);
        }
}
