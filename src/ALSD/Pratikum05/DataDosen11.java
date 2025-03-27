package ALSD.Pratikum05;

public class DataDosen11 {
    Dosen11 listDsn[] = new Dosen11[10];
    int idx = 0;

    void tambah(Dosen11 d){
        if (idx < listDsn.length) {
            listDsn[idx] = d;
            idx++;
        }
    }
    void tampil() {
        for (int i = 0; i < idx; i++) {
            listDsn[i].tampilInformasi();
            System.out.println("-------------------------------------------");
        }
    }
    
    int sequentialSearching(String cari) {
        for (int j = 0; j < idx; j++) { 
            if (listDsn[j].nama.equalsIgnoreCase(cari)) { 
                return j; 
            }
        }
        return -1; 
    }

    
    
    // void bubbleSort() {
    //     for (int i = 0; i < listDsn.length; i++) {
    //         for (int j = 1; j < listDsn.length; j++) {
    //             if (listDsn[j - 1].usia > listDsn[j].usia) {
    //                 Dosen11 temp = listDsn[j];
    //                 listDsn[j] = listDsn[j - 1];
    //                 listDsn[j - 1] = temp;
    //             }
    //         }
    //     }
    // }
    // void insertionSort() {
    //     for (int i = 1; i < listDsn.length; i++) {
    //         Dosen11 temp = listDsn[i];
    //         int j = i;
    //         while (j > 0 && listDsn[j - 1].usia < temp.usia) {
    //             listDsn[j] = listDsn[j - 1];
    //             j--;
    //         }
    //         listDsn[j] = temp;
    //     }
    // }
    void tampilPosisi(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Data Dosen dengan Nama: " + nama + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data dengan Nama: " + nama + " tidak ditemukan");
        }
    }
    
    void tampilDataSearch(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Kode Dosen    : " + listDsn[pos].kode);
            System.out.println("Nama          : " + listDsn[pos].nama);
            System.out.println("Usia          : " + listDsn[pos].usia);
            System.out.println("Jenis Kelamin : " + (listDsn[pos].jnsKelamin ? "Laki-laki" : "Perempuan"));
        } else {
            System.out.println("Data dosen dengan Nama " + nama + " tidak ditemukan");
        }
    }
    
    
    
}
