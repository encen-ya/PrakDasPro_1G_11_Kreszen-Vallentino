public class ClassDosenMain11 {
    public static void main(String[] args) {
        ClassDosen11 dosen = new ClassDosen11();
        dosen.idDosen = "CR";
        dosen.nama = "Cahya Rahmad";  
        dosen.statusAktif = true;
        dosen.tahunBergabung = 2003;
        dosen.bidangKeahlian = "Aljabar Linear";

        dosen.tampilkanInformasi();
        dosen.setStatusAktif(false);
        dosen.ubahKeahlian("agama");
        System.out.println("Masa kerja = " + dosen.hitungMasaKerja(2025));
        System.out.println("");
        dosen.tampilkanInformasi();


        ClassDosen11 dosen2 = new ClassDosen11("VIS", "Candra Bella Vista", true, 2000, "Basis Data"  );
        System.out.println("");
        dosen2.tampilkanInformasi();    
        System.out.println("Masa kerja = " + dosen2.hitungMasaKerja(2025));
    }
}
