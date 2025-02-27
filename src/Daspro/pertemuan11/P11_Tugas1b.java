import java.util.Scanner;

public class P11_Tugas1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] hasilSurvei = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan jawaban untuk Responden " + (i + 1) + ":");
            int nilaiResponden = 0; 
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " (nilai 1-5): ");
                hasilSurvei[i][j] = scanner.nextInt();
                nilaiResponden += hasilSurvei[i][j]; 
            }
            double rataResponden = nilaiResponden / 6.0;  
            System.out.println("Rata-rata skor untuk Responden " + (i + 1) + ": " + rataRataResponden);
            System.out.println(); 
        }
    }
}
