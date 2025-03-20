package ALSD.Pratikum05;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();
    
        Mahasiswa11 m1 = new Mahasiswa11();
        Mahasiswa11 m2 = new Mahasiswa11();
        Mahasiswa11 m3 = new Mahasiswa11();
        Mahasiswa11 m4 = new Mahasiswa11();
        Mahasiswa11 m5 = new Mahasiswa11();
    
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
    
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
        
        
    }
    
}
