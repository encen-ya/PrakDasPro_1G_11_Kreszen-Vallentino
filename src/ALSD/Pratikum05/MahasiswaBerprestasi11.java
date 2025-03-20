package ALSD.Pratikum05;

import java.util.Scanner;

public class MahasiswaBerprestasi11 {
    Scanner sc = new Scanner(System.in);
    Mahasiswa11 listMhs[] = new Mahasiswa11[5];
    int idx;


void tambah(Mahasiswa11 m) {
    if (idx < listMhs.length) {
        listMhs[idx] = m;
        System.out.println("Masukkan data mahasiswa");
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


}
