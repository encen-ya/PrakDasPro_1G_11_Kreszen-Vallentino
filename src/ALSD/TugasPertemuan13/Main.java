package ALSD.TugasPertemuan13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();

        while (true) {
            System.out.println("=========================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=========================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            if (menu == 10) break;

            switch (menu) {
                case 1, 2, 3 : {
                    System.out.print("ID Film: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Judul Film: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double rating = sc.nextDouble();
                    Film film = new Film(id, judul, rating);
                    if (menu == 1) list.addFirst(film);
                    else if (menu == 2) list.addLast(film);
                    else {
                        System.out.print("Urutan ke-: ");
                        int index = sc.nextInt();
                        list.add(film, index);
                    }
                }
                case 4 : list.removeFirst();
                case 5 : list.removeLast();
                case 6 : {
                    System.out.print("Urutan ke-: ");
                    int index = sc.nextInt();
                    list.remove(index);
                }
                case 7 : list.print();
                case 8 : {
                    System.out.print("Masukkan ID Film yang dicari: ");
                    int idCari = sc.nextInt();
                    list.search(idCari);
                }
                case 9 : {
                    list.sortingDesc();
                    System.out.println("Data telah diurutkan secara descending berdasarkan rating.");
                }
                default :
                break;
            }
        }
    }
}

