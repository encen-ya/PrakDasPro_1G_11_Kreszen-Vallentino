import java.util.Scanner;
public class P11_Tugas1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[][] hasilSurvei = new int[10][6];

    for (int i = 0; i < 10; i++) {
    System.out.println("Masukkan jawaban untuk Responden " + (i + 1) + ":");
    for (int j = 0; j < 6; j++) {
        System.out.print("Pertanyaan " + (j + 1) + " (nilai 1-5): ");
        hasilSurvei[i][j] = sc.nextInt();  
    }
    System.out.println();
}

    }
}
