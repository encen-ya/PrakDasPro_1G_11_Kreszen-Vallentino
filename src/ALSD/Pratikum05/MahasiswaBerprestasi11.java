package ALSD.Pratikum05;

import java.util.Scanner;

public class MahasiswaBerprestasi11 {
    Scanner sc = new Scanner(System.in);
    Mahasiswa11 listMhs[] = new Mahasiswa11[5];
    int idx;


void tambah(Mahasiswa11 m) {
    if (idx < listMhs.length) {
        listMhs[idx] = m;
        System.out.println("Masukkan data mahasiswa ke-" + (idx + 1));
        System.out.print("Masukkan Nim Mahasiswa : ");
        m.nim = sc.nextLine();
        System.out.print("Masukkan Nama Mahasiswa : ");
        m.nama = sc.nextLine();
        System.out.print("Masukkan Kelas Mahasiswa : ");
        m.kelas = sc.nextLine();
        System.out.print("Masukkan IPK Mahasiswa : ");
        m.ipk = sc.nextDouble();
        sc.nextLine();
        System.out.println("=====================================");
        idx++;
    } else {
        System.out.println("Data Sudah Penuh");
    }
}
void tampil() {
    for (Mahasiswa11 m : listMhs) {
        m.tampilInformasi();
        System.out.println("------------------------------------");
    }
}

void bubbleSort() {
    for (int i = 0; i < listMhs.length - 1; i++) {
        for (int j = 1; j < listMhs.length - i; j++) {
            if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                Mahasiswa11 tmp = listMhs[j];
                listMhs[j] = listMhs[j - 1];
                listMhs[j - 1] = tmp;
            }
        }
    }
}

void selectionSort() {
    for (int i = 0; i < listMhs.length - 1; i++) {
        int idxMin = i;
        for (int j = i + 1; j < listMhs.length; j++) {
            if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                idxMin = j;
            }
        }
        Mahasiswa11 tmp = listMhs[idxMin];
        listMhs[idxMin] = listMhs[i];
        listMhs[i] = tmp;
    }
}
void insertionSort() {
    for (int i = 1; i < listMhs.length; i++) {
        Mahasiswa11 temp = listMhs[i];
        int j = i;
        while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
            listMhs[j] = listMhs[j - 1];
            j--;
        }
        listMhs[j] = temp;
    }
}


}
