import java.util.Scanner;

public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int bykNilai = sc.nextInt();
        int[] arrNilai = new int[bykNilai];
        int key = 0;
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) { 
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil == -1) {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        } else {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        }
        System.out.println();
    }
}
