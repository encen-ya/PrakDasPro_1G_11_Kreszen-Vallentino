package ALSD.Pratikum05;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();
    
        Mahasiswa11 m1 = new Mahasiswa11("123",  "Ali",   "2B", 3.9);
        Mahasiswa11 m2 = new Mahasiswa11("124",  "ila",   "2B", 3.1);
        Mahasiswa11 m3 = new Mahasiswa11("125",  "agus",  "2B", 3.6);
        Mahasiswa11 m4 = new Mahasiswa11("126",  "tika",  "2B", 3.3);
        Mahasiswa11 m5 = new Mahasiswa11("127",  "udin",  "2B", 3.2);
    
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
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();  
        
    }
    
}
