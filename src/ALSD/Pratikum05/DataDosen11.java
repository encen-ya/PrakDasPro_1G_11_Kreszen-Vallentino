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
    
   void sequentialSearching(String cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listDsn[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Data Dosen dengan Nama '" + cari + "' ditemukan pada indeks " + posisi);
            listDsn[posisi].tampilInformasi();
        } else {
            System.out.println("Data dengan Nama '" + cari + "' tidak ditemukan.");
        }
    }

    void binarySearchUsia(int cari) {
        int left = 0, right = idx - 1;
        int mid = -1;
    
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (listDsn[mid].usia == cari) {
                break;
            } else if (listDsn[mid].usia > cari) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    
        if (mid == -1 || listDsn[mid].usia != cari) {
            System.out.println("Data dengan Usia " + cari + " tidak ditemukan.");
            return;
        }
    
        int i = mid, j = mid;
        while (i > 0 && listDsn[i - 1].usia == cari) i--;
        while (j < idx - 1 && listDsn[j + 1].usia == cari) j++;
    
        System.out.println("Data Dosen dengan Usia " + cari + " ditemukan:");
        for (int k = i; k <= j; k++) {
            System.out.println("- Indeks " + k);
            listDsn[k].tampilInformasi();
            
            if (j > i && k == i) { 
                System.out.println("Data usia yang dicari lebih dari 1");
            }
        }
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
    void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data Dosen dengan Usia " + x + " ditemukan pada indeks " + pos);
            listDsn[pos].tampilInformasi();
        } else {
            System.out.println("Data dengan Usia " + x + " tidak ditemukan.");
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
